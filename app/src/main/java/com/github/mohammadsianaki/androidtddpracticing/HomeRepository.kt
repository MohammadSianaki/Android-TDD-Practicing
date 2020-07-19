package com.github.mohammadsianaki.androidtddpracticing

import com.github.mohammadsianaki.androidtddpracticing.db.TodoEntity

interface HomeRepository {
    fun save(todos: List<TodoEntity>)
}