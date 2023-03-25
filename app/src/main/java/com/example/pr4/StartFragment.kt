package com.example.pr4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.pr4.databinding.FragmentStartBinding


class StartFragment : Fragment() {

    private lateinit var binding: FragmentStartBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentStartBinding.inflate(inflater, container, false)
        binding.btLlC.setOnClickListener { findNavController().navigate(R.id.linearCodeFragment) }
        binding.btLlX.setOnClickListener { findNavController().navigate(R.id.linearXMLFragment)}
        binding.btRlC.setOnClickListener { findNavController().navigate(R.id.relativeCodeFragment) }
        binding.btRlX.setOnClickListener { findNavController().navigate(R.id.relativeXMLFragment) }
        binding.btTlC.setOnClickListener { findNavController().navigate(R.id.tableCodeFragment) }
        binding.btTlX.setOnClickListener { findNavController().navigate(R.id.tableXMLFragment) }
        binding.btFlC.setOnClickListener { findNavController().navigate(R.id.frameCodeFragment) }
        binding.btFlX.setOnClickListener { findNavController().navigate(R.id.frameXMLFragment) }
        binding.btGlC.setOnClickListener { findNavController().navigate(R.id.gridCodeFragment) }
        binding.btGlX.setOnClickListener { findNavController().navigate(R.id.gridXMLFragment) }
        return binding.root
    }
}