package com.example.lifexperience

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class DetailActivityExperience: AppCompatActivity() {
    companion object {
        val EXPERIENCE = "EXPERIENCE"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_descripciones)

        val experience = intent.getParcelableExtra<Experience>(EXPERIENCE)
        val detailFragment = supportFragmentManager.findFragmentById(R.id.fragmentDetailExperience) as? DetailFragmentExperience
        /*if (place != null) {
            detailFragment?.showProduct(place)
        }
        btnContinue = findViewById<Button>(R.id.btnContinue)
        val bundle = Bundle()

        btnContinue.setOnClickListener {
            //Toast.makeText(applicationContext, place?.description, Toast.LENGTH_SHORT).show()
            val intent = Intent(this, Experiencias::class.java ).apply{ // Va desde this hasta Inicio
                putExtras(bundle)
            }
            startActivity(intent)
            //println(place?.name)
            //println(place?.description)
        }*/
        //Toast.makeText(applicationContext, "Test", Toast.LENGTH_SHORT).show()
        //btnActivities = view.findViewById(R.id.btnContinue)
    }
}