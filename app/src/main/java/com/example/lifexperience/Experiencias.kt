package com.example.lifexperience

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Experiencias : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_experiencias)

        val listFragmentExperience = supportFragmentManager.findFragmentById(R.id.fragmentListExperience) as ListFragmentExperience

        listFragmentExperience.setListener {
            val detailFragmentExperience = supportFragmentManager.findFragmentById(R.id.fragmentDetailExperience) as? DetailFragmentExperience

            // Pantalla grande, mostrar detalle en el fragment
            if (detailFragmentExperience != null) {
                //detailFragment.showProduct(it)
            } else {
                //pantalla pequeña, navegar a un nuevo Activity
                val intent = Intent(this, DetailActivityExperience::class.java)
                intent.putExtra(DetailActivityExperience.EXPERIENCE, it)
                startActivity(intent)
            }
        }
    }
}