package com.example.lifexperience

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

  class MainMenu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_menu)

        val listFragmentRecommended = supportFragmentManager.findFragmentById(R.id.fragmentListRecommended) as ListFragmentRecommended
        val listFragmentPopular = supportFragmentManager.findFragmentById(R.id.fragmentListPopular) as ListFragmentPopular

        listFragmentRecommended.setListener{
            val detailFragment = supportFragmentManager.findFragmentById(R.id.fragmentDetail) as? DetailFragmentPlaces

            // Big screen, show fragment detail
            if(detailFragment!=null) {
                detailFragment.showPlaces(it)
            } else {
                // Small screen, navigate to new activity
                val intent = Intent(this, DetailActivityPlaces::class.java)
                intent.putExtra(DetailActivityPlaces.PLACE, it)
                startActivity(intent)
            }
        }

        listFragmentPopular.setListener{
            val detailFragment = supportFragmentManager.findFragmentById(R.id.fragmentDetail) as? DetailFragmentPlaces

            // Big screen, show fragment detail
            if(detailFragment!=null) {
                detailFragment.showPlaces(it)
            } else {
                // Small screen, navigate to new activity
                val intent = Intent(this, DetailActivityPlaces::class.java)
                intent.putExtra(DetailActivityPlaces.PLACE, it)
                startActivity(intent)
            }
        }
    }
}