package com.example.restaurantapp.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface DaoUser {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertUser(user: User)
    @Query("SELECT * FROM USERS WHERE user_name = :userName AND user_phoneNumber=:phoneNumber AND user_password=:password")
    fun getUser(userName:String,phoneNumber:Int,password:String ):User?

}