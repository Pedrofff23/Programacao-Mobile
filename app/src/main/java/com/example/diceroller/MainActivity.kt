package com.example.diceroller

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }

        val addOneButton: Button = findViewById(R.id.add_one_button)
        addOneButton.setOnClickListener{ addOne()}
    }

    private fun rollDice(){
        //Toast.makeText(this, "button clicked", Toast.LENGTH_SHORT).show()
        val randomInt: Int = (1..6).random()

        var resultText: TextView = findViewById(R.id.result_text)
        resultText.text = randomInt.toString()
    }

    private fun addOne(): Unit {
        val resultText: TextView = findViewById(R.id.result_text);


        if (resultText.text == "Hello World") {
            resultText.text = "1"
        }else {
            if (resultText.text.toString().toInt() < 6){
                resultText.text = (resultText.text.toString().toInt()+1).toString()
            }
        }
    }
}