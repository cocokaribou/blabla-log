package com.cocokaribou.blabla_lee

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.cocokaribou.blabla_lee.databinding.FragmentWebBinding


/**
 * A simple [Fragment] subclass.
 * Use the [WebFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class WebFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = FragmentWebBinding.inflate(layoutInflater)
        binding.webview.loadUrl("https://www.naver.com")
        return binding.root
    }

    companion object {
        @JvmStatic
        fun newInstance() =
            WebFragment().apply {
                arguments = Bundle().apply {
                }
            }
    }
}