package com.example.vinilos.ui.main.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.vinylsMobile.vinylsapplication.databinding.ActivityMainBinding
import com.vinylsMobile.vinylsapplication.databinding.ActivitySelectProfileBinding

class SelectProfileActivity : AppCompatActivity() {
    private lateinit var binding : ActivitySelectProfileBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySelectProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)



    }
}