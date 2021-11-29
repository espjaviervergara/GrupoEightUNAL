package com.jdvr.grupoeightunal

import android.app.Application
import com.jdvr.grupoeightunal.di.dataSourceModule
import com.jdvr.grupoeightunal.di.repoModule
import com.jdvr.grupoeightunal.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App: Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@App)
            modules (dataSourceModule, repoModule, viewModelModule)
        }
    }
}