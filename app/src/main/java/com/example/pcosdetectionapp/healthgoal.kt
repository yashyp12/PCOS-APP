package com.example.pcosdetectionapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class healthgoal : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_healthgoal)

        val btn = findViewById<Button>(R.id.button6)

        btn.setOnClickListener {

            val intent = Intent(applicationContext,MainActivity::class.java)
            startActivity(intent)
        }
    }
}