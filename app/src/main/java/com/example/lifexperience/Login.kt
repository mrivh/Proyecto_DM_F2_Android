package com.example.lifexperience

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

const val USER_NAME = "com.example.lifexperience.USER_NAME"

class Login : AppCompatActivity() {
    private var users = listOf(
        User("miriam","miriam@gmail.com", "miriam123"),
        User("geraldine","gera@gmail.com", "gera123"),
        User("alfredo","alfredo@gmail.com", "alfredo123"),
        User("randy" ,"randy@gmail.com", "randy123")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var editTextEmail = findViewById<TextView>(R.id.editTextEmail)
        var editTextPassword = findViewById<TextView>(R.id.editTextPassword)
        var btnLogin = findViewById<Button>(R.id.btnLogin)

        var email: String
        var password: String
        var isRegistered: Boolean = false
        val bundle = Bundle()
        btnLogin.setOnClickListener {
            email = editTextEmail.text.toString()
            password = editTextPassword.text.toString()
            for (user in users){
                if(user.email == email && user.password == password){
                    bundle.putString(USER_NAME, user.username.toString())
                    isRegistered = true
                }
            }
            if(isRegistered){
                Toast.makeText(applicationContext, "Welcome", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, Inicio::class.java ).apply{ // Va desde this hasta Inicio
                    putExtras(bundle)
                }
                startActivity(intent)
            } else {
                Toast.makeText(applicationContext, "Email or password incorrect", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
