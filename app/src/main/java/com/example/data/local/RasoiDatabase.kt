package com.example.data.local

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(
    entities = [
        FavoriteEntity::class,
        RecentlyViewedEntity::class,
        ReviewEntity::class,
        IngredientCheckEntity::class
    ],
    version = 1,
    exportSchema = false
)
abstract class RasoiDatabase : RoomDatabase() {
    abstract fun rasoiDao(): RasoiDao

    companion object {
        @Volatile
        private var INSTANCE: RasoiDatabase? = null

        fun getInstance(context: Context): RasoiDatabase {
            return INSTANCE ?: synchronized(this) {
                INSTANCE ?: Room.databaseBuilder(
                    context.applicationContext,
                    RasoiDatabase::class.java,
                    "rasoi_guru_db"
                ).build().also { INSTANCE = it }
            }
        }
    }
}
