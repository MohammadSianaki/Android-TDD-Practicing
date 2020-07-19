package com.github.mohammadsianaki.androidtddpracticing

object DataFactory {
    fun getItems() = listOf(
        Todo("Fix bug"),
        Todo("Fix crash"),
        Todo("Add feature A"),
        Todo("fix performance issues"),
        Todo("Revert feature B"),
        Todo("Add Unit Test")
    )
}