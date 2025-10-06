package com.example.pcosdetectionapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class suggest : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_suggest)


        val btnfood = findViewById<Button>(R.id.btnfood)

        btnfood.setOnClickListener {
            val intent = Intent(applicationContext,food::class.java)
            startActivity(intent)

        }
        val btntips = findViewById<Button>(R.id.btntips)

        btntips.setOnClickListener {
            val intent = Intent(applicationContext,tips::class.java)
            startActivity(intent)

        }

        val btnyoga = findViewById<Button>(R.id.btnyoga)

        btnyoga.setOnClickListener {
            val intent = Intent(applicationContext,yoga::class.java)
            startActivity(intent)

        }
    }
}