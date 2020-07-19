package com.github.mohammadsianaki.androidtddpracticing.db

import androidx.room.Dao
import androidx.room.Query

@Dao
interface AppDao {
    @Query("SELECT * FROM todos")
    fun getAll(): List<TodoEntity>
}