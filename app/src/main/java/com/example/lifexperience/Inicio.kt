package com.example.lifexperience

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class Inicio : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inicio)
        
        var imageView = findViewById<ImageButton>(R.id.imageView)

        imageView.setOnClickListener {

            startActivity(Intent(this, Lugar::class.java))
    }

        var imageView2 = findViewById<ImageButton>(R.id.imageView2)

        imageView2.setOnClickListener {

            startActivity(Intent(this, Inicio::class.java))
        }


        var imageView4 = findViewById<ImageButton>(R.id.imageView4)

        imageView4.setOnClickListener {

            startActivity(Intent(this, Perfil_guia::class.java))
        }

        var imageView5 = findViewById<ImageButton>(R.id.imageView5)

        imageView5.setOnClickListener {

            startActivity(Intent(this, Perfil_Usuario::class.java))
        }

    }
}
