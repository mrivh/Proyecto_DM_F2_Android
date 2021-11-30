package com.example.lifexperience

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Experiences : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_experiences)

        val listFragmentExperience = supportFragmentManager.findFragmentById(R.id.fragmentListExperience) as ListFragmentExperience

        listFragmentExperience.setListener {
            val detailFragmentExperience = supportFragmentManager.findFragmentById(R.id.fragmentDetailExperience) as? DetailFragmentExperience
            if(detailFragmentExperience!=null) {
                detailFragmentExperience.showExperiences(it)
            } else {
                val intent = Intent(this, DetailActivityExperience::class.java)
                intent.putExtra(DetailActivityExperience.EXPERIENCE, it)
                startActivity(intent)
            }
        }
    }
}