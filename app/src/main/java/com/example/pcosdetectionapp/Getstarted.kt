package com.example.pcosdetectionapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.example.pcosdetectionapp.databinding.ActivityGetstartedBinding
import com.example.pcosdetectionapp.databinding.ActivityMainBinding

class Getstarted : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_getstarted)



//        binding = ActivityGetstartedBinding.inflate(layoutInflater)
//        val view = binding.root

        val btn = findViewById<Button>(R.id.button5)

        btn.setOnClickListener {

            val intent = Intent(applicationContext,backget::class.java)
            startActivity(intent)
        }

    }
}