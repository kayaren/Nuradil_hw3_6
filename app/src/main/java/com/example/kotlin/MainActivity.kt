package com.example.kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    private lateinit var editText1: EditText
    private lateinit var editText2: EditText
    private lateinit var editText3: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        editText1 = findViewById(R.id.EditText)
        editText2 = findViewById(R.id.EditText2)
        editText3 = findViewById(R.id.EditText3)


        val button: Button = findViewById(R.id.button)
        button.setOnClickListener {
            val data1 = editText1.text.toString()
            val data2 = editText2.text.toString()
            val data3 = editText3.text.toString()

            val intent = Intent (this,SecondActivity::class.java)
            intent.putExtra("name", data1)
            intent.putExtra("familiya", data2)
            intent.putExtra("data", data3)
            startActivity(intent)
        }
    }
}