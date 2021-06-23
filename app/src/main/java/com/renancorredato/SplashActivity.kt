package com.renancorredato

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.renancorredato.MainActivity.Companion.KEY_INTENTE_NOME
import com.renancorredato.MainActivity.Companion.KEY_INTENTE_SALDO

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val nome = intent.getStringExtra(KEY_INTENTE_NOME)
        val saldo = intent.getDoubleExtra(KEY_INTENTE_SALDO,0.0)

        Log.i("resultIntent", "Meu nome: $nome" +
        " ,meu saldo é $saldo")

        MainActivity.printarValor()
    }
}