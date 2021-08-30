package com.cocokaribou.blabla_lee

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.cocokaribou.blabla_lee.databinding.ActivityMainBinding

/**
 * MainActivity
 * - WebFragment
 * - CalendarFragment
 */

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    lateinit var webFragment: WebFragment
    lateinit var calFragment: CalendarFragment


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        webFragment = WebFragment()
        calFragment = CalendarFragment()

        supportFragmentManager.beginTransaction()
            .replace(R.id.frag_container, webFragment, "webfragment").commit()
        initBottomTab()
    }

    private fun initBottomTab() {
        val bottom_nav = binding.bottomNavView
        bottom_nav.setOnNavigationItemReselectedListener {
            when (it.itemId) {
                R.id.tab_blog -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.frag_container, webFragment, "webfragment")
                        .commit()
                }
                R.id.tab_calendar -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.frag_container, calFragment, "calfragment")
                        .commit()
                }
            }
        }
    }

}