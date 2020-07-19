package com.github.mohammadsianaki.androidtddpracticing.app

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.GlobalContext
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        if (GlobalContext.getOrNull() == null) {
            startKoin {
                // use Koin logger
                logger(Level.DEBUG)
                // declare Android context
                androidContext(this@App)
                // declare used modules
                modules(appModule)
            }
        }

    }

}