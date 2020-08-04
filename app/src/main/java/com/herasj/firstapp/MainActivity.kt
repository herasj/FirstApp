package com.herasj.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    companion object {
        var counter = 0
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClickLanzar(view: View) {
        //Log.d("AppDados",  "Presionado")
        counter++
        var textViewCounter : TextView = findViewById(R.id.textCounter)
        textViewCounter.text = "Usted ha presionado el botón $counter veces"
        textViewCounter.x +=1
        textViewCounter.y +=1
        //Toast.makeText(this, "Presionado $counter veces", Toast.LENGTH_SHORT ).show()
    }
}