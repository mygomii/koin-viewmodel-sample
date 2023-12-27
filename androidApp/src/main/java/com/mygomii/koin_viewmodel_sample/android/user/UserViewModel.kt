package com.mygomii.koin_viewmodel_sample.android.user

import androidx.lifecycle.ViewModel
import com.mygomii.koin_viewmodel_sample.data.repositories.UserRepository

class UserViewModel(private val repository: UserRepository) : ViewModel() {

    fun sayHello(name : String) : String{
        val foundUser = repository.findUser(name)
        return foundUser?.let { "Hello '$it' from $this" } ?: "User '$name' not found!"
    }
}