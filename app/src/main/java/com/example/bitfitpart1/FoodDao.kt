package com.example.bitfitpart1

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface FoodDao {
    @Query("SELECT * FROM food_table")
    fun getAll(): Flow<List<FoodEntity>>

    @Insert
    fun insertAll(food: List<FoodEntity>)

    @Insert
    fun insert(food: FoodEntity)

    @Query("DELETE FROM food_table")
    fun removeAll()

    @Delete
    fun delete(food: FoodEntity)

//    @Delete
//    fun deleteAll(food: FoodEntity)
}