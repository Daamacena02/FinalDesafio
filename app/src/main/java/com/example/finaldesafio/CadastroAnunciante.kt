package com.example.finaldesafio

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class CadastroAnunciante: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.cadastroanunciante)

        val button = findViewById<Button>(R.id.button3)

        button.setOnClickListener {
            val botao = Intent(this, ConsultaVagas::class.java)
            startActivity(botao)
        }
    }
}