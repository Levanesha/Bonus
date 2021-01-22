package com.example.myapplicationsada

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class Activity_Two : AppCompatActivity() {

    private lateinit var editTextName: EditText
    private lateinit var editTextLastName: EditText
    private lateinit var editTextJob: EditText
    private lateinit var editTextAge: EditText
    private lateinit var editTextHobby: EditText
    private lateinit var button : Button
    private lateinit var sharedPre:SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_two)

        sharedPre = getSharedPreferences("DATA",Context.MODE_PRIVATE)
        editTextName = findViewById(R.id.editTextName)
        editTextLastName = findViewById(R.id.editTextLastName)
        editTextAge = findViewById(R.id.editTextAge)
        editTextJob = findViewById(R.id.editTextJob)
        editTextHobby = findViewById(R.id.editTextHobby)
        button = findViewById(R.id.buttonSave)


        button.setOnClickListener{

            val name:String = editTextName.text.toString()
            val lastName = editTextLastName.text.toString()
            val age = editTextAge.text.toString().toInt()
            val job = editTextJob.text.toString()
            val hobby = editTextHobby.text.toString()


            val editor : SharedPreferences.Editor = sharedPre.edit()
            editor.putString("NAME",name)
            editor.putString("LASTNAME",lastName)
            editor.putString("JOB",job)
            editor.putString("HOBBY",hobby)
            editor.putInt("AGE",age)
            editor.apply()

            Toast.makeText(this, "Data Saved", Toast.LENGTH_SHORT).show()


        }









    }
}