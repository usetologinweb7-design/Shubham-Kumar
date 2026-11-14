package com.example.data.repository

import com.example.data.catalog.RecipeCatalog
import com.example.data.local.*
import com.example.data.model.AppLanguage
import com.example.data.model.DirectoryEntry
import com.example.data.model.Recipe
import com.example.data.model.RecipeRatingSummary
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class RecipeRepository(
    private val dao: RasoiDao,
    private val prefs: UserPreferencesRepository
) {
    val allRecipes: List<Recipe> = RecipeCatalog.allRecipes
    val fiveMinuteRecipes: List<Recipe> = RecipeCatalog.fiveMinuteRecipes
    val popularRecipes: List<Recipe> = RecipeCatalog.popularRecipes
    val trendingRecipes: List<Recipe> = RecipeCatalog.trendingRecipes
    val fullDirectory: List<DirectoryEntry> = RecipeCatalog.fullDishDirectory

    fun getRecipeById(id: String): Recipe? = RecipeCatalog.getById(id)

    val isDarkMode: Flow<Boolean> = prefs.isDarkMode
    val language: Flow<AppLanguage> = prefs.language

    val favoriteIds: Flow<Set<String>> = dao.getAllFavorites().map { list ->
        list.map { it.recipeId }.toSet()
    }

    val favoriteRecipes: Flow<List<Recipe>> = dao.getAllFavorites().map { list ->
        list.mapNotNull { RecipeCatalog.getById(it.recipeId) }
    }

    val recentlyViewedRecipes: Flow<List<Recipe>> = dao.getRecentlyViewed().map { list ->
        list.mapNotNull { RecipeCatalog.getById(it.recipeId) }
    }

    val ratingSummaries: Flow<Map<String, RecipeRatingSummary>> = dao.getAllReviews().map { reviews ->
        reviews.groupBy { it.recipeId }.mapValues { (_, list) ->
            RecipeRatingSummary(
                averageRating = list.map { it.rating }.average(),
                reviewCount = list.size
            )
        }
    }

    val totalUserReviewsCount: Flow<Int> = dao.getAllReviews().map { it.size }

    fun getReviewsForRecipe(recipeId: String): Flow<List<ReviewEntity>> =
        dao.getReviewsForRecipe(recipeId)

    fun getIngredientChecks(recipeId: String): Flow<Map<Int, Boolean>> =
        dao.getIngredientChecks(recipeId).map { list ->
            list.associate { it.ingredientIndex to it.isChecked }
        }

    suspend fun toggleFavorite(recipeId: String, currentlyFavorite: Boolean) {
        if (currentlyFavorite) {
            dao.deleteFavorite(recipeId)
        } else {
            dao.insertFavorite(FavoriteEntity(recipeId = recipeId))
        }
    }

    suspend fun clearAllFavorites() {
        dao.clearAllFavorites()
    }

    suspend fun recordViewed(recipeId: String) {
        dao.upsertRecentlyViewed(RecentlyViewedEntity(recipeId = recipeId, viewedAt = System.currentTimeMillis()))
    }

    suspend fun addReview(recipeId: String, reviewerName: String, rating: Int, comment: String) {
        dao.insertReview(
            ReviewEntity(
                recipeId = recipeId,
                reviewerName = reviewerName.trim().ifEmpty { "Home Chef" },
                rating = rating.coerceIn(1, 5),
                comment = comment.trim()
            )
        )
    }

    suspend fun setIngredientChecked(recipeId: String, index: Int, checked: Boolean) {
        dao.upsertIngredientCheck(IngredientCheckEntity(recipeId, index, checked))
    }

    suspend fun clearIngredientChecks(recipeId: String) {
        dao.clearIngredientChecks(recipeId)
    }

    suspend fun setDarkMode(enabled: Boolean) = prefs.setDarkMode(enabled)

    suspend fun setLanguage(language: AppLanguage) = prefs.setLanguage(language)
}
