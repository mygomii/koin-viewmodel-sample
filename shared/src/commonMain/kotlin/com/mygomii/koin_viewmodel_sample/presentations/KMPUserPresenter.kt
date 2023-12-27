package com.mygomii.koin_viewmodel_sample.presentations

import com.mygomii.koin_viewmodel_sample.data.repositories.UserRepository
import com.mygomii.koin_viewmodel_sample.models.User

class KMPUserPresenter(private val repository: UserRepository) {

    fun sayHello(): String {
        val name = DefaultData.DEFAULT_USER.name
        val foundUser = repository.findUser(name)
        return foundUser?.let { "Hello!!!!! '$it' from $this" } ?: "User '$name' not found!"
    }
}


object DefaultData {
    val DEFAULT_USER = User("Koin")
    val DEFAULT_USERS = listOf(DEFAULT_USER)
}