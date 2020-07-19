package com.github.mohammadsianaki.androidtddpracticing.app

import androidx.room.Room
import com.github.mohammadsianaki.androidtddpracticing.HomeRepository
import com.github.mohammadsianaki.androidtddpracticing.HomeRepositoryImpl
import com.github.mohammadsianaki.androidtddpracticing.HomeViewModel
import com.github.mohammadsianaki.androidtddpracticing.db.AppDatabase
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
    single<HomeRepository> { HomeRepositoryImpl(get()) }
    single {
        Room.databaseBuilder(
            get(),
            AppDatabase::class.java,
            "app-db"
        )
            .allowMainThreadQueries()
            .build()
    }
    viewModel { HomeViewModel(get()) }
}