package com.saddam.mynavigationcomponent.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.saddam.mynavigationcomponent.R
import com.saddam.mynavigationcomponent.databinding.FragmentKetigaBinding

//coba Navigation.findNavController(view)
class FragmentKetiga : Fragment() {

    private var _binding: FragmentKetigaBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentKetigaBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val aName = FragmentKetigaArgs.fromBundle(arguments as Bundle).name

        binding.tvName.text = "Namanya: $aName"
    }

    override fun onDestroy() {
        super.onDestroy()
        null.also { _binding = it }
    }

}