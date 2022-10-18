package com.example.diceroller.data

class Dice(val numSides: Int) {

    fun roll(): Int {
        return (1..numSides).random()
    }
}