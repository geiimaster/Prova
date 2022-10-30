package com.example.prova

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    @SuppressLint("CutPasteId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottone = findViewById<Button>(R.id.forsagiuve)
        bottone.setOnClickListener {
            val intenz = Intent(this, SecondActivity::class.java)
            startActivity(intenz)
        }



    }
}
