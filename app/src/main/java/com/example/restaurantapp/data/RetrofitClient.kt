package com.example.restaurantapp.data

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitClient {
    companion object{
        val BASE_URL="https://chinese-food-db.p.rapidapi.com/"
        fun getRetrofitClient():ApiInterface{
            return Retrofit
                .Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(BASE_URL)
                .build()
                .create(ApiInterface::class.java)
        }

    }
}