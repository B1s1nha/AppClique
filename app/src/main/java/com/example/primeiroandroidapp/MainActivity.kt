package com.example.primeiroandroidapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnClickMe = findViewById<Button>(R.id.clickmebutton)
        val tvMyTextView = findViewById<TextView>(R.id.textView)
        var timesClicked = 0
        btnClickMe.setOnClickListener {
            timesClicked++
            tvMyTextView.text = timesClicked.toString()
            Toast.makeText(this, "Hey! stop touching me!", Toast.LENGTH_LONG).show()
        }
    }
}