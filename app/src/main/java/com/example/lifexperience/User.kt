package com.example.lifexperience

class User (username: String, email: String, password: String) {
    internal val username: String = username
    internal val email: String = email
    internal val password: String = password

    init {
        println("User created")
    }
}