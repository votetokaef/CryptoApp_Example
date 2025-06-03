package com.example.cryptoapp.data.di

import com.example.cryptoapp.data.repository.CoinRepositoryImpl
import com.example.cryptoapp.domain.CoinRepository
import dagger.Binds
import dagger.Module

@Module
interface DomainModule {

    @Binds
    @ApplicationScope
    fun bindsRepository(impl: CoinRepositoryImpl): CoinRepository
}