package com.example.lifexperience

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class DetailActivityExperience: AppCompatActivity() {
    companion object {
        val EXPERIENCE = "EXPERIENCE"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_descriptions)

        val experience = intent.getParcelableExtra<Experience>(EXPERIENCE)
        val detailFragment = supportFragmentManager.findFragmentById(R.id.fragmentDetailExperience) as? DetailFragmentExperience
    }
}