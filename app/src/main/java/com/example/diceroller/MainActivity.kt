package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.diceroller.data.Dice

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Inflate the layout
        setContentView(R.layout.activity_main)

        // Reference in the code of the UI elements
        val rollButton = findViewById<Button>(R.id.button)
        val resultTextView = findViewById<TextView>(R.id.textView)

        // Action to perform on button click
        rollButton.setOnClickListener {
            resultTextView.text = Dice(6).roll().toString()
        }
    }
}