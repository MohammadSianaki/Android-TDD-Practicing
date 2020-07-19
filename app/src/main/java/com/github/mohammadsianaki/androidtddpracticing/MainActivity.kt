package com.github.mohammadsianaki.androidtddpracticing

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.android.viewmodel.ext.viewModel

class MainActivity : AppCompatActivity() {
    private val viewModel by viewModel<HomeViewModel>()
    private val todos = listOf<Todo>(
        Todo("Fix bug"),
        Todo("Fix crash"),
        Todo("Add feature A"),
        Todo("fix performance issues"),
        Todo("Revert feature B"),
        Todo("Add Unit Test")

    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        saveBtn.setOnClickListener { viewModel.saveItems(todos) }
    }
}