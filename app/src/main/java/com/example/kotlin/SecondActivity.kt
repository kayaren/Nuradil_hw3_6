package com.example.kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {

    private lateinit var textView1: TextView
    private lateinit var textView2: TextView
    private lateinit var textView3: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        textView1 = findViewById(R.id.TextView)
        textView2 = findViewById(R.id.TextView2)
        textView3 = findViewById(R.id.TextView3)

        val data1 = intent.getStringExtra("data1")
        val data2 = intent.getStringExtra("data2")
        val data3 = intent.getStringExtra("data3")

        textView1.text = "Data 1: $data1"
        textView2.text = "Data 2: $data2"
        textView3.text = "Data 3: $data3"



    }
}