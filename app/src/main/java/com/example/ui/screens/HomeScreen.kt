package com.example.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.Bolt
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.LocalFireDepartment
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Translate
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.R
import com.example.data.model.*
import com.example.ui.components.*
import com.example.ui.theme.DeepBrown
import com.example.ui.theme.TerracottaOrange

@Composable
fun HomeScreen(
    language: AppLanguage,
    fiveMinuteRecipes: List<Recipe>,
    popularRecipes: List<Recipe>,
    trendingRecipes: List<Recipe>,
    recentlyViewedRecipes: List<Recipe>,
    favoriteRecipes: List<Recipe>,
    favoriteIds: Set<String>,
    ratingSummaries: Map<String, RecipeRatingSummary>,
    onToggleLanguage: () -> Unit,
    onOpenSearch: () -> Unit,
    onCountryClick: (Country) -> Unit,
    onCategoryClick: (FoodCategory) -> Unit,
    onTimeFilterClick: (Int) -> Unit,
    onSeeAllFiveMinClick: () -> Unit,
    onSeeAllFavoritesClick: () -> Unit,
    onRecipeClick: (Recipe) -> Unit,
    onToggleFavorite: (String) -> Unit,
    modifier: Modifier = Modifier
) {
    val isHindi = language == AppLanguage.HINDI
    val timeBuckets = listOf(5, 10, 15, 30, 45, 60)

    LazyColumn(
        contentPadding = PaddingValues(bottom = 24.dp),
        modifier = modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
            .testTag("home_screen")
    ) {
        // Top Brand Bar
        item {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .fillMaxWidth()
                    .statusBarsPadding()
                    .padding(horizontal = 16.dp, vertical = 10.dp)
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    RasoiChefEmblem(size = 38.dp)
                    Spacer(modifier = Modifier.width(10.dp))
                    RasoiWordmark(fontSize = 23.sp)
                }
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Surface(
                        shape = RoundedCornerShape(20.dp),
                        color = MaterialTheme.colorScheme.primaryContainer,
                        modifier = Modifier
                            .clip(RoundedCornerShape(20.dp))
                            .clickable(onClick = onToggleLanguage)
                            .testTag("home_language_toggle")
                    ) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier.padding(horizontal = 10.dp, vertical = 6.dp)
                        ) {
                            Icon(
                                imageVector = Icons.Filled.Translate,
                                contentDescription = "Switch language",
                                tint = MaterialTheme.colorScheme.primary,
                                modifier = Modifier.size(16.dp)
                            )
                            Spacer(modifier = Modifier.width(4.dp))
                            Text(
                                text = if (isHindi) "हिंदी" else "EN",
                                style = MaterialTheme.typography.labelMedium,
                                color = MaterialTheme.colorScheme.onPrimaryContainer,
                                fontWeight = FontWeight.Bold
                            )
                        }
                    }
                    Spacer(modifier = Modifier.width(4.dp))
                    IconButton(
                        onClick = onOpenSearch,
                        modifier = Modifier.testTag("home_search_icon_button")
                    ) {
                        Icon(
                            imageVector = Icons.Filled.Search,
                            contentDescription = "Search recipes",
                            tint = MaterialTheme.colorScheme.onBackground
                        )
                    }
                }
            }
        }

        // Hero Welcome Banner
        item {
            Box(
                modifier = Modifier
                    .padding(horizontal = 16.dp)
                    .fillMaxWidth()
                    .height(156.dp)
                    .clip(RoundedCornerShape(22.dp))
                    .clickable(onClick = onOpenSearch)
                    .testTag("home_welcome_banner")
            ) {
                Image(
                    painter = painterResource(id = R.drawable.img_hero_banner_1794638375978),
                    contentDescription = "Rasoi Guru welcome banner",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.fillMaxSize()
                )
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(
                            Brush.horizontalGradient(
                                colors = listOf(
                                    Color(0xEE3B1A09),
                                    Color(0xAA4A2511),
                                    Color.Transparent
                                )
                            )
                        )
                )
                Column(
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier
                        .fillMaxHeight()
                        .fillMaxWidth(0.62f)
                        .padding(18.dp)
                ) {
                    Surface(
                        shape = RoundedCornerShape(10.dp),
                        color = TerracottaOrange.copy(alpha = 0.92f)
                    ) {
                        Text(
                            text = if (isHindi) "शुरुआती कुकिंग गाइड" else "Beginner Friendly",
                            style = MaterialTheme.typography.labelSmall,
                            color = Color.White,
                            modifier = Modifier.padding(horizontal = 8.dp, vertical = 3.dp)
                        )
                    }
                    Spacer(modifier = Modifier.height(8.dp))
                    Text(
                        text = if (isHindi) "हर किसी के लिए\nआसान Cooking" else "Easy Cooking\nFor Everyone",
                        style = MaterialTheme.typography.titleLarge,
                        color = Color.White,
                        fontWeight = FontWeight.Bold
                    )
                    Spacer(modifier = Modifier.height(4.dp))
                    Text(
                        text = if (isHindi) "फोटो के साथ स्टेप-बाय-स्टेप सीखें" else "Visual step-by-step recipes",
                        style = MaterialTheme.typography.bodySmall,
                        color = Color.White.copy(alpha = 0.88f)
                    )
                }
            }
            Spacer(modifier = Modifier.height(14.dp))
        }

        // Search Pill Bar
        item {
            Surface(
                shape = RoundedCornerShape(28.dp),
                color = MaterialTheme.colorScheme.surface,
                shadowElevation = 2.dp,
                tonalElevation = 1.dp,
                modifier = Modifier
                    .padding(horizontal = 16.dp)
                    .fillMaxWidth()
                    .height(52.dp)
                    .clip(RoundedCornerShape(28.dp))
                    .clickable(onClick = onOpenSearch)
                    .testTag("home_search_bar")
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.padding(horizontal = 16.dp)
                ) {
                    Icon(
                        imageVector = Icons.Filled.Search,
                        contentDescription = null,
                        tint = MaterialTheme.colorScheme.primary
                    )
                    Spacer(modifier = Modifier.width(12.dp))
                    Text(
                        text = if (isHindi) "आज क्या बनाना है?" else "What would you like to cook today?",
                        style = MaterialTheme.typography.bodyMedium,
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                }
            }
            Spacer(modifier = Modifier.height(20.dp))
        }

        // International Food Collection
        item {
            SectionHeader(
                title = if (isHindi) "🔥 देशों की रेसिपी" else "🌍 International Collection",
                actionText = if (isHindi) "देखें" else "See all",
                onActionClick = onOpenSearch
            )
            LazyRow(
                contentPadding = PaddingValues(horizontal = 16.dp),
                horizontalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                items(Country.entries, key = { it.code }) { country ->
                    CountryCard(
                        country = country,
                        language = language,
                        onClick = { onCountryClick(country) }
                    )
                }
            }
            Spacer(modifier = Modifier.height(22.dp))
        }

        // Special 5-Minute Recipes Section
        item {
            SectionHeader(
                title = if (isHindi) "⚡ 5 मिनट में तैयार" else "⚡ Ready in 5 Minutes",
                actionText = if (isHindi) "सभी देखें" else "See all",
                onActionClick = onSeeAllFiveMinClick
            )
            LazyRow(
                contentPadding = PaddingValues(horizontal = 16.dp),
                horizontalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                items(fiveMinuteRecipes, key = { it.id }) { recipe ->
                    RecipeHorizontalCard(
                        recipe = recipe,
                        language = language,
                        isFavorite = favoriteIds.contains(recipe.id),
                        ratingSummary = ratingSummaries[recipe.id],
                        onClick = { onRecipeClick(recipe) },
                        onFavoriteToggle = { onToggleFavorite(recipe.id) }
                    )
                }
            }
            Spacer(modifier = Modifier.height(22.dp))
        }

        // Cooking Time Filters
        item {
            SectionHeader(
                title = if (isHindi) "⏱ समय के अनुसार चुनें" else "⏱ Filter by Cooking Time",
                actionText = null,
                onActionClick = {}
            )
            LazyRow(
                contentPadding = PaddingValues(horizontal = 16.dp),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                items(timeBuckets) { mins ->
                    FilterChip(
                        selected = false,
                        onClick = { onTimeFilterClick(mins) },
                        label = {
                            Text(
                                text = if (isHindi) "$mins मिनट" else "$mins min",
                                style = MaterialTheme.typography.labelLarge
                            )
                        },
                        shape = RoundedCornerShape(14.dp),
                        modifier = Modifier.testTag("home_time_chip_$mins")
                    )
                }
            }
            Spacer(modifier = Modifier.height(20.dp))
        }

        // Food Categories
        item {
            SectionHeader(
                title = if (isHindi) "🍽 फूड कैटेगरी" else "🍽 Food Categories",
                actionText = if (isHindi) "देखें" else "Explore",
                onActionClick = onOpenSearch
            )
            LazyRow(
                contentPadding = PaddingValues(horizontal = 16.dp),
                horizontalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                items(FoodCategory.entries, key = { it.name }) { category ->
                    CategoryPillCard(
                        category = category,
                        language = language,
                        onClick = { onCategoryClick(category) }
                    )
                }
            }
            Spacer(modifier = Modifier.height(22.dp))
        }

        // Popular Recipes
        item {
            SectionHeader(
                title = if (isHindi) "⭐ लोकप्रिय रेसिपी" else "⭐ Popular Recipes",
                actionText = if (isHindi) "देखें" else "See all",
                onActionClick = onOpenSearch
            )
            LazyRow(
                contentPadding = PaddingValues(horizontal = 16.dp),
                horizontalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                items(popularRecipes, key = { "pop_${it.id}" }) { recipe ->
                    RecipeHorizontalCard(
                        recipe = recipe,
                        language = language,
                        isFavorite = favoriteIds.contains(recipe.id),
                        ratingSummary = ratingSummaries[recipe.id],
                        onClick = { onRecipeClick(recipe) },
                        onFavoriteToggle = { onToggleFavorite(recipe.id) }
                    )
                }
            }
            Spacer(modifier = Modifier.height(22.dp))
        }

        // Trending Recipes
        item {
            SectionHeader(
                title = if (isHindi) "🔥 ट्रेंडिंग रेसिपी" else "🔥 Trending Now",
                actionText = if (isHindi) "देखें" else "See all",
                onActionClick = onOpenSearch
            )
            LazyRow(
                contentPadding = PaddingValues(horizontal = 16.dp),
                horizontalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                items(trendingRecipes, key = { "trend_${it.id}" }) { recipe ->
                    RecipeHorizontalCard(
                        recipe = recipe,
                        language = language,
                        isFavorite = favoriteIds.contains(recipe.id),
                        ratingSummary = ratingSummaries[recipe.id],
                        onClick = { onRecipeClick(recipe) },
                        onFavoriteToggle = { onToggleFavorite(recipe.id) }
                    )
                }
            }
            Spacer(modifier = Modifier.height(22.dp))
        }

        // Recently Viewed Section (dynamic)
        if (recentlyViewedRecipes.isNotEmpty()) {
            item {
                SectionHeader(
                    title = if (isHindi) "🕒 हाल में देखी गई रेसिपी" else "🕒 Recently Viewed",
                    actionText = null,
                    onActionClick = {}
                )
                LazyRow(
                    contentPadding = PaddingValues(horizontal = 16.dp),
                    horizontalArrangement = Arrangement.spacedBy(12.dp)
                ) {
                    items(recentlyViewedRecipes, key = { "recent_${it.id}" }) { recipe ->
                        RecipeHorizontalCard(
                            recipe = recipe,
                            language = language,
                            isFavorite = favoriteIds.contains(recipe.id),
                            ratingSummary = ratingSummaries[recipe.id],
                            onClick = { onRecipeClick(recipe) },
                            onFavoriteToggle = { onToggleFavorite(recipe.id) }
                        )
                    }
                }
                Spacer(modifier = Modifier.height(22.dp))
            }
        }

        // Favorite Recipes Preview Section
        item {
            SectionHeader(
                title = if (isHindi) "❤️ मेरी पसंदीदा रेसिपी" else "❤️ Favorite Recipes",
                actionText = if (isHindi) "खोलें" else "View all",
                onActionClick = onSeeAllFavoritesClick
            )
            if (favoriteRecipes.isEmpty()) {
                Card(
                    shape = RoundedCornerShape(18.dp),
                    colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant),
                    modifier = Modifier
                        .padding(horizontal = 16.dp)
                        .fillMaxWidth()
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.padding(16.dp)
                    ) {
                        Surface(
                            shape = CircleShape,
                            color = MaterialTheme.colorScheme.primaryContainer,
                            modifier = Modifier.size(44.dp)
                        ) {
                            Box(contentAlignment = Alignment.Center) {
                                Icon(
                                    imageVector = Icons.Filled.Favorite,
                                    contentDescription = null,
                                    tint = MaterialTheme.colorScheme.primary
                                )
                            }
                        }
                        Spacer(modifier = Modifier.width(12.dp))
                        Column(modifier = Modifier.weight(1f)) {
                            Text(
                                text = if (isHindi) "अपनी पसंदीदा डिश सेव करें" else "Save your favorite dishes",
                                style = MaterialTheme.typography.titleSmall
                            )
                            Text(
                                text = if (isHindi) "किसी भी रेसिपी पर ♥ दबाएं, वह हमेशा के लिए यहाँ सेव हो जाएगी।" else "Tap ♥ on any recipe card to save it offline here.",
                                style = MaterialTheme.typography.bodySmall,
                                color = MaterialTheme.colorScheme.onSurfaceVariant
                            )
                        }
                    }
                }
            } else {
                LazyRow(
                    contentPadding = PaddingValues(horizontal = 16.dp),
                    horizontalArrangement = Arrangement.spacedBy(12.dp)
                ) {
                    items(favoriteRecipes, key = { "home_fav_${it.id}" }) { recipe ->
                        RecipeHorizontalCard(
                            recipe = recipe,
                            language = language,
                            isFavorite = true,
                            ratingSummary = ratingSummaries[recipe.id],
                            onClick = { onRecipeClick(recipe) },
                            onFavoriteToggle = { onToggleFavorite(recipe.id) }
                        )
                    }
                }
            }
        }
    }
}

@Composable
private fun SectionHeader(
    title: String,
    actionText: String?,
    onActionClick: () -> Unit
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 16.dp, end = 12.dp, bottom = 10.dp)
    ) {
        Text(
            text = title,
            style = MaterialTheme.typography.titleMedium,
            color = MaterialTheme.colorScheme.onBackground,
            fontWeight = FontWeight.Bold
        )
        if (actionText != null) {
            TextButton(
                onClick = onActionClick,
                contentPadding = PaddingValues(horizontal = 8.dp, vertical = 4.dp)
            ) {
                Text(
                    text = actionText,
                    style = MaterialTheme.typography.labelLarge,
                    color = MaterialTheme.colorScheme.primary
                )
                Icon(
                    imageVector = Icons.AutoMirrored.Filled.KeyboardArrowRight,
                    contentDescription = null,
                    tint = MaterialTheme.colorScheme.primary,
                    modifier = Modifier.size(18.dp)
                )
            }
        }
    }
}
