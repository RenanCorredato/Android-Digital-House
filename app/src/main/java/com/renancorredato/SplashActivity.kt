package com.renancorredato

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI.setupWithNavController
import androidx.navigation.ui.setupActionBarWithNavController
import com.renancorredato.MainActivity.Companion.KEY_INTENTE_NOME
import com.renancorredato.MainActivity.Companion.KEY_INTENTE_SALDO
import com.renancorredato.databinding.ActivitySplashBinding

class SplashActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val nome = intent.getStringExtra(KEY_INTENTE_NOME)
        val saldo = intent.getDoubleExtra(KEY_INTENTE_SALDO,0.0)

        Log.i("resultIntent", "Meu nome é - $nome" +
        " ,meu saldo é $saldo")

        val navControlle = Navigation.findNavController(this, R.id.nav_host_fragment)
        setupWithNavController(binding.bottomNavigation, navControlle)

//        val bundle = Bundle()
//        bundle.putString("TesteString", "xpto")
//        bundle.putDouble("TesteDouble", 1.0)
//        bundle.putFloat("TesteFloat", 1.0F)
//
//        val bundle1 = Bundle().apply {
//          putString("TesteString", "xpto")
//          putDouble("TesteDouble", 1.0)
//          putFloat("TesteFloat", 1.0F)
//        }.also {
//            Log.i("xpto", "Bundle Intanciado com sucesso ")
//        }
//
//        with(bundle1){
//            getString()
//            getDouble()
//        }
//
//       bundle1.let{
//           it.getString()
//          it.getDouble()
//        }

        MainActivity.printarValor()
    }
}