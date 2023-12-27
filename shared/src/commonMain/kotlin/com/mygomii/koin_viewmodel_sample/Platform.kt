package com.mygomii.koin_viewmodel_sample

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform