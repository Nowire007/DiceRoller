package com.zalego.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener {
            rollDice()
        }
    }

    private  fun rollDice() {
        val dice = Dice(6)
        val diceRoll= dice.roll()
        val diceRoll2=dice.roll2()
        val resultTextview: TextView = findViewById(R.id.textView)
        val resultTextView2: TextView = findViewById(R.id.textView2)
        resultTextview.text=diceRoll.toString()
        resultTextView2.text=diceRoll2.toString()

    }
}
class Dice(private val numSides:Int ){
    fun roll(): Int {
        return (1..numSides).hashCode()
    }
    fun roll2(): Int {
        return (1..numSides).hashCode()
    }
}

