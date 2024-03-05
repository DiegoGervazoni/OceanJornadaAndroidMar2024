package com.example.oceanandroidjornadamar2024

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Procura pelo ID com o findViewer
        val btnEnviar = findViewById<Button>(R.id.btnEnviar)
        val tvResultado = findViewById<TextView>(R.id.tvResultado)

        // Para criar um Listener
        btnEnviar.setOnClickListener{
            tvResultado.text = "E lá vamos nós!"
        }
    }
}