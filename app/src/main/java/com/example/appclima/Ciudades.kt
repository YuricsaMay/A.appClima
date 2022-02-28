package com.example.appclima

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import android.content.Intent


class Ciudades : AppCompatActivity() {

    val TAG ="com.example.appclima.ciudades.CIUDAD"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ciudades)

        val bCancun=findViewById<Button>(R.id.bCancun)
        val bBacalar=findViewById<Button>(R.id.bBacalar)
        val bChetumal=findViewById<Button>(R.id.bChetumal)
        val bIslam=findViewById<Button>(R.id.bIslam)

        bCancun.setOnClickListener(View.OnClickListener {
            val intent= Intent(this,MainActivity::class.java)
            intent.putExtra(TAG, "ciudad-cancún")
            startActivity(intent)
        })
        bBacalar.setOnClickListener(View.OnClickListener {
            val intent= Intent(this,MainActivity::class.java)
            intent.putExtra(TAG, "ciudad-bacalar")
            startActivity(intent)
        })
        bChetumal.setOnClickListener(View.OnClickListener {
            val intent= Intent(this,MainActivity::class.java)
            intent.putExtra(TAG, "ciudad-chetumal")
            startActivity(intent)
        })
        bIslam.setOnClickListener(View.OnClickListener {
            val intent= Intent(this,MainActivity::class.java)
            intent.putExtra(TAG, "ciudad-tulum")
            startActivity(intent)
        })
    }
}