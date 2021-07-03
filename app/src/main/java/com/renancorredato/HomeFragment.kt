package com.renancorredato

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.renancorredato.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {

    private var binding: FragmentHomeBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(inflater,container,false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding?.btSplashAbout?.setOnClickListener {
            val bundle = Bundle()
            bundle.putString("Teste","Teste")
            bundle.putInt("Teste", 2)
            findNavController().navigate(R.id.action_homeFragment_to_aboutFragment,bundle)
        }

        binding?.btSplashAMovies?.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_nav_graph_moveis)

        }

    }



    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}