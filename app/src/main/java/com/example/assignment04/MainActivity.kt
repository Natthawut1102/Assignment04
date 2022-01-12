package com.example.assignment04

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            var num1 = editTextNumberDecimal.text.toString()
            var num2 = editTextNumberDecimal2.text.toString()
            if (num1.isEmpty() || num2.isEmpty())
                return@setOnClickListener Toast.makeText(this@MainActivity, "Please Input Num1 and Num2 !!!", Toast.LENGTH_SHORT).show()
            textView5.text = "+"
            textView7.text = (num1.toDouble() + num2.toDouble()).toString()
        }

        button2.setOnClickListener {
            var num1 = editTextNumberDecimal.text.toString()
            var num2 = editTextNumberDecimal2.text.toString()
            if (num1.isEmpty() || num2.isEmpty())
                return@setOnClickListener Toast.makeText(this@MainActivity, "Please Input Num1 and Num2 !!!", Toast.LENGTH_SHORT).show()
            textView5.text = "-"
            textView7.text = (num1.toDouble() - num2.toDouble()).toString()
        }

        button3.setOnClickListener {
            var num1 = editTextNumberDecimal.text.toString()
            var num2 = editTextNumberDecimal2.text.toString()
            if (num1.isEmpty() || num2.isEmpty())
                return@setOnClickListener Toast.makeText(this@MainActivity, "Please Input Num1 and Num2 !!!", Toast.LENGTH_SHORT).show()
            textView5.text = "*"
            textView7.text = (num1.toDouble() * num2.toDouble()).toString()
        }

        button4.setOnClickListener {
            var num1 = editTextNumberDecimal.text.toString()
            var num2 = editTextNumberDecimal2.text.toString()
            if (num1.isEmpty() || num2.isEmpty())
                return@setOnClickListener Toast.makeText(this@MainActivity, "Please Input Num1 and Num2 !!!", Toast.LENGTH_SHORT).show()
            if (num2.toDouble() == 0.0)
                return@setOnClickListener Toast.makeText(this@MainActivity, "Do Not Num2 is Zero or Null !!!", Toast.LENGTH_SHORT).show()
            textView5.text = "/"
            textView7.text = (num1.toDouble() / num2.toDouble()).toString()
        }

        button5.setOnClickListener {
            var num1 = editTextNumberDecimal.text.toString()
            var num2 = editTextNumberDecimal2.text.toString()
            if (num1.isEmpty() || num2.isEmpty())
                return@setOnClickListener Toast.makeText(this@MainActivity, "Please Input Num1 and Num2 !!!", Toast.LENGTH_SHORT).show()
            if (num2.toDouble() == 0.0)
                return@setOnClickListener Toast.makeText(this@MainActivity, "Do Not Num2 is Zero or Null !!!", Toast.LENGTH_SHORT).show()
            textView5.text = "%"
            textView7.text = (num1.toDouble() % num2.toDouble()).toString()
        }

        button6.setOnClickListener {
            editTextNumberDecimal.text.clear()
            editTextNumberDecimal2.text.clear()
            textView5.text = ""
            textView7.text = ""
        }
    }
}