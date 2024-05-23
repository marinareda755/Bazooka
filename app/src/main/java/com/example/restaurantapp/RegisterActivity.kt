package com.example.restaurantapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.room.Database
import androidx.room.Room
import com.example.restaurantapp.data.RegisterDatabase
import com.example.restaurantapp.databinding.ActivityMainBinding
import com.example.restaurantapp.databinding.ActivityRegisterBinding

class RegisterActivity : AppCompatActivity() {
    lateinit var binging: ActivityRegisterBinding
    lateinit var DB:RegisterDatabase

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
//        setContentView(R.layout.activity_register)
        binging=ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binging.root)
        DB=Room.databaseBuilder(
            applicationContext,
            RegisterDatabase::class.java,
            "user_database"
        ).allowMainThreadQueries().build()

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}