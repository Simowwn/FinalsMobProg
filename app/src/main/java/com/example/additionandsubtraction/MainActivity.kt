package com.example.additionandsubtraction

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.mikhaellopez.circularprogressbar.CircularProgressBar


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btnBegin = findViewById<Button>(R.id.btnbegin)
        btnBegin.setOnClickListener{
            val i = Intent(this,activity_recyclerview::class.java)
            startActivity(i)
        }

        val btnSave = findViewById<Button>(R.id.btnsave)
        btnSave.setOnClickListener{
            val i = Intent(this, saving::class.java)
            startActivity(i)
        }

    }
}