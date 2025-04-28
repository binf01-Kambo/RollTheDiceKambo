package com.example.rollthedicekambo

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)

        val textViewIndovina = findViewById<TextView>(R.id.textViewIndovina)
        val numeroUtente = findViewById<EditText>(R.id.numeroUtente)
        val btnRoll = findViewById<Button>(R.id.btnRoll)
        btnRoll.setOnClickListener{
            val mioRandom = random() //genero un numero random
            val nStringa = numeroUtente.text.toString()
            val input = nStringa.toIntOrNull()
            if(input != null){
                if(input > 0 && input <=6)
                    intent(mioRandom, input)
            }
        }
    }

    private fun random(): Int{
        return (1..6).random()
    }

    private fun intent(mioRandom: Int, input: Int){
        val mioIntent = Intent(this, MainActivity3::class.java)
        mioIntent.putExtra("RANDOM", mioRandom)
        mioIntent.putExtra("INPUT", input)
        startActivity(mioIntent)
    }
}