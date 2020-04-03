package com.example.myfirstproject

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.VISIBLE
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        window.decorView.setBackgroundColor(Color.RED)
        amountLabel.visibility = View.INVISIBLE

        calculateButton.setOnClickListener {
            val bill: Double = billTextField.text.toString().toDouble()
        val percentage = tipTextField.text.toString().toDouble()/100
        val tip = bill*percentage
        val amount = bill + tip
        print("amount" + amount)
        String.format("%.2f", tip)
        // amountLabel.text = "Tip: \$" + tip +  "Amount: \$" + amount
        amountLabel.text = "Tip: ${doubleToDollar(tip)} Amount: ${doubleToDollar(amount)}"
        amountLabel.visibility = VISIBLE
    }

    }

    fun doubleToDollar(number: Double): String {
         return "$" + String.format("%.2f", number)
    }

}
