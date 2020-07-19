package com.github.mohammadsianaki.androidtddpracticing.db

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "todos")
data class TodoEntity(
    @PrimaryKey(autoGenerate = true)
    private val id: Long,
    private val body: String
)