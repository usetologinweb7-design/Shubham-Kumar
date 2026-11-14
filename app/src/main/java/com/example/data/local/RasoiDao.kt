package com.example.data.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface RasoiDao {
    // Favorites
    @Query("SELECT * FROM favorites ORDER BY savedAt DESC")
    fun getAllFavorites(): Flow<List<FavoriteEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertFavorite(favorite: FavoriteEntity)

    @Query("DELETE FROM favorites WHERE recipeId = :recipeId")
    suspend fun deleteFavorite(recipeId: String)

    @Query("DELETE FROM favorites")
    suspend fun clearAllFavorites()

    // Recently Viewed
    @Query("SELECT * FROM recently_viewed ORDER BY viewedAt DESC LIMIT 12")
    fun getRecentlyViewed(): Flow<List<RecentlyViewedEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsertRecentlyViewed(entry: RecentlyViewedEntity)

    // Reviews & Ratings
    @Query("SELECT * FROM reviews ORDER BY createdAt DESC")
    fun getAllReviews(): Flow<List<ReviewEntity>>

    @Query("SELECT * FROM reviews WHERE recipeId = :recipeId ORDER BY createdAt DESC")
    fun getReviewsForRecipe(recipeId: String): Flow<List<ReviewEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertReview(review: ReviewEntity)

    // Ingredient Checklist
    @Query("SELECT * FROM ingredient_checks WHERE recipeId = :recipeId")
    fun getIngredientChecks(recipeId: String): Flow<List<IngredientCheckEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsertIngredientCheck(check: IngredientCheckEntity)

    @Query("DELETE FROM ingredient_checks WHERE recipeId = :recipeId")
    suspend fun clearIngredientChecks(recipeId: String)
}
