package com.example.pcosdetectionapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class tips : AppCompatActivity() {
    @SuppressLint("WrongViewCast", "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tips)

        val btn = findViewById<ImageView>(R.id.squart)

        btn.setOnClickListener {

            val intent = Intent(applicationContext,Doctorone::class.java)
            startActivity(intent)
        }



        val btn1 = findViewById<ImageView>(R.id.doctor)

        btn1.setOnClickListener {

            val intent = Intent(applicationContext,Doctortwo::class.java)
            startActivity(intent)
        }

        val btn2 = findViewById<ImageView>(R.id.doctorthree)

        btn2.setOnClickListener {

            val intent = Intent(applicationContext,Doctorthree::class.java)
            startActivity(intent)
        }

        val btn3 = findViewById<ImageView>(R.id.doctorfour)

        btn3.setOnClickListener {

            val intent = Intent(applicationContext,Doctorfour::class.java)
            startActivity(intent)
        }
    }
}