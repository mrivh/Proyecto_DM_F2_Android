package com.example.lifexperience

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlin.math.exp

class DetailActivityExperience: AppCompatActivity() {
    companion object {
        val EXPERIENCE = "EXPERIENCE"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detail_activity_experience)

        val experience = intent.getParcelableExtra<Experience>(EXPERIENCE)
        val detailFragment = supportFragmentManager.findFragmentById(R.id.fragmentDetailExperience) as? DetailFragmentExperience

        if (experience != null) {
            detailFragment?.showExperiences(experience)
        }
    }
}