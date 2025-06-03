package com.example.cryptoapp.data.di

import androidx.work.ListenableWorker
import dagger.MapKey
import kotlin.reflect.KClass

@MapKey
@Retention(AnnotationRetention.RUNTIME)
annotation class WorkerKey(val worker: KClass<out ListenableWorker>)
