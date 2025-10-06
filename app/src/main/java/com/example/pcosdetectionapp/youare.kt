package com.example.pcosdetectionapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class youare : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_youare)

        val btn = findViewById<Button>(R.id.btnlogin)

        btn.setOnClickListener {

            val intent = Intent(applicationContext,healthgoal::class.java)
            startActivity(intent)
        }
    }
}