package com.example.lifexperience

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class DetailActivityPlaces: AppCompatActivity() {
    companion object {
        val PLACE = "PLACE"
    }
    private lateinit var btnContinue: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detail_activity_lugar)

        val place = intent.getParcelableExtra<Place>(PLACE)
        val detailFragment = supportFragmentManager.findFragmentById(R.id.fragmentDetail) as? DetailFragmentPlaces
        if (place != null) {
            detailFragment?.showPlaces(place)
        }
        btnContinue = findViewById<Button>(R.id.btnContinue)
        val bundle = Bundle()

        btnContinue.setOnClickListener {
            val intent = Intent(this, Experiences::class.java ).apply{ // Va desde this hasta Inicio
                putExtras(bundle)
            }
            startActivity(intent)
        }
    }
}