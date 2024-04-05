package com.example.st10454053.myapplication

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // get the button using the id we set on the user interface
        val clickMeButton = findViewById<Button>(R.id.clickMeButton)
        // get the text view and edit text
        findViewById<TextView>(R.id.editTextText)
        findViewById<EditText>(R.id.editTextText)

        // add code to the button that happens when it is clicked
        clickMeButton?.setOnClickListener {
            Toast.makeText(this@MainActivity,
            "Click Me!", Toast.LENGTH_LONG).show()
    }
    }
}








