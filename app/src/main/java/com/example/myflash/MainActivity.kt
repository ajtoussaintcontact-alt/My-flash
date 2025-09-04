package com.example.myflash

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val flash_question = findViewById<TextView>(R.id.flash_question)
        val flash_reponse = findViewById<TextView>(R.id.flash_reponse)
        flash_question.setOnClickListener {
            flash_question.visibility = View.INVISIBLE
            flash_reponse.visibility = View.VISIBLE
        }
    }
}