package com.example.adas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val t2: TextView = findViewById(R.id.textView)
        val v1: ImageView = findViewById(R.id.imageView)
        val extras: Bundle? = intent.extras
        if (extras != null) {
            val breed: String? = extras?.getString("breed").toString()
            if (breed!! == "Шотландец"){
                t2.setText(R.string.Shotlandskai)
                v1.setImageResource(R.drawable.cat)
            }
            if (breed!! == "Сиамская"){
                t2.setText(R.string.Siamskai)
                v1.setImageResource(R.drawable.cat1)
            }
            if (breed!! == "Персидская"){
                t2.setText(R.string.persidskai)
                v1.setImageResource(R.drawable.caat2)
            }
        }

    }

}