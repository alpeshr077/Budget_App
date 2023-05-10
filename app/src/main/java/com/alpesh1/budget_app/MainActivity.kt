package com.alpesh1.budget_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.alpesh1.budget_app.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}