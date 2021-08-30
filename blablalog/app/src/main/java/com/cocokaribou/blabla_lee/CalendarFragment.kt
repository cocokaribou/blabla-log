package com.cocokaribou.blabla_lee

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.cocokaribou.blabla_lee.databinding.FragmentCalendarBinding

class CalendarFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentCalendarBinding.inflate(layoutInflater)
        return binding.root
    }

    companion object {
    }
}