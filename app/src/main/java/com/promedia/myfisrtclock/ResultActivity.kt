package com.promedia.myfisrtclock

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.promedia.myfisrtclock.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {
    private lateinit var binding: ActivityResultBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //TODO Recibir la hora de MainActivity
        val datos = intent.extras
        val horas = datos?.get("INTENT_HORAS").toString()
        val minutos = datos?.get("INTENT_MINUTOS").toString()
        val segundos = datos?.get("INTENT_SEGUNDOS").toString()
        binding.tvHoraFinal.text = "$horas:$minutos:$segundos"

        binding.btnVolver.setOnClickListener {
            val myIntent = Intent(this, MainActivity::class.java)
            startActivity(myIntent)
        }
    }
}
