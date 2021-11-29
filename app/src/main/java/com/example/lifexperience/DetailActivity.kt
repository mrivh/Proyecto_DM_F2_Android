package com.example.lifexperience

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class DetailActivity: AppCompatActivity() {
    companion object {
        val PLACE = "PLACE"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detail_activity_lugar)

        val place = intent.getParcelableExtra<PlaceMain>(PLACE)
        val detailFragment = supportFragmentManager.findFragmentById(R.id.fragmentDetail) as? DetailFragment
        if (place != null) {
            detailFragment?.showProduct(place)
        }
    }
}