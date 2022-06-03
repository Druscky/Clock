package com.promedia.myfisrtclock

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import com.promedia.myfisrtclock.databinding.ActivityMainBinding
import kotlin.concurrent.timerTask

class MainActivity : AppCompatActivity() {
    val tag = "MainActivity"
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnAceptar.setOnClickListener {
            checkValue()
        }

        //TODO Función para los botones de Subir y Bajar
    binding.btnSubirHoras.setOnClickListener {
        val myTV = tvToInt(binding.tvHoras)
        if (myTV < 23){
            if(myTV >= 9)
                binding.tvHoras.text = myTV.inc().toString()
            else
                binding.tvHoras.text = "0" + myTV.inc().toString()
        }
    }
    binding.btnSubirMinutos.setOnClickListener {
        val myTV = tvToInt(binding.tvMinutos)
        if (myTV < 59){
            if(myTV >= 9)
                binding.tvHoras.text = myTV.inc().toString()
            else
                binding.tvHoras.text = "0" + myTV.inc().toString()
        }
    }
    binding.btnSubirSegundos.setOnClickListener {
        val myTV = tvToInt(binding.tvSegundos)
        if (myTV < 59){
            if(myTV >= 9)
                binding.tvHoras.text = myTV.inc().toString()
            else
                binding.tvHoras.text = "0" + myTV.inc().toString()
        }
    }
    binding.btnBajarHoras.setOnClickListener {
        val myTV = tvToInt(binding.tvHoras)
        if (myTV > 0){
            if(myTV >= 9)
                binding.tvHoras.text = myTV.dec().toString()
            else
                binding.tvHoras.text = "0" + myTV.dec().toString()
        }
    }
    binding.btnBajarMinutos.setOnClickListener {
        val myTV = tvToInt(binding.tvMinutos)
        if (myTV > 0){
            if(myTV >= 9)
                binding.tvHoras.text = myTV.dec().toString()
            else
                binding.tvHoras.text = "0" + myTV.dec().toString()
        }
    }
    binding.btnBajarSegundos.setOnClickListener {
        val myTV = tvToInt(binding.tvSegundos)
        if (myTV > 0){
            if(myTV >= 9)
                binding.tvHoras.text = myTV.dec().toString()
            else
                binding.tvHoras.text = "0" + myTV.dec().toString()
        }
    }
    }
    fun tvToInt(tv:TextView):Int{
        return tv.text.toString().toInt()

    }
    fun checkValue() {
        if (binding.tvHoras.text.isNotEmpty()) {
            val myIntent = Intent(this, ResultActivity::class.java)
            myIntent.putExtra("INTENT_HORAS", binding.tvHoras.text)
            myIntent.putExtra("INTENT_MINUTOS", binding.tvMinutos.text)
            myIntent.putExtra("INTENT_SEGUNDOS", binding.tvSegundos.text)
            startActivity(myIntent)
        }
    }
}



        //TODO Función para las Horas
        //TODO función para los Minutos y duplicarlo para los Segundos
        //TODO Enviar el Registro a ResultActivity
        //TODO Botón de Enviar





