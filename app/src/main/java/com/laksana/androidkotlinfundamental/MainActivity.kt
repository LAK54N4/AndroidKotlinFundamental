package com.laksana.androidkotlinfundamental

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.laksana.androidkotlinfundamental.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnRoll.setOnClickListener { rollDice() }
        binding.btnCountUp.setOnClickListener { countUp() }
        binding.btnReset.setOnClickListener { reset() }

    }

    private fun rollDice() {
        //Toast.makeText(this, "Button Clicked", Toast.LENGTH_SHORT).show()
        val tvResult = binding.tvResult
        //tvResult.text = "Dice Rolled"
        val randomInt = (1..6).random()
        tvResult.text = randomInt.toString()
    }

    private fun countUp() {
        val tvResult = binding.tvResult
        if (tvResult.text == "Hello World") {
            tvResult.text = "1"
        } else {
            var resultInt = tvResult.text.toString().toInt()

            if (resultInt < 6) {
                resultInt++
                tvResult.text = resultInt.toString()
            }
        }
    }

    private fun reset() {
        val tvResult = binding.tvResult
        tvResult.text = 0.toString()
    }
}