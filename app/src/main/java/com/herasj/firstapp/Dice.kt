package com.herasj.firstapp

class Dice (val nlados: Int) {
fun play(): Int{ //Return the face of the dice
    return (1..nlados).random()
}
}