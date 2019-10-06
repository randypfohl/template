package com.pfohl.template

import android.app.Application
import com.pfohl.template.di.KoinModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class KoinApplication : Application() {
    override fun onCreate(){
        super.onCreate()
        startKoin {
            androidContext(this@KoinApplication)
            modules(KoinModule)
        }
    }
}