package com.renancorredato

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.tabs.TabLayout
import com.renancorredato.databinding.FragmentPaymentBinding


class PaymentFragment : Fragment() {

    private var binding: FragmentPaymentBinding? = null


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentPaymentBinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        val fragmentList = listOf(Tab1Fragment(), Tab2Fragment(), Tab3Fragment())
        val fragmentTileList = listOf("Tab 1", "Tab 2", "Tab 3 ")

        activity?.let {
            val viewPagerAdapter = ViewPagerAdapter(
                fragmentManager = it.supportFragmentManager,
                fragmentsList = fragmentList,
                fragmentsTitleList = fragmentTileList
            )

            binding?.let { bindingNoNull ->
                with(bindingNoNull) {
                    vpPaymentTabs.adapter = viewPagerAdapter
                    tlPaymentTabs.setupWithViewPager(vpPaymentTabs)
                }
            }
        }

//        binding?.tlPaymentTabs?.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
//
//            override fun onTabSelected(tab: TabLayout.Tab?) {
//                Log.i("tab - Selected ", tab?.text.toString())
//
//                when(tab?.position){
//                    0 ->{
//                        goToFragment(Tab1Fragment())
//                    }
//
//                    1 ->{
//                        goToFragment(Tab2Fragment())
//                    }
//
//                    2 ->{
//                        goToFragment(Tab3Fragment())
//                    }
//                }
//
//            }
//
//            override fun onTabReselected(tab: TabLayout.Tab?) {
//                Log.i("tab - Reselected ", tab?.text.toString())
//            }
//
//            override fun onTabUnselected(tab: TabLayout.Tab?) {
//                Log.i("tab - Unselected ", tab?.text.toString())
//            }
//        })
//
   }

        fun goToFragment(fragment: Fragment) {
            val fragmentTransaction = activity?.supportFragmentManager?.beginTransaction()
            fragmentTransaction?.replace(R.id.container, fragment)
            fragmentTransaction?.commit()
        }

        override fun onDestroyView() {
            super.onDestroyView()
            binding = null
        }
    }