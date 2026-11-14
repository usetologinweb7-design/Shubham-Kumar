package com.example.ui

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material.icons.outlined.Search
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.data.model.AppLanguage
import com.example.ui.screens.*
import com.example.ui.theme.RasoiGuruTheme
import com.example.ui.viewmodel.MainViewModel

object RasoiRoutes {
    const val SPLASH = "splash"
    const val HOME = "home"
    const val EXPLORE = "explore"
    const val FAVORITES = "favorites"
    const val PROFILE = "profile"
    const val DETAIL = "detail/{recipeId}"
    const val STEPS = "steps/{recipeId}"

    fun detail(recipeId: String) = "detail/$recipeId"
    fun steps(recipeId: String) = "steps/$recipeId"
}

private data class BottomNavItem(
    val route: String,
    val labelHi: String,
    val labelEn: String,
    val selectedIcon: ImageVector,
    val unselectedIcon: ImageVector,
    val testTag: String
)

private val bottomNavItems = listOf(
    BottomNavItem(
        route = RasoiRoutes.HOME,
        labelHi = "होम",
        labelEn = "Home",
        selectedIcon = Icons.Filled.Home,
        unselectedIcon = Icons.Outlined.Home,
        testTag = "nav_home"
    ),
    BottomNavItem(
        route = RasoiRoutes.EXPLORE,
        labelHi = "एक्सप्लोर",
        labelEn = "Explore",
        selectedIcon = Icons.Filled.Search,
        unselectedIcon = Icons.Outlined.Search,
        testTag = "nav_explore"
    ),
    BottomNavItem(
        route = RasoiRoutes.FAVORITES,
        labelHi = "फेवरेट",
        labelEn = "Favorites",
        selectedIcon = Icons.Filled.Favorite,
        unselectedIcon = Icons.Outlined.FavoriteBorder,
        testTag = "nav_favorites"
    ),
    BottomNavItem(
        route = RasoiRoutes.PROFILE,
        labelHi = "प्रोफ़ाइल",
        labelEn = "Profile",
        selectedIcon = Icons.Filled.Person,
        unselectedIcon = Icons.Outlined.Person,
        testTag = "nav_profile"
    )
)

@Composable
fun RasoiGuruApp(
    mainViewModel: MainViewModel = viewModel()
) {
    val isDarkMode by mainViewModel.isDarkMode.collectAsStateWithLifecycle()
    val language by mainViewModel.language.collectAsStateWithLifecycle()
    val favoriteIds by mainViewModel.favoriteIds.collectAsStateWithLifecycle()
    val favoriteRecipes by mainViewModel.favoriteRecipes.collectAsStateWithLifecycle()
    val recentlyViewedRecipes by mainViewModel.recentlyViewedRecipes.collectAsStateWithLifecycle()
    val ratingSummaries by mainViewModel.ratingSummaries.collectAsStateWithLifecycle()
    val totalReviewsCount by mainViewModel.totalReviewsCount.collectAsStateWithLifecycle()
    val filterState by mainViewModel.filterState.collectAsStateWithLifecycle()
    val filteredRecipes by mainViewModel.filteredRecipes.collectAsStateWithLifecycle()
    val filteredDirectory by mainViewModel.filteredDirectory.collectAsStateWithLifecycle()

    val navController = rememberNavController()
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentDestination = navBackStackEntry?.destination
    val currentRoute = currentDestination?.route

    val showTopLevelNav = currentRoute in listOf(
        RasoiRoutes.HOME,
        RasoiRoutes.EXPLORE,
        RasoiRoutes.FAVORITES,
        RasoiRoutes.PROFILE
    )

    val navigateTopTab: (String) -> Unit = { route ->
        navController.navigate(route) {
            popUpTo(RasoiRoutes.HOME) { saveState = true }
            launchSingleTop = true
            restoreState = true
        }
    }

    val openRecipeDetail: (String) -> Unit = { recipeId ->
        mainViewModel.recordViewed(recipeId)
        navController.navigate(RasoiRoutes.detail(recipeId))
    }

    RasoiGuruTheme(darkTheme = isDarkMode) {
        BoxWithConstraints(modifier = Modifier.fillMaxSize()) {
            val useNavRail = maxWidth >= 840.dp && showTopLevelNav

            Scaffold(
                contentWindowInsets = WindowInsets(0, 0, 0, 0),
                bottomBar = {
                    if (showTopLevelNav && !useNavRail) {
                        NavigationBar(
                            containerColor = MaterialTheme.colorScheme.surface,
                            tonalElevation = 6.dp
                        ) {
                            bottomNavItems.forEach { item ->
                                val selected = currentDestination?.hierarchy?.any { it.route == item.route } == true
                                NavigationBarItem(
                                    selected = selected,
                                    onClick = { navigateTopTab(item.route) },
                                    icon = {
                                        Icon(
                                            imageVector = if (selected) item.selectedIcon else item.unselectedIcon,
                                            contentDescription = item.labelEn
                                        )
                                    },
                                    label = {
                                        Text(
                                            text = if (language == AppLanguage.HINDI) item.labelHi else item.labelEn,
                                            fontWeight = if (selected) FontWeight.Bold else FontWeight.Medium,
                                            maxLines = 1
                                        )
                                    },
                                    colors = NavigationBarItemDefaults.colors(
                                        selectedIconColor = MaterialTheme.colorScheme.primary,
                                        selectedTextColor = MaterialTheme.colorScheme.primary,
                                        indicatorColor = MaterialTheme.colorScheme.primaryContainer
                                    ),
                                    modifier = Modifier.testTag(item.testTag)
                                )
                            }
                        }
                    }
                }
            ) { innerPadding ->
                Row(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(innerPadding)
                ) {
                    if (useNavRail) {
                        NavigationRail(
                            containerColor = MaterialTheme.colorScheme.surface
                        ) {
                            Spacer(modifier = Modifier.height(16.dp))
                            bottomNavItems.forEach { item ->
                                val selected = currentDestination?.hierarchy?.any { it.route == item.route } == true
                                NavigationRailItem(
                                    selected = selected,
                                    onClick = { navigateTopTab(item.route) },
                                    icon = {
                                        Icon(
                                            imageVector = if (selected) item.selectedIcon else item.unselectedIcon,
                                            contentDescription = item.labelEn
                                        )
                                    },
                                    label = {
                                        Text(
                                            text = if (language == AppLanguage.HINDI) item.labelHi else item.labelEn,
                                            maxLines = 1
                                        )
                                    },
                                    modifier = Modifier.testTag("rail_${item.testTag}")
                                )
                            }
                        }
                    }

                    NavHost(
                        navController = navController,
                        startDestination = RasoiRoutes.SPLASH,
                        modifier = Modifier.weight(1f)
                    ) {
                        composable(RasoiRoutes.SPLASH) {
                            SplashScreen(
                                onFinished = {
                                    navController.navigate(RasoiRoutes.HOME) {
                                        popUpTo(RasoiRoutes.SPLASH) { inclusive = true }
                                        launchSingleTop = true
                                    }
                                }
                            )
                        }

                        composable(RasoiRoutes.HOME) {
                            HomeScreen(
                                language = language,
                                fiveMinuteRecipes = mainViewModel.fiveMinuteRecipes,
                                popularRecipes = mainViewModel.popularRecipes,
                                trendingRecipes = mainViewModel.trendingRecipes,
                                recentlyViewedRecipes = recentlyViewedRecipes,
                                favoriteRecipes = favoriteRecipes,
                                favoriteIds = favoriteIds,
                                ratingSummaries = ratingSummaries,
                                onToggleLanguage = { mainViewModel.toggleLanguage() },
                                onOpenSearch = {
                                    mainViewModel.clearAllFilters()
                                    navigateTopTab(RasoiRoutes.EXPLORE)
                                },
                                onCountryClick = { country ->
                                    mainViewModel.applyQuickPreset(country = country)
                                    navigateTopTab(RasoiRoutes.EXPLORE)
                                },
                                onCategoryClick = { category ->
                                    mainViewModel.applyQuickPreset(category = category)
                                    navigateTopTab(RasoiRoutes.EXPLORE)
                                },
                                onTimeFilterClick = { mins ->
                                    mainViewModel.applyQuickPreset(maxMinutes = mins)
                                    navigateTopTab(RasoiRoutes.EXPLORE)
                                },
                                onSeeAllFiveMinClick = {
                                    mainViewModel.applyQuickPreset(maxMinutes = 5)
                                    navigateTopTab(RasoiRoutes.EXPLORE)
                                },
                                onSeeAllFavoritesClick = {
                                    navigateTopTab(RasoiRoutes.FAVORITES)
                                },
                                onRecipeClick = { recipe -> openRecipeDetail(recipe.id) },
                                onToggleFavorite = { mainViewModel.toggleFavorite(it) }
                            )
                        }

                        composable(RasoiRoutes.EXPLORE) {
                            ExploreScreen(
                                language = language,
                                filterState = filterState,
                                filteredRecipes = filteredRecipes,
                                filteredDirectory = filteredDirectory,
                                favoriteIds = favoriteIds,
                                ratingSummaries = ratingSummaries,
                                onQueryChange = { mainViewModel.updateSearchQuery(it) },
                                onTimeToggle = { mainViewModel.setMaxMinutes(it) },
                                onCountryToggle = { mainViewModel.setCountryFilter(it) },
                                onCategoryToggle = { mainViewModel.setCategoryFilter(it) },
                                onMealTimeToggle = { mainViewModel.setMealTimeFilter(it) },
                                onVegFilterToggle = { mainViewModel.setVegFilter(it) },
                                onEasyToggle = { mainViewModel.toggleEasyOnly() },
                                onClearFilters = { mainViewModel.clearAllFilters() },
                                onRecipeClick = { recipe -> openRecipeDetail(recipe.id) },
                                onRecipeIdClick = { recipeId -> openRecipeDetail(recipeId) },
                                onToggleFavorite = { mainViewModel.toggleFavorite(it) }
                            )
                        }

                        composable(RasoiRoutes.FAVORITES) {
                            FavoritesScreen(
                                language = language,
                                favoriteRecipes = favoriteRecipes,
                                ratingSummaries = ratingSummaries,
                                onRecipeClick = { recipe -> openRecipeDetail(recipe.id) },
                                onRemoveFavorite = { mainViewModel.toggleFavorite(it) },
                                onClearAll = { mainViewModel.clearAllFavorites() },
                                onExploreClick = { navigateTopTab(RasoiRoutes.EXPLORE) }
                            )
                        }

                        composable(RasoiRoutes.PROFILE) {
                            ProfileScreen(
                                language = language,
                                isDarkMode = isDarkMode,
                                favoriteCount = favoriteRecipes.size,
                                recentlyViewedRecipes = recentlyViewedRecipes,
                                totalReviewsCount = totalReviewsCount,
                                onToggleDarkMode = { mainViewModel.setDarkMode(it) },
                                onSetLanguage = { mainViewModel.setLanguage(it) },
                                onOpenFavorites = { navigateTopTab(RasoiRoutes.FAVORITES) },
                                onRecipeClick = { recipe -> openRecipeDetail(recipe.id) }
                            )
                        }

                        composable(
                            route = RasoiRoutes.DETAIL,
                            arguments = listOf(navArgument("recipeId") { type = NavType.StringType })
                        ) { backStackEntry ->
                            val recipeId = backStackEntry.arguments?.getString("recipeId").orEmpty()
                            val recipe = mainViewModel.getRecipeById(recipeId)
                            if (recipe != null) {
                                val reviews by mainViewModel.observeReviews(recipeId)
                                    .collectAsStateWithLifecycle(initialValue = emptyList())
                                val checks by mainViewModel.observeIngredientChecks(recipeId)
                                    .collectAsStateWithLifecycle(initialValue = emptyMap())

                                RecipeDetailScreen(
                                    recipe = recipe,
                                    language = language,
                                    isFavorite = favoriteIds.contains(recipe.id),
                                    ratingSummary = ratingSummaries[recipe.id],
                                    reviews = reviews,
                                    ingredientChecks = checks,
                                    onBack = { navController.popBackStack() },
                                    onToggleFavorite = { mainViewModel.toggleFavorite(recipe.id) },
                                    onToggleIngredient = { index, checked ->
                                        mainViewModel.toggleIngredientCheck(recipe.id, index, checked)
                                    },
                                    onStartCooking = {
                                        navController.navigate(RasoiRoutes.steps(recipe.id))
                                    },
                                    onSubmitReview = { name, rating, comment ->
                                        mainViewModel.submitReview(recipe.id, name, rating, comment)
                                    }
                                )
                            } else {
                                LaunchedEffect(Unit) { navController.popBackStack() }
                            }
                        }

                        composable(
                            route = RasoiRoutes.STEPS,
                            arguments = listOf(navArgument("recipeId") { type = NavType.StringType })
                        ) { backStackEntry ->
                            val recipeId = backStackEntry.arguments?.getString("recipeId").orEmpty()
                            val recipe = mainViewModel.getRecipeById(recipeId)
                            if (recipe != null) {
                                CookingStepsScreen(
                                    recipe = recipe,
                                    language = language,
                                    onBack = { navController.popBackStack() },
                                    onFinishToDetail = { navController.popBackStack() }
                                )
                            } else {
                                LaunchedEffect(Unit) { navController.popBackStack() }
                            }
                        }
                    }
                }
            }
        }
    }
}
