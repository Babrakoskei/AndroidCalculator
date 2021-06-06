package com.example.calculatorapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val etNum1 = findViewById<EditText>(R.id.etNum1)
        val etNum2 = findViewById<EditText>(R.id.etNum2)
        val BtnAdd = findViewById<TextView>(R.id.BtnAdd)
        val BtnMinus = findViewById<TextView>(R.id.BtnMinus)
        val BtnMult = findViewById<TextView>(R.id.BtnMult)
        val BtnMod = findViewById<TextView>(R.id.BtnMod)
        val tvAnswer = findViewById<TextView>(R.id.tvAnswer)


        BtnAdd.setOnClickListener {
            if (etNum1.text.toString() == "") {
                Toast.makeText(baseContext, "Enter any number", Toast.LENGTH_LONG).show()
            } else if (etNum2.text.toString() == "") {
                Toast.makeText(baseContext, "Enter any number", Toast.LENGTH_LONG).show()
            } else {
                val num1 = etNum1.text.toString().toInt()
                val num2 = etNum2.text.toString().toInt()
                val plusAnswer = num1 + num2
                tvAnswer.text = "answer: ${plusAnswer}"

            }
        }

        BtnMinus.setOnClickListener {
            if (etNum1.text.toString() == "") {
                Toast.makeText(baseContext, "Enter any number", Toast.LENGTH_LONG).show()
            } else if (etNum2.text.toString() == "") {
                Toast.makeText(baseContext, "Enter any number", Toast.LENGTH_LONG).show()
            } else {
                val num1 = etNum1.text.toString().toInt()
                val num2 = etNum2.text.toString().toInt()
                val minusAnswer = num1 - num2
                tvAnswer.text = "answer: ${minusAnswer}"


            }
        }
        BtnMult.setOnClickListener {
            if (etNum1.text.toString() == "") {
                Toast.makeText(baseContext, "Enter any number", Toast.LENGTH_LONG).show()
            } else if (etNum2.text.toString() == "") {
                Toast.makeText(baseContext, "Enter any number", Toast.LENGTH_LONG).show()
            } else {
                val num1 = etNum1.text.toString().toInt()
                val num2 = etNum2.text.toString().toInt()
                val multAnswer = num1*num2
                tvAnswer.text = "answer: ${multAnswer}"


            }
        }
        BtnMod.setOnClickListener {
            if (etNum1.text.toString() == "") {
                Toast.makeText(baseContext, "Enter any number", Toast.LENGTH_LONG).show()
            } else if (etNum2.text.toString() == "") {
                Toast.makeText(baseContext, "Enter any number", Toast.LENGTH_LONG).show()
            } else {
                val num1 = etNum1.text.toString().toInt()
                val num2 = etNum2.text.toString().toInt()
                val modAnswer = num1 % num2
                tvAnswer.text = "answer: ${modAnswer}"


            }
        }
    }
}