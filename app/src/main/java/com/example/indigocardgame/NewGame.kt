package com.example.indigocardgame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.indigocardgame.databinding.ActivityMainBinding
import com.example.indigocardgame.databinding.ActivityNewGameBinding

class NewGame : AppCompatActivity() {
    private lateinit var binding: ActivityNewGameBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNewGameBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }
}