package com.herasj.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    companion object {
        //var counter = 0
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClickLanzar(view: View) {
        val dice = Dice(nlados = 6)
        val diceFace: Int = dice.play()
        Log.d("Valor", "La cara del dado es: $diceFace")
        when(diceFace){
            1 -> imageViewDice.setImageResource(R.drawable.dice_1)
            2 -> imageViewDice.setImageResource(R.drawable.dice_2)
            3 -> imageViewDice.setImageResource(R.drawable.dice_3)
            4 -> imageViewDice.setImageResource(R.drawable.dice_4)
            5 -> imageViewDice.setImageResource(R.drawable.dice_5)
            6 -> imageViewDice.setImageResource(R.drawable.dice_6)
        }
        //counter++

    }
}