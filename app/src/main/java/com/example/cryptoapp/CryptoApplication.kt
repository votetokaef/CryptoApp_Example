package com.example.cryptoapp

import android.app.Application
import androidx.work.Configuration
import com.example.cryptoapp.data.di.DaggerApplicationComponent
import com.example.cryptoapp.data.workers.WorkerFactory
import javax.inject.Inject

class CryptoApplication : Application(), Configuration.Provider {

    @Inject
    lateinit var workerFactory: WorkerFactory

    val component by lazy {
        DaggerApplicationComponent.factory()
            .create(this)
    }

    override fun onCreate() {
        component.inject(this)
        super.onCreate()
    }

    override val workManagerConfiguration: Configuration
        get() = Configuration.Builder().setWorkerFactory(
            workerFactory
        ).build()
}