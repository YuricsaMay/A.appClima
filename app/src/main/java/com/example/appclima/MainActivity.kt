package com.example.appclima

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var tvCiudad:TextView?=null
    var tvGrados:TextView?=null
    var tvEstatus:TextView?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvCiudad=findViewById(R.id.tvCiudad)
        tvGrados=findViewById(R.id.tvGrados)
        tvEstatus=findViewById(R.id.tvEstatus)

        val ciudad = intent.getStringExtra("com.example.appclima.ciudades.CIUDAD")

        val ciudadcancún = Ciudad("Ciudad de Cancún"  , 28, "Nublado")
        val ciudadbacalar = Ciudad("Ciudad de Bacalar",  30,"Despejado")
        val ciudadchetumal = Ciudad("Ciudad de Chetumal",35,"Soleado")
        val ciudadtulum = Ciudad("Ciudad de Tulum", 24,"Lluvioso")

        if (ciudad == "ciudad-cancún") {
            tvCiudad?.text=ciudadcancún.nombre
            tvGrados?.text=ciudadcancún.grados.toString() + "°"
            tvEstatus?.text=ciudadcancún.estatus
        } else if (ciudad == "ciudad-bacalar") {
            tvCiudad?.text=ciudadbacalar.nombre
            tvGrados?.text=ciudadbacalar.grados.toString() + "°"
            tvEstatus?.text=ciudadbacalar.estatus
        } else if (ciudad == "ciudad-chetumal") {
            tvCiudad?.text=ciudadchetumal.nombre
            tvGrados?.text=ciudadchetumal.grados.toString() + "°"
            tvEstatus?.text=ciudadchetumal.estatus

        } else if (ciudad == "ciudad-tulum") {
            tvCiudad?.text=ciudadtulum.nombre
            tvGrados?.text=ciudadtulum.grados.toString() + "°"
            tvEstatus?.text=ciudadtulum.estatus
        } else {
            Toast.makeText(this, "No se encuentra la información", Toast.LENGTH_SHORT).show()
        }
    }
}