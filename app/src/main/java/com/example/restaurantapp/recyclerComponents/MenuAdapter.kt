package com.example.restaurantapp.recyclerComponents

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.restaurantapp.R
import com.example.restaurantapp.data.MenuResponse
import com.squareup.picasso.Picasso

class MenuAdapter (var list:ArrayList<MenuResponse>): RecyclerView.Adapter<MenuAdapter.ViewHolder>() {
    class ViewHolder (itemView: View):RecyclerView.ViewHolder(itemView) {
       val image:ImageView=itemView.findViewById(R.id.img_menu)
       val title:TextView=itemView.findViewById(R.id.tv_menu_title)
        val difficulty:TextView=itemView.findViewById(R.id.tv_menu_Difficulty)






    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MenuAdapter.ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.menu_item,parent,false)
        )
    }

    override fun onBindViewHolder(holder: MenuAdapter.ViewHolder, position: Int) {
        Picasso.with(holder.itemView.context).load(list!![position].image).placeholder(R.drawable.load).into(holder.image)
        holder.title.text=list[position].title
        holder.difficulty.text=list[position].difficulty



    }

    override fun getItemCount(): Int {
        return list.size
    }

}