package com.loginapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    lateinit var usernameInput:EditText
    lateinit var passwordInput:EditText
    lateinit var loginBtn:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        usernameInput=findViewById(R.id.username_input)
        passwordInput=findViewById(R.id.password_input)
        loginBtn=findViewById(R.id.login_btn)

        loginBtn.setOnClickListener{
            val username=usernameInput.text.toString()
            val password=passwordInput.text.toString()
            Log.i("test Credentials","Username:$username and Password :$password")
        }
    }
}