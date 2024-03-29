package com.example.oceanandroidjornadamar2024

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Procura pelo ID com o findViewer
        val btnEnviar = findViewById<Button>(R.id.btnEnviar)
        val tvResultado = findViewById<TextView>(R.id.tvResultado)
        val etNome = findViewById<EditText>(R.id.etNome)

        // Para criar um Listener
        btnEnviar.setOnClickListener{

            if(etNome.text.isNotBlank()){
                tvResultado.text = etNome.text
            }else {
                etNome.error = getString(R.string.insert_a_valid_name)
            }
        }

        // Comportamento do botao abrir nova tela
        val btAbrirNovaTela =  findViewById<Button>(R.id.btAbrirNovaTela)

        btAbrirNovaTela.setOnClickListener {

            val novaTelaIntent = Intent(this, ResultadoActivity::class.java)

            novaTelaIntent.putExtra("NOME_DIGITADO", etNome.text.toString())

            startActivity(novaTelaIntent)
        }
    }
}