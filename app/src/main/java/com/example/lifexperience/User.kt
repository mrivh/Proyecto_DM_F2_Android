package com.example.lifexperience

class User (username: String, email: String, password: String, userType: String) {
    internal val username: String = username
    internal val email: String = email
    internal val password: String = password
    internal val userType: String = userType

    init {
        println("User created")
    }
}