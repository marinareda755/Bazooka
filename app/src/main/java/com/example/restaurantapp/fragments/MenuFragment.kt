package com.example.restaurantapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.restaurantapp.R
import com.example.restaurantapp.data.MenuResponse
import com.example.restaurantapp.data.RetrofitClient
import com.example.restaurantapp.databinding.FragmentMenuBinding
import com.example.restaurantapp.recyclerComponents.MenuAdapter
import retrofit2.Call
import retrofit2.Response

class MenuFragment : Fragment() {
    var _binding:FragmentMenuBinding?=null
    val binding get() = _binding!!
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.rvMenu.layoutManager=LinearLayoutManager(context,RecyclerView.VERTICAL,false)
        RetrofitClient
            .getRetrofitClient()
            .getMenu().enqueue(object :retrofit2.Callback<MenuResponse>{
                override fun onResponse(
                    call: Call<MenuResponse>,
                    response: Response<MenuResponse>
                ) {
                    if (response.isSuccessful){
                        val responseBody=response.body()
                        binding.rvMenu.adapter=MenuAdapter(responseBody)

                    }
                }

                override fun onFailure(call: Call<MenuResponse>, t: Throwable) {
                    TODO("Not yet implemented")
                }

            })

//        binding.rvMenu.adapter=MenuAdapter()
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_menu, container, false)
        _binding=FragmentMenuBinding.inflate(inflater,container,false)
        return binding.root
    }


}