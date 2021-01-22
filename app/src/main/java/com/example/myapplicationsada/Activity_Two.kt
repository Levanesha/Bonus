package com.example.myapplicationsada

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class Activity_Two : AppCompatActivity() {

    private lateinit var editTextName: EditText
    private lateinit var button : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_two)


        editTextName = findViewById(R.id.editTextName)
        button = findViewById(R.id.buttonSave)

        button.setOnClickListener{
            val input = editTextName.text.toString()


            val intent = Intent(this,Activity_One::class.java)
            intent.putExtra("ITEM",input)

            startActivity(intent)

        }


    }
}