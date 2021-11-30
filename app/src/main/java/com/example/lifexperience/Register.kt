package com.example.lifexperience

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.Toast
import com.google.android.material.textfield.TextInputLayout
import com.example.lifexperience.AllUsers.Companion.users

class Register : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        var editTextUsername = findViewById<TextInputLayout>(R.id.editTextUsername)
        var editTextEmail = findViewById<TextInputLayout>(R.id.editTextEmail)
        var editTextPassword = findViewById<TextInputLayout>(R.id.editTextPassword)
        var rdBtnTraveler = findViewById<RadioButton>(R.id.rdBtnTraveler)
        var rdBtnGuide = findViewById<RadioButton>(R.id.rdBtnGuide)
        var btnRegister = findViewById<Button>(R.id.btnRegister)

        val bundle = Bundle()

        btnRegister.setOnClickListener{
            val username = editTextUsername.editText?.text.toString()
            val email = editTextEmail.editText?.text.toString()
            val password = editTextPassword.editText?.text.toString()
            var userType = "Traveler"

            if(username.trim().isEmpty() || email.trim().isEmpty() || password.trim().isEmpty()){
                Toast.makeText(applicationContext, "Please fill all the fields", Toast.LENGTH_SHORT).show()
            } else {
                if (rdBtnTraveler.isChecked){
                    userType = "Traveler"
                }
                if (rdBtnGuide.isChecked){
                    userType = "Guide"
                }
                users.add(User(username, email, password, userType))

                Toast.makeText(applicationContext, username + "was registered", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, Login::class.java ).apply{ // Va desde this hasta Login
                    putExtras(bundle)
                }
                startActivity(intent)
            }
        }
    }
}