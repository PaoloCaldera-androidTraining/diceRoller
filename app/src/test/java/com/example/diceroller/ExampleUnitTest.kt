package com.example.diceroller

import com.example.diceroller.data.Dice
import org.junit.Test
import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun generates_number() {
        val diceRoll = Dice(6).roll()
        assertTrue("Dice value not between 1 and 6", diceRoll in 1..6)
    }
}