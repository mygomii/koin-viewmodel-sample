package com.mygomii.koin_viewmodel_sample.data.repositories

import com.mygomii.koin_viewmodel_sample.models.User

interface UserRepository {
    fun findUser(name: String): User?
    fun addUsers(users: List<User>)
}