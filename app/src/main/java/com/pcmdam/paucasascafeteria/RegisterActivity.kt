package com.pcmdam.paucasascafeteria

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.viewModels
import com.paucmd.cafeteria.R
import com.paucmd.cafeteria.R.*
import com.pcmdam.paucasascafeteria.RegisterViewModel

class RegisterActivity : AppCompatActivity() {

    private val viewModel: RegisterViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_register)

        val usernameEditText: EditText = findViewById(id.usernameEditText)
        val passwordEditText: EditText = findViewById(id.passwordEditText)
        val registerButton: Button = findViewById(id.loginButton)

        registerButton.setOnClickListener {
            val username = usernameEditText.text.toString()
            val password = passwordEditText.text.toString()

            LoginProvider.addUser(username, password)

            startActivity(Intent(this, LoginActivity::class.java))
        }
    }
}