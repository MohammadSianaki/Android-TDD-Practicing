package com.github.mohammadsianaki.androidtddpracticing

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.room.Room
import androidx.test.platform.app.InstrumentationRegistry
import com.github.mohammadsianaki.androidtddpracticing.db.AppDao
import com.github.mohammadsianaki.androidtddpracticing.db.AppDatabase
import io.mockk.spyk
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner

@RunWith(RobolectricTestRunner::class)
class HomeViewModelTest {

    @get:Rule
    val instantTaskExecutorRule = InstantTaskExecutorRule()

    private val appDao: AppDao = spyk(
        Room.inMemoryDatabaseBuilder(
            InstrumentationRegistry.getInstrumentation().context,
            AppDatabase::class.java
        )
            .allowMainThreadQueries()
            .build()
            .dao()
    )

    private lateinit var viewModel: HomeViewModel

    @Test
    fun setup() {
        viewModel = HomeViewModel(HomeRepositoryImpl(appDao))
    }

}