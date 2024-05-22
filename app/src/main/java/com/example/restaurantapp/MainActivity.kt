package com.example.restaurantapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.restaurantapp.databinding.ActivityMainBinding
import com.example.restaurantapp.fragments.CardFragment
import com.example.restaurantapp.fragments.HomeFragment
import com.example.restaurantapp.fragments.MenuFragment
import com.example.restaurantapp.fragments.ProfileFragment
import com.example.restaurantapp.fragments.SettingFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    lateinit var binging: ActivityMainBinding
    lateinit var appBarConfig:AppBarConfiguration
    lateinit var navcontroller:NavController
 //  lateinit var btnNav:BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
//        setContentView(R.layout.activity_main)
        binging=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binging.root)
        setSupportActionBar(binging.toolbar)
        var navigation=findNavController(R.id.nav_host_fragment_content_main)
        appBarConfig= AppBarConfiguration(navigation.graph)
        setupActionBarWithNavController(navigation,appBarConfig)


        navcontroller=findNavController(R.id.nav_host_fragment_content_main)
        binging.bottom.bottomnav.setupWithNavController(navcontroller)




//        supportFragmentManager.beginTransaction().replace(R.id.container,HomeFragment()).commit()
//        btnNav.setOnItemSelectedListener {
//            when(it.itemId){
//                R.id.menuFragment->{
//                    supportFragmentManager.beginTransaction().replace(R.id.container,MenuFragment()).commit()
//                    true
//                }
//                R.id.cardFragment->{
//                    supportFragmentManager.beginTransaction().replace(R.id.container,CardFragment()).commit()
//                    true
//                }
//                R.id.homeFragment->{
//                    supportFragmentManager.beginTransaction().replace(R.id.container,HomeFragment()).commit()
//                    true
//                }
//                R.id.profileFragment->{
//                    supportFragmentManager.beginTransaction().replace(R.id.container,ProfileFragment()).commit()
//                    true
//                }
//                R.id.settingFragment->{
//                    supportFragmentManager.beginTransaction().replace(R.id.container,SettingFragment()).commit()
//                    true
//                }
//                else->{
//                    true
//                }
//
//
//
//            }
//        }


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}