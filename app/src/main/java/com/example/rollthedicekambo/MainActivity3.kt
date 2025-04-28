package com.example.rollthedicekambo

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main3)

        val mioRandom = intent.getIntExtra("RANDOM", -1)
        val input = intent.getIntExtra("INPUT", -1)
        val textViewRisultato = findViewById<TextView>(R.id.textViewRisultato) //campo di testo per il risultato
        val dadi = findViewById<ImageView>(R.id.dadi)
        val immaginiDadi = when(mioRandom){
            1 -> R.drawable.dice_face_1
            2 -> R.drawable.dice_face_2
            3 -> R.drawable.dice_face_3
            4 -> R.drawable.dice_face_4
            5 -> R.drawable.dice_face_5
            else -> {R.drawable.dice_face_6}
        }
        dadi.setImageResource(immaginiDadi as Int)
        if(mioRandom == input){
            textViewRisultato.text = "Hai vinto!"
        }
        else{
            textViewRisultato.text = "Hai perso!"
        }
    }
}