package com.example.weatherapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val texViewHello = findViewById<TextView>(R.id.tvHello)
        texViewHello.text ="<p>Привет!</p> мир!" +
                "changes just fore test github connection"
    }
}