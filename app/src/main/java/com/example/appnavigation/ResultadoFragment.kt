package com.example.appnavigation

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.appnavigation.databinding.FragmentResultadoBinding


class ResultadoFragment : Fragment() {
    private lateinit var binding: FragmentResultadoBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val recibido = arguments?.getStringArray("datos")
        Log.i("prueba", "$recibido[0]")
        binding = FragmentResultadoBinding.inflate(layoutInflater)

        Log.i("prueba", "Ya recibi")

        if (recibido != null) {
            Log.i("prueba", "Dentro del if")
            binding.textViewResUsuario.text = recibido[0]
            binding.textViewResNombre.text = recibido[1]
            binding.textViewResApellidoP.text = recibido[2]
            binding.textViewResApellidoM.text = recibido[3]
            binding.textViewResCorreo.text = recibido[4]

        }else{
            Toast.makeText(context, "Si jala", Toast.LENGTH_SHORT).show()
            Log.i("prueba", "NULO")
        }


        return binding.root
    }


}