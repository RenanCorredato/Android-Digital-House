package com.renancorredato


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.widget.Button
import com.renancorredato.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Log.i("lifecycle", "onCreate")

//       findViewById<Button>(R.id.helloword).setOnClickListener {
//        startActivity(Intent(this@MainActivity, SplashActivity::class.java)) Click do botão  ir para outra tela
//        }

//        findViewById<Button>(R.id.helloword).setOnClickListener {
<<<<<<< HEAD
//         val intent = Intent(this@MainActivity, SplashActivity::class.java) // pasando uma informação para outra tela Splash
//            intent.putExtra(KEY_INTENTE_NOME,"Renan Corredato" )
=======
//         val intent = Intent(this@MainActivity, SplashActivity::class.java)
//            intent.putExtra(KEY_INTENTE_NOME,"Renan Corredato" )// pasando uma informação para outra tela Splash
>>>>>>> 3aa45c57ff24d3b11681748a51e63cbb265b7fa0
//            intent.putExtra(KEY_INTENTE_SALDO, 50.0)
//            startActivity(intent)
//
//            // MainActivity -> pacote(Intent) -> SplashActivity
//        }
   }

    override fun onStart() {
        super.onStart()
        Log.i("lifecycle", "onStart")
    }

    override fun onResume() {
        super.onResume()

        Log.i("lifecycle", "onResume")
    }

    override fun onDestroy() {
        super.onDestroy()

        Log.i("lifecycle", "onDestroy")
    }

    override fun onPause() {
        super.onPause()

        Log.i("lifecycle", "onPause")
    }

    override fun onStop() {
        super.onStop()

        Log.i("lifecycle", "onStop")
    }

    companion object{
        const val KEY_INTENTE_NOME = "nome"
        const val KEY_INTENTE_SALDO = "saldo"

        fun printarValor(){
            Log.i("print", "método estático")
        }

    }
}
