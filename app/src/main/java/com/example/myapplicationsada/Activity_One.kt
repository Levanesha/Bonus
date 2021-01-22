package com.example.myapplicationsada

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Activity_One : AppCompatActivity() {
    lateinit var sharedPre:SharedPreferences
    lateinit var textViewName:TextView
    lateinit var textViewLastName:TextView
    lateinit var textViewAge:TextView
    lateinit var textViewJob:TextView
    lateinit var textViewHobby:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_one)

    sharedPre = getSharedPreferences("DATA",Context.MODE_PRIVATE)
        textViewName = findViewById(R.id.textViewName)
        textViewLastName = findViewById(R.id.textViewLastName)
        textViewAge = findViewById(R.id.textViewAge)
        textViewJob = findViewById(R.id.textViewJob)
        textViewHobby = findViewById(R.id.textViewHobby)

        val name = sharedPre.getString("NAME","")
        textViewName.text = name

        val lastName = sharedPre.getString("LASTNAME","")
        textViewName.text = lastName

        val age = sharedPre.getInt("AGE",0)
        textViewName.text = age.toString()

        val job = sharedPre.getString("JOB","")
        textViewName.text = job

        val hobby = sharedPre.getString("HOBBY","")
        textViewName.text = hobby

    }
}