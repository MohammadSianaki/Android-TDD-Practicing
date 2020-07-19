package com.github.mohammadsianaki.androidtddpracticing.app

import com.github.mohammadsianaki.androidtddpracticing.Todo
import com.github.mohammadsianaki.androidtddpracticing.db.TodoEntity

fun Todo.toTodoEntity() = TodoEntity(body = this.body)