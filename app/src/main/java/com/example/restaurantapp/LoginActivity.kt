package com.example.restaurantapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.restaurantapp.databinding.ActivityLoginBinding
import com.example.restaurantapp.databinding.ActivityMainBinding

class LoginActivity : AppCompatActivity() {
    lateinit var binging:ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
//        setContentView(R.layout.activity_login)
        binging= ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binging.root)
        binging.tvCreate.setOnClickListener {
            val intent= Intent(this@LoginActivity,RegisterActivity::class.java)
            startActivity(intent)

        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}