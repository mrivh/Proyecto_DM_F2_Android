  package com.example.lifexperience

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.widget.ImageButton
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.drawerlayout.widget.DrawerLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class Inicio : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inicio)

        val appBar = findViewById<Toolbar>(R.id.app_bar)
        this.setSupportActionBar(appBar)
        setupDrawer(appBar)
        
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

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.toolbar_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    private fun setupDrawer(toolbar: Toolbar){
        val drawerLayout = findViewById<DrawerLayout>(R.id.drawer_layout)
        val drawerToggle = ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.open_drawer,R.string.close_drawer)
    }
}


