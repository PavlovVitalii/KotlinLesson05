package com.example.kotlinlesson05

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nextId = findViewById<CardView>(R.id.next)
        val text = getString(R.string.Message)

        nextId.setOnClickListener {
            Toast.makeText(this, text, Toast.LENGTH_SHORT).show()
        }
    }
}
