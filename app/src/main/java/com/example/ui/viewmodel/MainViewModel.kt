package com.example.ui.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.example.data.local.RasoiDatabase
import com.example.data.local.ReviewEntity
import com.example.data.local.UserPreferencesRepository
import com.example.data.model.*
import com.example.data.repository.RecipeRepository
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch

enum class VegFilter { ALL, VEG, NON_VEG }

data class ExploreFilterState(
    val query: String = "",
    val maxMinutes: Int? = null,
    val selectedCountry: Country? = null,
    val selectedCategory: FoodCategory? = null,
    val selectedMealTime: MealTime? = null,
    val vegFilter: VegFilter = VegFilter.ALL,
    val easyOnly: Boolean = false
)

class MainViewModel(application: Application) : AndroidViewModel(application) {

    private val repository = RecipeRepository(
        dao = RasoiDatabase.getInstance(application).rasoiDao(),
        prefs = UserPreferencesRepository(application)
    )

    val isDarkMode: StateFlow<Boolean> = repository.isDarkMode.stateIn(
        viewModelScope, SharingStarted.WhileSubscribed(5000), false
    )

    val language: StateFlow<AppLanguage> = repository.language.stateIn(
        viewModelScope, SharingStarted.WhileSubscribed(5000), AppLanguage.HINDI
    )

    val favoriteIds: StateFlow<Set<String>> = repository.favoriteIds.stateIn(
        viewModelScope, SharingStarted.WhileSubscribed(5000), emptySet()
    )

    val favoriteRecipes: StateFlow<List<Recipe>> = repository.favoriteRecipes.stateIn(
        viewModelScope, SharingStarted.WhileSubscribed(5000), emptyList()
    )

    val recentlyViewedRecipes: StateFlow<List<Recipe>> = repository.recentlyViewedRecipes.stateIn(
        viewModelScope, SharingStarted.WhileSubscribed(5000), emptyList()
    )

    val ratingSummaries: StateFlow<Map<String, RecipeRatingSummary>> = repository.ratingSummaries.stateIn(
        viewModelScope, SharingStarted.WhileSubscribed(5000), emptyMap()
    )

    val totalReviewsCount: StateFlow<Int> = repository.totalUserReviewsCount.stateIn(
        viewModelScope, SharingStarted.WhileSubscribed(5000), 0
    )

    private val _filterState = MutableStateFlow(ExploreFilterState())
    val filterState: StateFlow<ExploreFilterState> = _filterState.asStateFlow()

    val filteredRecipes: StateFlow<List<Recipe>> = _filterState.map { filter ->
        applyFilters(repository.allRecipes, filter)
    }.stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000), repository.allRecipes)

    val filteredDirectory: StateFlow<List<DirectoryEntry>> = _filterState.map { filter ->
        val q = filter.query.trim()
        repository.fullDirectory.filter { entry ->
            val countryOk = filter.selectedCountry == null || entry.country == filter.selectedCountry
            val catOk = filter.selectedCategory == null || entry.category == filter.selectedCategory
            val queryOk = q.isEmpty() ||
                entry.nameEn.contains(q, ignoreCase = true) ||
                entry.nameHi.contains(q, ignoreCase = true) ||
                entry.country.nameEn.contains(q, ignoreCase = true) ||
                entry.country.nameHi.contains(q, ignoreCase = true) ||
                entry.category.nameEn.contains(q, ignoreCase = true) ||
                entry.category.nameHi.contains(q, ignoreCase = true)
            countryOk && catOk && queryOk
        }
    }.stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000), repository.fullDirectory)

    val allRecipes: List<Recipe> = repository.allRecipes
    val fiveMinuteRecipes: List<Recipe> = repository.fiveMinuteRecipes
    val popularRecipes: List<Recipe> = repository.popularRecipes
    val trendingRecipes: List<Recipe> = repository.trendingRecipes

    fun getRecipeById(id: String): Recipe? = repository.getRecipeById(id)

    fun observeReviews(recipeId: String): Flow<List<ReviewEntity>> =
        repository.getReviewsForRecipe(recipeId)

    fun observeIngredientChecks(recipeId: String): Flow<Map<Int, Boolean>> =
        repository.getIngredientChecks(recipeId)

    fun toggleFavorite(recipeId: String) {
        val current = favoriteIds.value.contains(recipeId)
        viewModelScope.launch {
            repository.toggleFavorite(recipeId, current)
        }
    }

    fun clearAllFavorites() {
        viewModelScope.launch {
            repository.clearAllFavorites()
        }
    }

    fun recordViewed(recipeId: String) {
        viewModelScope.launch {
            repository.recordViewed(recipeId)
        }
    }

    fun submitReview(recipeId: String, reviewerName: String, rating: Int, comment: String) {
        viewModelScope.launch {
            repository.addReview(recipeId, reviewerName, rating, comment)
        }
    }

    fun toggleIngredientCheck(recipeId: String, index: Int, checked: Boolean) {
        viewModelScope.launch {
            repository.setIngredientChecked(recipeId, index, checked)
        }
    }

    fun clearIngredientChecks(recipeId: String) {
        viewModelScope.launch {
            repository.clearIngredientChecks(recipeId)
        }
    }

    fun setDarkMode(enabled: Boolean) {
        viewModelScope.launch {
            repository.setDarkMode(enabled)
        }
    }

    fun toggleLanguage() {
        val next = if (language.value == AppLanguage.HINDI) AppLanguage.ENGLISH else AppLanguage.HINDI
        setLanguage(next)
    }

    fun setLanguage(lang: AppLanguage) {
        viewModelScope.launch {
            repository.setLanguage(lang)
        }
    }

    fun updateSearchQuery(query: String) {
        _filterState.update { it.copy(query = query) }
    }

    fun setMaxMinutes(minutes: Int?) {
        _filterState.update { it.copy(maxMinutes = if (it.maxMinutes == minutes) null else minutes) }
    }

    fun setCountryFilter(country: Country?) {
        _filterState.update { it.copy(selectedCountry = if (it.selectedCountry == country) null else country) }
    }

    fun setCategoryFilter(category: FoodCategory?) {
        _filterState.update { it.copy(selectedCategory = if (it.selectedCategory == category) null else category) }
    }

    fun setMealTimeFilter(mealTime: MealTime?) {
        _filterState.update { it.copy(selectedMealTime = if (it.selectedMealTime == mealTime) null else mealTime) }
    }

    fun setVegFilter(vegFilter: VegFilter) {
        _filterState.update { it.copy(vegFilter = if (it.vegFilter == vegFilter) VegFilter.ALL else vegFilter) }
    }

    fun toggleEasyOnly() {
        _filterState.update { it.copy(easyOnly = !it.easyOnly) }
    }

    fun clearAllFilters() {
        _filterState.value = ExploreFilterState()
    }

    fun applyQuickPreset(
        country: Country? = null,
        category: FoodCategory? = null,
        maxMinutes: Int? = null,
        query: String = ""
    ) {
        _filterState.value = ExploreFilterState(
            query = query,
            maxMinutes = maxMinutes,
            selectedCountry = country,
            selectedCategory = category
        )
    }

    private fun applyFilters(recipes: List<Recipe>, filter: ExploreFilterState): List<Recipe> {
        val q = filter.query.trim()
        return recipes.filter { recipe ->
            val matchesQuery = q.isEmpty() ||
                recipe.nameEn.contains(q, ignoreCase = true) ||
                recipe.nameHi.contains(q, ignoreCase = true) ||
                recipe.country.nameEn.contains(q, ignoreCase = true) ||
                recipe.country.nameHi.contains(q, ignoreCase = true) ||
                recipe.category.nameEn.contains(q, ignoreCase = true) ||
                recipe.category.nameHi.contains(q, ignoreCase = true) ||
                recipe.ingredients.any {
                    it.nameEn.contains(q, ignoreCase = true) || it.nameHi.contains(q, ignoreCase = true)
                }

            val matchesTime = filter.maxMinutes == null || recipe.totalMinutes <= filter.maxMinutes
            val matchesCountry = filter.selectedCountry == null || recipe.country == filter.selectedCountry
            val matchesCategory = filter.selectedCategory == null || recipe.category == filter.selectedCategory
            val matchesMeal = filter.selectedMealTime == null || filter.selectedMealTime in recipe.mealTimes
            val matchesVeg = when (filter.vegFilter) {
                VegFilter.ALL -> true
                VegFilter.VEG -> recipe.isVeg
                VegFilter.NON_VEG -> !recipe.isVeg
            }
            val matchesEasy = !filter.easyOnly || recipe.difficulty == Difficulty.EASY

            matchesQuery && matchesTime && matchesCountry && matchesCategory && matchesMeal && matchesVeg && matchesEasy
        }
    }
}
