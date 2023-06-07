package com.example.finaldesafio

import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class DetalhesVagas: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detalhesvagas)

        val button = findViewById<Button>(R.id.botao_voltarconsultavagas)
        val botao = findViewById<Button>(R.id.botao_candidatarvagas)

        val text = "Cadastro efetuado com sucesso!"
        val duration = Toast.LENGTH_SHORT

        button.setOnClickListener {
            finish()
            val toast = Toast.makeText(applicationContext, text, duration)
            toast.show()
        }

        button.setOnClickListener {
            val botao = Intent(this, DetalhesVagas::class.java)
            startActivity(botao)
            val toast = Toast.makeText(applicationContext, text, duration)
            toast.show()
        }
    }
}