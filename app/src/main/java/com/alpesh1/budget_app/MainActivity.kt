package com.alpesh1.budget_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.alpesh1.budget_app.R.id.bt_home
import com.alpesh1.budget_app.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        addFragment(Home_Fragment())

    }

    private fun addFragment(fragment: Fragment) {

        supportFragmentManager.beginTransaction().replace(R.id.fragpager,fragment).commit()
    }

}