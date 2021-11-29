package com.example.lifexperience

import android.app.Application

class AllUsers: Application() {
    companion object{
        var users: MutableList<User> = mutableListOf(
            User("miriam","miriam@gmail.com", "miriam123", "Traveler"),
            User("geraldine","gera@gmail.com", "gera123", "Traveler"),
            User("alfredo","alfredo@gmail.com", "alfredo123", "Guide"),
            User("randy" ,"randy@gmail.com", "randy123", "Guide")
        )
    }
}