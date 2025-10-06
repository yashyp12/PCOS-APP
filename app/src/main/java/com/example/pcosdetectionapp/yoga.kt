package com.example.pcosdetectionapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.widget.TextView

class yoga : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_yoga)


        val txtlink=findViewById<TextView>(R.id.txtsquart)
        txtlink.movementMethod = LinkMovementMethod.getInstance()
        val txtlink1=findViewById<TextView>(R.id.txtLunges)
        txtlink1.movementMethod = LinkMovementMethod.getInstance()
        val txtlink2=findViewById<TextView>(R.id.txtWallSits)
        txtlink2.movementMethod = LinkMovementMethod.getInstance()
        val txtlink3=findViewById<TextView>(R.id.txtyoga)
        txtlink3.movementMethod = LinkMovementMethod.getInstance()


    }
}