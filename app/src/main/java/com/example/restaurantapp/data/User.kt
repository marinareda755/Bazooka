package com.example.restaurantapp.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Users")
data class User(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name="user_id") val id:Int=0,
    @ColumnInfo(name="user_name") var userName:String,
    @ColumnInfo(name = "user_phoneNumber") var phoneNumber:Int,
    @ColumnInfo(name = "user_password") var password:String

)
