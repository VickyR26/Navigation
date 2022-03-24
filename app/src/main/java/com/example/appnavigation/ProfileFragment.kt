package com.example.appnavigation

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import com.example.appnavigation.databinding.FragmentProfileBinding


class ProfileFragment : Fragment() {
    private lateinit var binding: FragmentProfileBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentProfileBinding.inflate(layoutInflater)
        //val navController = findNavController()

        binding.buttonEnviar.setOnClickListener{
            //Toast.makeText(context, "Si jala", Toast.LENGTH_SHORT).show()
            val enviado = arrayOf(binding.editTextUsuario.text.toString(), binding.editTextNombre.text.toString(), binding.editTextApellidoP.text.toString(), binding.editTextApellidoM.text.toString(), binding.editTextCorreo.text.toString() )
            val directions = ProfileFragmentDirections.actionProfileFragmentToResultadoFragment(enviado)
            //navController.navigate(directions)
            Log.i("prueba", "Esto es antes de enviar")
            NavHostFragment.findNavController(this).navigate(directions)
            Log.i("prueba", "Ya envié")
        }
        return binding.root
    }

}