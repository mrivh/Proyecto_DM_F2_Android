package com.example.lifexperience

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Inicio : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inicio)
        
                imageView.setOnClickListener {

            startActivity(Intent(this, Lugar::class.java))
        }
    }
}
