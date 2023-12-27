package com.mygomii.koin_viewmodel_sample.di

import com.mygomii.koin_viewmodel_sample.presentations.KMPUserPresenter
import org.koin.dsl.module

val factoryModule = module {
    factory { KMPUserPresenter(get()) }
}