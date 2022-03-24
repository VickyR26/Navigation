package com.example.appnavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import com.example.appnavigation.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    private  lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //binding = FragmentHomeBinding.inflate(inflater, container, false)
        binding = FragmentHomeBinding.inflate(layoutInflater)
        val navController = findNavController()
        binding.buttonHomeToInside.setOnClickListener {
            Toast.makeText(context, "prueba", Toast.LENGTH_SHORT).show()
            //navController.navigate(R.id.action_homeFragment_to_insideHome)
            val testArgument = "desde el home"
            val directions = HomeFragmentDirections.actionHomeFragmentToInsideHome(testArgument)
            //findNavController().navigate(directions)
            NavHostFragment.findNavController(this).navigate(directions)

        }

        return binding.root
    }

}