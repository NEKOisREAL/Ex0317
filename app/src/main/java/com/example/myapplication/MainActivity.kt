package com.example.myapplication

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

        var button:Button = findViewById(R.id.button)
            var et1:EditText = findViewById(R.id.edittext1)
            var tv:TextView = findViewById(R.id.textview1)

        button.mytext("Click Me")
        button.setOnClickListener{
            Toast.makeText(this,"HI, 龍泉",Toast.LENGTH_LONG).show()
        }


    }
}