package com.example.pcosdetectionapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class backget : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_backget)

        val btn = findViewById<Button>(R.id.button)

        btn.setOnClickListener {

            val intent = Intent(applicationContext,personlizedpage::class.java)
            startActivity(intent)
        }
    }
}