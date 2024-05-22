package com.example.restaurantapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.restaurantapp.R
import com.example.restaurantapp.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {
    var _binding:FragmentHomeBinding?=null
    val binding get() = _binding!!
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//        val action =HomeFragmentDirections.actionHomeFragmentToProfileFragment()
//        findNavController().navigate(action)
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_home, container, false)
        _binding=FragmentHomeBinding.inflate(inflater,container,false)
        return binding.root
    }


}