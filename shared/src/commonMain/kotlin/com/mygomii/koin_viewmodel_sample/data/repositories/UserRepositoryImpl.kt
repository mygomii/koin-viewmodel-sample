package com.mygomii.koin_viewmodel_sample.data.repositories

import com.mygomii.koin_viewmodel_sample.models.User

class UserRepositoryImpl : UserRepository {
    private val _users = arrayListOf<User>()

    override fun findUser(name: String): User? {
        return _users.firstOrNull { it.name == name }
    }

    override fun addUsers(users: List<User>) {
        _users.addAll(users)
    }
}