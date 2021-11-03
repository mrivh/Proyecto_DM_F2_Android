package com.example.lifexperience

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.core.widget.doOnTextChanged
import com.google.android.material.textfield.TextInputLayout

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
        var editTextEmail = findViewById<TextInputLayout>(R.id.editTextEmail)
        var editTextPassword = findViewById<TextInputLayout>(R.id.editTextPassword)

        var btnLogin = findViewById<Button>(R.id.btnLogin)
        var textRegister = findViewById<TextView>(R.id.textRegister)

        var isRegistered: Boolean = false
        val bundle = Bundle()

        btnLogin.setOnClickListener {
            val inputText = editTextEmail.editText?.text.toString()
            val inputPassword = editTextPassword.editText?.text.toString()
            for (user in users){
                if(user.email == inputText && user.password == inputPassword){
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

        textRegister.setOnClickListener {
            Toast.makeText(applicationContext, "Register", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, Registro::class.java ).apply{ // Va desde this hasta Registro
                putExtras(bundle)
            }
            startActivity(intent)
        }

    }
}
