package com.example.indigocardgame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.indigocardgame.databinding.ActivityMainBinding
import com.example.indigocardgame.databinding.ActivityNewGameBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.newGameButton.setOnClickListener {
            val intent:Intent = Intent(this, NewGame::class.java)
            startActivity(intent)
        }
        binding.rulesButton.setOnClickListener {
            val intent:Intent = Intent(this, Rules::class.java)
            startActivity(intent)
        }
        binding.historyButton.setOnClickListener {
            val intent:Intent = Intent(this, History::class.java)
            startActivity(intent)
        }
    //startNewGame(binding.newGameButton)

    }

    /*public fun startNewGame(view: View) {
        val intent:Intent = Intent(this, ActivityNewGameBinding::class.java)
        startActivity(intent)
    }*/
}