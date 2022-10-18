package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.diceroller.data.Dice

class MainActivity : AppCompatActivity() {

    // Reference in the code of the UI elements
    private val rollButton: Button = findViewById(R.id.button)
    private val diceImage: ImageView = findViewById(R.id.imageView)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Inflate the layout
        setContentView(R.layout.activity_main)

        // On the button's click, roll the dice
        rollButton.setOnClickListener {
            val diceRoll = Dice(6).roll()

            // Give the correct dice image to the UI, according on the result
            diceImage.setImageResource(
                when(diceRoll) {
                    1 -> R.drawable.dice_1
                    2 -> R.drawable.dice_2
                    3 -> R.drawable.dice_3
                    4 -> R.drawable.dice_4
                    5 -> R.drawable.dice_5
                    else -> R.drawable.dice_6
                }
            )

            // Content description of the image
            diceImage.contentDescription = diceRoll.toString()
        }
    }

}