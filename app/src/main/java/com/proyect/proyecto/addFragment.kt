package com.proyect.proyecto


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.proyect.proyecto.databinding.FragmentAgregarBinding

class addFragment : Fragment() {

    private lateinit var binding: FragmentAgregarBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAgregarBinding.inflate(inflater, container, false)
        return binding.root
    }
}