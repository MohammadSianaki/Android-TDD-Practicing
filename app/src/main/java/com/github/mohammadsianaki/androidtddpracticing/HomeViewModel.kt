package com.github.mohammadsianaki.androidtddpracticing

import androidx.lifecycle.ViewModel
import com.github.mohammadsianaki.androidtddpracticing.app.toTodoEntity

class HomeViewModel(private val homeRepository: HomeRepository) : ViewModel() {

    fun save(todos: List<Todo>) {
        homeRepository.save(todos.map { it.toTodoEntity() })
    }
}