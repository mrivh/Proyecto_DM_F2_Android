package com.example.lifexperience

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

  class Inicio : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inicio)

        val listFragmentRecommended = supportFragmentManager.findFragmentById(R.id.fragmentListRecommended) as ListFragmentRecommended
        val listFragmentPopular = supportFragmentManager.findFragmentById(R.id.fragmentListPopular) as ListFragmentPopular

        listFragmentRecommended.setListener{
            val detailFragment = supportFragmentManager.findFragmentById(R.id.fragmentDetail) as? DetailFragment

            // Pantalla grande, mostrar detalle en el fragment
            if(detailFragment!=null) {
                detailFragment.showProduct(it)
            } else {
                //pantalla pequeña, navegar a un nuevo Activity
                val intent = Intent(this, DetailActivity::class.java)
                intent.putExtra(DetailActivity.PLACE, it)
                startActivity(intent)
            }
        }

        listFragmentPopular.setListener{
            val detailFragment = supportFragmentManager.findFragmentById(R.id.fragmentDetail) as? DetailFragment

            // Pantalla grande, mostrar detalle en el fragment
            if(detailFragment!=null) {
                detailFragment.showProduct(it)
            } else {
                //pantalla pequeña, navegar a un nuevo Activity
                val intent = Intent(this, DetailActivity::class.java)
                intent.putExtra(DetailActivity.PLACE, it)
                startActivity(intent)
            }
        }
    }
}