package com.github.mohammadsianaki.androidtddpracticing

import com.github.mohammadsianaki.androidtddpracticing.db.AppDao
import com.github.mohammadsianaki.androidtddpracticing.db.TodoEntity

class HomeRepositoryImpl(
    private val dao: AppDao
) : HomeRepository {
    override fun save(todos: List<TodoEntity>) {
        dao.saveAll(todos)
    }
}