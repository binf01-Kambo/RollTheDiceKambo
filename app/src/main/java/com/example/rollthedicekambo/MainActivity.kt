package com.example.rollthedicekambo

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val textViewTitle = findViewById<TextView>(R.id.textViewTitle)
        val immagineDado = findViewById<ImageView>(R.id.immagineDado)
        val continuaButton = findViewById<Button>(R.id.continuaButton)

        continuaButton.setOnClickListener(View.OnClickListener {
            val mioToast = Toast.makeText(this, "Continua", Toast.LENGTH_LONG)
            mioToast.show()
            intent()
        })
    }
    private fun intent(){
        val mioIntent = Intent(this, MainActivity2::class.java)
        startActivity(mioIntent)
    }
}