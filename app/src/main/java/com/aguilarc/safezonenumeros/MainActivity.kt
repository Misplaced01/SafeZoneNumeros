package com.aguilarc.safezonenumeros

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_numeros_emergencias.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        toolBar.setTitle("SAFE ZONE")
        setSupportActionBar(toolBar)

        val fragmentAdapter = MyPagerAdapter(supportFragmentManager)
        viewPager.adapter = fragmentAdapter

        tabLayout.setupWithViewPager(viewPager)
    }
    
}


