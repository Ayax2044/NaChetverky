package com.example.adas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
    fun btnClick(view: View)
    {
        val b1: Button = findViewById(R.id.button)
        val t1: TextView = findViewById(R.id.editTextText)
        val tv: TextView = findViewById(R.id.textView3)
        val breed : String = t1.text.toString()

        if(breed == "Шотландец"){
            val intent = Intent(this@MainActivity, MainActivity2::class.java)
            intent.putExtra("breed", breed)
            startActivity(intent)
        }
        if(breed == "Сиамская") {
            val intent = Intent(this@MainActivity, MainActivity2::class.java)
            intent.putExtra("breed", breed)
            startActivity(intent)
        }
        if (breed == "Персидская"){
            val intent = Intent(this@MainActivity, MainActivity2::class.java)
            intent.putExtra("breed", breed)
            startActivity(intent)
        }
        else{
            tv.text = ("Такой породы нет в БД")
        }

    }


}