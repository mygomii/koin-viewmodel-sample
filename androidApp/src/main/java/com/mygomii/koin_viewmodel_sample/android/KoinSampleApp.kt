package com.mygomii.koin_viewmodel_sample.android

import android.app.Application
import com.mygomii.koin_viewmodel_sample.android.di.androidAppModule
import com.mygomii.koin_viewmodel_sample.di.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class KoinSampleApp : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@KoinSampleApp)
            androidLogger()
            modules(androidAppModule() + appModule())
        }
    }
}