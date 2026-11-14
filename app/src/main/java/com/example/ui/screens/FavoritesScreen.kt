package com.example.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DeleteOutline
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.data.model.AppLanguage
import com.example.data.model.Recipe
import com.example.data.model.RecipeRatingSummary
import com.example.ui.components.EmptyStateView
import com.example.ui.components.RecipeGridCard

@Composable
fun FavoritesScreen(
    language: AppLanguage,
    favoriteRecipes: List<Recipe>,
    ratingSummaries: Map<String, RecipeRatingSummary>,
    onRecipeClick: (Recipe) -> Unit,
    onRemoveFavorite: (String) -> Unit,
    onClearAll: () -> Unit,
    onExploreClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    val isHindi = language == AppLanguage.HINDI
    var showClearConfirm by remember { mutableStateOf(false) }

    Column(
        modifier = modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
            .testTag("favorites_screen")
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
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(
                        imageVector = Icons.Filled.Favorite,
                        contentDescription = null,
                        tint = Color.White
                    )
                    Spacer(modifier = Modifier.width(10.dp))
                    Column {
                        Text(
                            text = if (isHindi) "मेरी पसंदीदा रेसिपी" else "My Favorite Recipes",
                            style = MaterialTheme.typography.titleLarge,
                            color = Color.White,
                            fontWeight = FontWeight.Bold
                        )
                        Text(
                            text = if (isHindi) "${favoriteRecipes.size} सेव की गई रेसिपी" else "${favoriteRecipes.size} saved offline",
                            style = MaterialTheme.typography.labelMedium,
                            color = Color.White.copy(alpha = 0.85f)
                        )
                    }
                }
                if (favoriteRecipes.isNotEmpty()) {
                    IconButton(
                        onClick = { showClearConfirm = true },
                        modifier = Modifier.testTag("favorites_clear_all_button")
                    ) {
                        Icon(
                            imageVector = Icons.Filled.DeleteOutline,
                            contentDescription = "Clear all favorites",
                            tint = Color.White
                        )
                    }
                }
            }
        }

        if (favoriteRecipes.isEmpty()) {
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier.fillMaxSize()
            ) {
                EmptyStateView(
                    title = if (isHindi) "अभी कोई पसंदीदा रेसिपी नहीं है" else "No Favorite Recipes Yet",
                    subtitle = if (isHindi) {
                        "किसी भी डिश पर दिल (♥) आइकन दबाएं ताकि वह यहाँ हमेशा के लिए सेव रहे।"
                    } else {
                        "Tap the heart (♥) icon on any recipe to keep it saved right here even after closing the app."
                    },
                    actionLabel = if (isHindi) "रेसिपी खोजें" else "Explore Recipes",
                    onAction = onExploreClick
                )
            }
        } else {
            LazyVerticalGrid(
                columns = GridCells.Adaptive(minSize = 164.dp),
                contentPadding = PaddingValues(16.dp),
                horizontalArrangement = Arrangement.spacedBy(12.dp),
                verticalArrangement = Arrangement.spacedBy(12.dp),
                modifier = Modifier.fillMaxSize()
            ) {
                items(favoriteRecipes, key = { it.id }) { recipe ->
                    RecipeGridCard(
                        recipe = recipe,
                        language = language,
                        isFavorite = true,
                        ratingSummary = ratingSummaries[recipe.id],
                        onClick = { onRecipeClick(recipe) },
                        onFavoriteToggle = { onRemoveFavorite(recipe.id) }
                    )
                }
            }
        }
    }

    if (showClearConfirm) {
        AlertDialog(
            onDismissRequest = { showClearConfirm = false },
            title = {
                Text(if (isHindi) "सभी पसंदीदा हटाएं?" else "Clear All Favorites?")
            },
            text = {
                Text(
                    if (isHindi) "क्या आप अपनी सभी सेव की गई पसंदीदा रेसिपी सूची से हटाना चाहते हैं?"
                    else "Remove all saved favorite recipes from your list?"
                )
            },
            confirmButton = {
                TextButton(
                    onClick = {
                        onClearAll()
                        showClearConfirm = false
                    }
                ) {
                    Text(if (isHindi) "हटाएं" else "Clear", color = MaterialTheme.colorScheme.error)
                }
            },
            dismissButton = {
                TextButton(onClick = { showClearConfirm = false }) {
                    Text(if (isHindi) "रद्द करें" else "Cancel")
                }
            }
        )
    }
}
