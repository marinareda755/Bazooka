package com.example.restaurantapp.data

import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {
@GET("")
fun getMenu():Call<MenuResponse>
}