package com.example.restaurantapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.restaurantapp.R
import com.example.restaurantapp.databinding.FragmentCardBinding


class CardFragment : Fragment() {
    var _binding:FragmentCardBinding?=null
    val binging get() = _binding!!
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_card, container, false)
        _binding=FragmentCardBinding.inflate(inflater,container,false)
        return binging.root
    }

}