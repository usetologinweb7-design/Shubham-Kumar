package com.example.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "favorites")
data class FavoriteEntity(
    @PrimaryKey val recipeId: String,
    val savedAt: Long = System.currentTimeMillis()
)

@Entity(tableName = "recently_viewed")
data class RecentlyViewedEntity(
    @PrimaryKey val recipeId: String,
    val viewedAt: Long = System.currentTimeMillis()
)

@Entity(tableName = "reviews")
data class ReviewEntity(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val recipeId: String,
    val reviewerName: String,
    val rating: Int,
    val comment: String,
    val createdAt: Long = System.currentTimeMillis()
)

@Entity(
    tableName = "ingredient_checks",
    primaryKeys = ["recipeId", "ingredientIndex"]
)
data class IngredientCheckEntity(
    val recipeId: String,
    val ingredientIndex: Int,
    val isChecked: Boolean
)
