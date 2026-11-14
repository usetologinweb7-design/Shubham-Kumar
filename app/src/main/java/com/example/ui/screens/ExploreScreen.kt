package com.example.ui.screens

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.example.data.model.*
import com.example.ui.components.EmptyStateView
import com.example.ui.components.RecipeGridCard
import com.example.ui.theme.*
import com.example.ui.viewmodel.ExploreFilterState
import com.example.ui.viewmodel.VegFilter

@Composable
fun ExploreScreen(
    language: AppLanguage,
    filterState: ExploreFilterState,
    filteredRecipes: List<Recipe>,
    filteredDirectory: List<DirectoryEntry>,
    favoriteIds: Set<String>,
    ratingSummaries: Map<String, RecipeRatingSummary>,
    onQueryChange: (String) -> Unit,
    onTimeToggle: (Int) -> Unit,
    onCountryToggle: (Country) -> Unit,
    onCategoryToggle: (FoodCategory) -> Unit,
    onMealTimeToggle: (MealTime) -> Unit,
    onVegFilterToggle: (VegFilter) -> Unit,
    onEasyToggle: () -> Unit,
    onClearFilters: () -> Unit,
    onRecipeClick: (Recipe) -> Unit,
    onRecipeIdClick: (String) -> Unit,
    onToggleFavorite: (String) -> Unit,
    modifier: Modifier = Modifier
) {
    val isHindi = language == AppLanguage.HINDI
    val timeOptions = listOf(5, 10, 15, 30, 45, 60)
    var showFullDirectory by remember { mutableStateOf(false) }

    val hasActiveFilter = filterState.query.isNotBlank() ||
        filterState.maxMinutes != null ||
        filterState.selectedCountry != null ||
        filterState.selectedCategory != null ||
        filterState.selectedMealTime != null ||
        filterState.vegFilter != VegFilter.ALL ||
        filterState.easyOnly

    Column(
        modifier = modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
            .testTag("explore_screen")
    ) {
        // Terracotta Top Header
        Surface(
            color = MaterialTheme.colorScheme.primary,
            shadowElevation = 4.dp,
            modifier = Modifier.fillMaxWidth()
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .fillMaxWidth()
                    .statusBarsPadding()
                    .padding(horizontal = 16.dp, vertical = 14.dp)
            ) {
                Text(
                    text = if (isHindi) "खोजें व फ़िल्टर" else "Explore & Filters",
                    style = MaterialTheme.typography.titleLarge,
                    color = Color.White,
                    fontWeight = FontWeight.Bold
                )
                if (hasActiveFilter) {
                    TextButton(
                        onClick = onClearFilters,
                        modifier = Modifier.testTag("explore_clear_filters")
                    ) {
                        Text(
                            text = if (isHindi) "रीसेट करें" else "Reset",
                            color = Color.White,
                            fontWeight = FontWeight.Bold
                        )
                    }
                }
            }
        }

        LazyColumn(
            contentPadding = PaddingValues(bottom = 28.dp),
            modifier = Modifier.fillMaxSize()
        ) {
            // Search Input
            item {
                OutlinedTextField(
                    value = filterState.query,
                    onValueChange = onQueryChange,
                    placeholder = {
                        Text(
                            if (isHindi) "रेसिपी, सामग्री या देश खोजें..."
                            else "Search Hindi/English dish, ingredient, country..."
                        )
                    },
                    leadingIcon = {
                        Icon(
                            imageVector = Icons.Filled.Search,
                            contentDescription = null,
                            tint = MaterialTheme.colorScheme.primary
                        )
                    },
                    trailingIcon = {
                        if (filterState.query.isNotEmpty()) {
                            IconButton(
                                onClick = { onQueryChange("") },
                                modifier = Modifier.testTag("explore_clear_search")
                            ) {
                                Icon(Icons.Filled.Close, contentDescription = "Clear search")
                            }
                        }
                    },
                    singleLine = true,
                    shape = RoundedCornerShape(26.dp),
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedContainerColor = MaterialTheme.colorScheme.surface,
                        unfocusedContainerColor = MaterialTheme.colorScheme.surface,
                        focusedBorderColor = MaterialTheme.colorScheme.primary,
                        unfocusedBorderColor = MaterialTheme.colorScheme.outline
                    ),
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp, vertical = 14.dp)
                        .testTag("explore_search_input")
                )
            }

            // Time Filters Grid (5, 10, 15, 30, 45, 60 min)
            item {
                Text(
                    text = if (isHindi) "समय के अनुसार फ़िल्टर" else "Filter by Cooking Time",
                    style = MaterialTheme.typography.titleSmall,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(horizontal = 16.dp, vertical = 4.dp)
                )
                Column(
                    verticalArrangement = Arrangement.spacedBy(8.dp),
                    modifier = Modifier.padding(horizontal = 16.dp, vertical = 6.dp)
                ) {
                    timeOptions.chunked(3).forEach { rowItems ->
                        Row(
                            horizontalArrangement = Arrangement.spacedBy(8.dp),
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            rowItems.forEach { mins ->
                                val selected = filterState.maxMinutes == mins
                                FilterChip(
                                    selected = selected,
                                    onClick = { onTimeToggle(mins) },
                                    label = {
                                        Text(
                                            text = if (isHindi) "$mins मिनट" else "$mins min",
                                            maxLines = 1,
                                            textAlign = TextAlign.Center,
                                            modifier = Modifier.fillMaxWidth()
                                        )
                                    },
                                    shape = RoundedCornerShape(20.dp),
                                    modifier = Modifier
                                        .weight(1f)
                                        .testTag("explore_time_filter_$mins")
                                )
                            }
                        }
                    }
                }
            }

            // Dietary, Meal Time & Difficulty Tile Grid (matching attached UI reference)
            item {
                Spacer(modifier = Modifier.height(6.dp))
                Text(
                    text = if (isHindi) "अन्य फ़िल्टर" else "Dietary & Meal Filters",
                    style = MaterialTheme.typography.titleSmall,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(horizontal = 16.dp, vertical = 4.dp)
                )

                val tiles = listOf(
                    FilterTileData(
                        tag = "veg",
                        label = if (isHindi) "शाकाहारी" else "Veg",
                        icon = Icons.Filled.Eco,
                        tint = HerbGreen,
                        bg = HerbGreenContainer,
                        selected = filterState.vegFilter == VegFilter.VEG,
                        onClick = { onVegFilterToggle(VegFilter.VEG) }
                    ),
                    FilterTileData(
                        tag = "non_veg",
                        label = if (isHindi) "मांसाहारी" else "Non-Veg",
                        icon = Icons.Filled.Restaurant,
                        tint = NonVegRed,
                        bg = NonVegContainer,
                        selected = filterState.vegFilter == VegFilter.NON_VEG,
                        onClick = { onVegFilterToggle(VegFilter.NON_VEG) }
                    ),
                    FilterTileData(
                        tag = "breakfast",
                        label = if (isHindi) "नाश्ता" else "Breakfast",
                        icon = Icons.Filled.WbSunny,
                        tint = Color(0xFFD97706),
                        bg = WarmAmberContainer,
                        selected = filterState.selectedMealTime == MealTime.BREAKFAST,
                        onClick = { onMealTimeToggle(MealTime.BREAKFAST) }
                    ),
                    FilterTileData(
                        tag = "lunch",
                        label = if (isHindi) "दोपहर का खाना" else "Lunch",
                        icon = Icons.Filled.LunchDining,
                        tint = Color(0xFF4F46E5),
                        bg = WarmLavenderContainer,
                        selected = filterState.selectedMealTime == MealTime.LUNCH,
                        onClick = { onMealTimeToggle(MealTime.LUNCH) }
                    ),
                    FilterTileData(
                        tag = "dinner",
                        label = if (isHindi) "रात का खाना" else "Dinner",
                        icon = Icons.Filled.NightlightRound,
                        tint = Color(0xFF0284C7),
                        bg = WarmSkyContainer,
                        selected = filterState.selectedMealTime == MealTime.DINNER,
                        onClick = { onMealTimeToggle(MealTime.DINNER) }
                    ),
                    FilterTileData(
                        tag = "snacks",
                        label = if (isHindi) "स्नैक्स" else "Snacks",
                        icon = Icons.Filled.Fastfood,
                        tint = TerracottaDark,
                        bg = TerracottaSoft,
                        selected = filterState.selectedMealTime == MealTime.SNACKS,
                        onClick = { onMealTimeToggle(MealTime.SNACKS) }
                    ),
                    FilterTileData(
                        tag = "desserts",
                        label = if (isHindi) "मिठाई" else "Desserts",
                        icon = Icons.Filled.Cake,
                        tint = Color(0xFFBE185D),
                        bg = Color(0xFFFCE7F3),
                        selected = filterState.selectedMealTime == MealTime.DESSERTS,
                        onClick = { onMealTimeToggle(MealTime.DESSERTS) }
                    ),
                    FilterTileData(
                        tag = "easy",
                        label = if (isHindi) "आसान रेसिपी" else "Easy Recipes",
                        icon = Icons.Filled.Star,
                        tint = Color(0xFFB45309),
                        bg = WarmAmberContainer,
                        selected = filterState.easyOnly,
                        onClick = onEasyToggle
                    )
                )

                Column(
                    verticalArrangement = Arrangement.spacedBy(8.dp),
                    modifier = Modifier.padding(horizontal = 16.dp, vertical = 6.dp)
                ) {
                    tiles.chunked(4).forEach { rowTiles ->
                        Row(
                            horizontalArrangement = Arrangement.spacedBy(8.dp),
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            rowTiles.forEach { tile ->
                                FilterTileCard(
                                    data = tile,
                                    modifier = Modifier.weight(1f)
                                )
                            }
                        }
                    }
                }
            }

            // Country Filter Chips
            item {
                Spacer(modifier = Modifier.height(6.dp))
                Text(
                    text = if (isHindi) "देश चुनें" else "Countries",
                    style = MaterialTheme.typography.titleSmall,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(horizontal = 16.dp, vertical = 4.dp)
                )
                LazyRow(
                    contentPadding = PaddingValues(horizontal = 16.dp),
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    items(Country.entries, key = { it.code }) { country ->
                        val selected = filterState.selectedCountry == country
                        FilterChip(
                            selected = selected,
                            onClick = { onCountryToggle(country) },
                            label = {
                                Text("${country.flag} ${if (isHindi) country.nameHi else country.nameEn}")
                            },
                            modifier = Modifier.testTag("explore_country_${country.code.lowercase()}")
                        )
                    }
                }
            }

            // Category Filter Chips
            item {
                Spacer(modifier = Modifier.height(6.dp))
                Text(
                    text = if (isHindi) "फूड कैटेगरी" else "Categories",
                    style = MaterialTheme.typography.titleSmall,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(horizontal = 16.dp, vertical = 4.dp)
                )
                LazyRow(
                    contentPadding = PaddingValues(horizontal = 16.dp),
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    items(FoodCategory.entries, key = { it.name }) { cat ->
                        val selected = filterState.selectedCategory == cat
                        FilterChip(
                            selected = selected,
                            onClick = { onCategoryToggle(cat) },
                            label = {
                                Text(if (isHindi) cat.nameHi else cat.nameEn)
                            },
                            modifier = Modifier.testTag("explore_category_${cat.name.lowercase()}")
                        )
                    }
                }
            }

            // Results Header
            item {
                Spacer(modifier = Modifier.height(14.dp))
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp, vertical = 4.dp)
                ) {
                    Text(
                        text = if (isHindi) "उपलब्ध रेसिपी (${filteredRecipes.size})" else "Matching Recipes (${filteredRecipes.size})",
                        style = MaterialTheme.typography.titleMedium,
                        fontWeight = FontWeight.Bold
                    )
                }
            }

            if (filteredRecipes.isEmpty()) {
                item {
                    EmptyStateView(
                        title = if (isHindi) "कोई रेसिपी नहीं मिली" else "No Matching Recipes",
                        subtitle = if (isHindi) {
                            "कृपया खोज शब्द बदलें या फ़िल्टर रीसेट करके अन्य आसान व्यंजन देखें।"
                        } else {
                            "Try adjusting your search keywords or reset filters to explore all dishes."
                        },
                        actionLabel = if (isHindi) "फ़िल्टर रीसेट करें" else "Reset Filters",
                        onAction = onClearFilters
                    )
                }
            } else {
                val rows = filteredRecipes.chunked(2)
                items(rows) { pair ->
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(12.dp),
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 16.dp, vertical = 6.dp)
                    ) {
                        RecipeGridCard(
                            recipe = pair[0],
                            language = language,
                            isFavorite = favoriteIds.contains(pair[0].id),
                            ratingSummary = ratingSummaries[pair[0].id],
                            onClick = { onRecipeClick(pair[0]) },
                            onFavoriteToggle = { onToggleFavorite(pair[0].id) },
                            modifier = Modifier.weight(1f)
                        )
                        if (pair.size > 1) {
                            RecipeGridCard(
                                recipe = pair[1],
                                language = language,
                                isFavorite = favoriteIds.contains(pair[1].id),
                                ratingSummary = ratingSummaries[pair[1].id],
                                onClick = { onRecipeClick(pair[1]) },
                                onFavoriteToggle = { onToggleFavorite(pair[1].id) },
                                modifier = Modifier.weight(1f)
                            )
                        } else {
                            Spacer(modifier = Modifier.weight(1f))
                        }
                    }
                }
            }

            // Organized Full Dish Directory (India & International Catalog Expansion Index)
            item {
                Spacer(modifier = Modifier.height(16.dp))
                Card(
                    shape = RoundedCornerShape(18.dp),
                    colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant),
                    modifier = Modifier
                        .padding(horizontal = 16.dp)
                        .fillMaxWidth()
                ) {
                    Column(modifier = Modifier.padding(14.dp)) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.SpaceBetween,
                            modifier = Modifier
                                .fillMaxWidth()
                                .clickable { showFullDirectory = !showFullDirectory }
                                .testTag("explore_directory_toggle")
                        ) {
                            Column(modifier = Modifier.weight(1f)) {
                                Text(
                                    text = if (isHindi) "📚 संपूर्ण व्यंजन कैटलॉग (${filteredDirectory.size})" else "📚 Complete Dish Directory (${filteredDirectory.size})",
                                    style = MaterialTheme.typography.titleSmall,
                                    fontWeight = FontWeight.Bold
                                )
                                Text(
                                    text = if (isHindi) "भारत और 6 देशों की सभी श्रेणियों की व्यवस्थित सूची" else "Organized menu across India's 7 categories & 6 countries",
                                    style = MaterialTheme.typography.bodySmall,
                                    color = MaterialTheme.colorScheme.onSurfaceVariant
                                )
                            }
                            Icon(
                                imageVector = if (showFullDirectory) Icons.Filled.ExpandLess else Icons.Filled.ExpandMore,
                                contentDescription = "Toggle full dish directory"
                            )
                        }

                        AnimatedVisibility(visible = showFullDirectory) {
                            Column(
                                verticalArrangement = Arrangement.spacedBy(8.dp),
                                modifier = Modifier.padding(top = 12.dp)
                            ) {
                                filteredDirectory.groupBy { it.category }.forEach { (cat, entries) ->
                                    Text(
                                        text = if (isHindi) cat.nameHi else cat.nameEn,
                                        style = MaterialTheme.typography.labelLarge,
                                        color = MaterialTheme.colorScheme.primary,
                                        fontWeight = FontWeight.Bold,
                                        modifier = Modifier.padding(top = 6.dp)
                                    )
                                    entries.forEach { item ->
                                        val isReady = item.linkedRecipeId != null
                                        Surface(
                                            shape = RoundedCornerShape(12.dp),
                                            color = MaterialTheme.colorScheme.surface,
                                            modifier = Modifier
                                                .fillMaxWidth()
                                                .clip(RoundedCornerShape(12.dp))
                                                .clickable(enabled = isReady) {
                                                    item.linkedRecipeId?.let(onRecipeIdClick)
                                                }
                                        ) {
                                            Row(
                                                verticalAlignment = Alignment.CenterVertically,
                                                horizontalArrangement = Arrangement.SpaceBetween,
                                                modifier = Modifier.padding(horizontal = 12.dp, vertical = 10.dp)
                                            ) {
                                                Column(modifier = Modifier.weight(1f)) {
                                                    Text(
                                                        text = "${item.country.flag} ${if (isHindi) item.nameHi else item.nameEn}",
                                                        style = MaterialTheme.typography.bodyMedium,
                                                        fontWeight = FontWeight.Medium
                                                    )
                                                    Text(
                                                        text = if (isHindi) item.nameEn else item.nameHi,
                                                        style = MaterialTheme.typography.bodySmall,
                                                        color = MaterialTheme.colorScheme.onSurfaceVariant
                                                    )
                                                }
                                                Surface(
                                                    shape = RoundedCornerShape(10.dp),
                                                    color = if (isReady) HerbGreenContainer else MaterialTheme.colorScheme.surfaceVariant
                                                ) {
                                                    Text(
                                                        text = if (isReady) {
                                                            if (isHindi) "तैयार गाइड →" else "Full Guide →"
                                                        } else {
                                                            if (isHindi) "कैटलॉग" else "Catalogued"
                                                        },
                                                        style = MaterialTheme.typography.labelSmall,
                                                        color = if (isReady) HerbGreen else MaterialTheme.colorScheme.onSurfaceVariant,
                                                        modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp)
                                                    )
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}

private data class FilterTileData(
    val tag: String,
    val label: String,
    val icon: ImageVector,
    val tint: Color,
    val bg: Color,
    val selected: Boolean,
    val onClick: () -> Unit
)

@Composable
private fun FilterTileCard(
    data: FilterTileData,
    modifier: Modifier = Modifier
) {
    val borderColor = if (data.selected) MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.outlineVariant
    val containerColor = if (data.selected) MaterialTheme.colorScheme.primaryContainer else MaterialTheme.colorScheme.surface
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = modifier
            .height(78.dp)
            .clip(RoundedCornerShape(16.dp))
            .background(containerColor)
            .border(if (data.selected) 1.5.dp else 1.dp, borderColor, RoundedCornerShape(16.dp))
            .clickable(onClick = data.onClick)
            .padding(6.dp)
            .testTag("filter_tile_${data.tag}")
    ) {
        Surface(
            shape = RoundedCornerShape(10.dp),
            color = data.bg,
            modifier = Modifier.size(32.dp)
        ) {
            Box(contentAlignment = Alignment.Center) {
                Icon(
                    imageVector = data.icon,
                    contentDescription = null,
                    tint = data.tint,
                    modifier = Modifier.size(18.dp)
                )
            }
        }
        Spacer(modifier = Modifier.height(5.dp))
        Text(
            text = data.label,
            style = MaterialTheme.typography.labelSmall,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
            textAlign = TextAlign.Center,
            fontWeight = if (data.selected) FontWeight.Bold else FontWeight.Medium
        )
    }
}
