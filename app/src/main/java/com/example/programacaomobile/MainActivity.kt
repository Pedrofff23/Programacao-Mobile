package com.example.programacaomobile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.lang.Integer.parseInt

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }

        val count: Button = findViewById(R.id.countUp)
        count.setOnClickListener { countUp() }
    }private fun rollDice() {
        val randomInt = (1..6).random()
//        Toast.makeText(this, "button clicked",
//            Toast.LENGTH_SHORT).show()
        val resultText: TextView = findViewById(R.id.result_text)
        resultText.text = randomInt.toString()
    }private  fun countUp(){
        val resultText: TextView = findViewById(R.id.result_text)
        var string = resultText.text.toString()

        if (string== "Olá Mundo"){
            var num = 1
            resultText.text = num.toString()
        }else{
            var num = parseInt(string)
            if(num >= 0 && num < 6 ){
                num += 1
                resultText.text = num.toString()
            }
        }
    }
}