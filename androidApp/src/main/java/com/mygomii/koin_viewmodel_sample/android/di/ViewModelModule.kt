package com.mygomii.koin_viewmodel_sample.android.di


import com.mygomii.koin_viewmodel_sample.android.user.UserViewModel
import org.koin.androidx.viewmodel.dsl.viewModelOf
import org.koin.dsl.module

val viewModelModule = module {
    viewModelOf(::UserViewModel)
}


