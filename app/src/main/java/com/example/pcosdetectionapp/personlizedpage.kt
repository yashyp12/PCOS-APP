package com.example.pcosdetectionapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class personlizedpage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_personlizedpage)

        val btn = findViewById<Button>(R.id.button)

        btn.setOnClickListener {

            val intent = Intent(applicationContext,youare::class.java)
            startActivity(intent)
        }
    }
}