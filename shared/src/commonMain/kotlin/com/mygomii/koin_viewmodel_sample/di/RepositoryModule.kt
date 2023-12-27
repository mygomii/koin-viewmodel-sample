package com.mygomii.koin_viewmodel_sample.di

import com.mygomii.koin_viewmodel_sample.data.repositories.UserRepository
import com.mygomii.koin_viewmodel_sample.data.repositories.UserRepositoryImpl
import org.koin.dsl.module

val repositoryModule = module {
    single<UserRepository> { UserRepositoryImpl() }
}