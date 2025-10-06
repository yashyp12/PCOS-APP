package com.example.pcosdetectionapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.telephony.SmsManager
import android.widget.Button

class Doctorfour : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_doctorfour)

        val btn = findViewById<Button>(R.id.btnsend)

        btn.setOnClickListener {
            val smsManager = SmsManager.getDefault() as SmsManager
            smsManager.sendTextMessage("+917719976370",null,"Hello, I'm interested in booking an appointment with a doctor who specializes in treating PCOS. Can you please assist me with scheduling?",null,null)
        }
    }
}