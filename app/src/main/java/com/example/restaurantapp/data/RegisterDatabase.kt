package com.example.restaurantapp.data

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [User::class], version = 1)
abstract class RegisterDatabase:RoomDatabase() {
    abstract fun daoUser():DaoUser
}