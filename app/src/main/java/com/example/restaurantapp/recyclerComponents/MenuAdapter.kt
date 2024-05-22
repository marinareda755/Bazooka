package com.example.restaurantapp.recyclerComponents

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.restaurantapp.R
import com.example.restaurantapp.data.MenuItem

class MenuAdapter (var list:ArrayList<MenuItem>): RecyclerView.Adapter<MenuAdapter.ViewHolder>() {
    class ViewHolder (itemView: View):RecyclerView.ViewHolder(itemView) {
//        val image:ImageView=itemView.findViewById(R.id.)
//        val name:TextView=itemView.findViewById(R.id.)
//        val des:TextView=itemView.findViewById(R.id)
//        val price:TextView=itemView.findViewById(R.id)
//



    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MenuAdapter.ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.menu_item,parent,false)
        )
    }

    override fun onBindViewHolder(holder: MenuAdapter.ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        return list.size
    }

}