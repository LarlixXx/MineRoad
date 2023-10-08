package com.jtok.jhq.faaf.co.mine.road

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlin.random.Random
    val start = 1
    val end = 2

class MainActivity : AppCompatActivity() {
    @SuppressLint("ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var points = 0

        val btn1 = findViewById<Button>(R.id.btn5)
        val btn11 = findViewById<Button>(R.id.btn6)

        val btn2 = findViewById<Button>(R.id.btn9)
        val btn22 = findViewById<Button>(R.id.btn10)

        val btn3 = findViewById<Button>(R.id.btn1)
        val btn33 = findViewById<Button>(R.id.btn2)

        val btn4 = findViewById<Button>(R.id.btn7)
        val btn44 = findViewById<Button>(R.id.btn8)

        val btn5 = findViewById<Button>(R.id.btn3)
        val btn55 = findViewById<Button>(R.id.btn4)

        val btnNewGame = findViewById<Button>(R.id.btn_newgame)
        var score = findViewById<TextView>(R.id.score_tv)

        fun start(){
            btn1.setEnabled(true)
            btn11.setEnabled(true)
            btn2.setEnabled(false)
            btn22.setEnabled(false)
            btn3.setEnabled(false)
            btn33.setEnabled(false)
            btn4.setEnabled(false)
            btn44.setEnabled(false)
            btn5.setEnabled(false)
            btn55.setEnabled(false)
        }
        start()
        fun rand(start: Int, end: Int): Int {
            require(start <= end) { "Illegal Argument" }
            val rand = Random(System.nanoTime())
            return (start..end).random(rand)
        }

        btn1.setOnClickListener {
            if( rand(start, end) == 1 ){
                btn11.setEnabled(false)
                btn1.setEnabled(false)
                points+=100
                score.text = "SCORE:$points"
                btn2.setEnabled(true)
                btn22.setEnabled(true)

            }else{
                btn1.setEnabled(false)
                btn11.setEnabled(false)
                btn2.setEnabled(false)
                btn22.setEnabled(false)
                btn3.setEnabled(false)
                btn33.setEnabled(false)
                btn4.setEnabled(false)
                btn44.setEnabled(false)
                btn5.setEnabled(false)
                btn55.setEnabled(false)
                points-=200
                score.text = "SCORE:$points"
            }
        }
        btn11.setOnClickListener {
            if( rand(start, end) == 1 ){
                btn1.setEnabled(false)
                btn11.setEnabled(false)
                btn2.setEnabled(true)
                btn22.setEnabled(true)
                points+=100
                score.text = "SCORE:$points"

            }else{
                btn1.setEnabled(false)
                btn11.setEnabled(false)
                btn2.setEnabled(false)
                btn22.setEnabled(false)
                btn3.setEnabled(false)
                btn33.setEnabled(false)
                btn4.setEnabled(false)
                btn44.setEnabled(false)
                btn5.setEnabled(false)
                btn55.setEnabled(false)
                points-=200
                score.text = "SCORE:$points"
            }
        }
        btn2.setOnClickListener {
            if( rand(start, end) == 1 ){
                btn22.setEnabled(false)
                btn2.setEnabled(false)
                btn3.setEnabled(true)
                btn33.setEnabled(true)
                points+=250
                score.text = "SCORE:$points"

            }else{
                btn1.setEnabled(false)
                btn11.setEnabled(false)
                btn2.setEnabled(false)
                btn22.setEnabled(false)
                btn3.setEnabled(false)
                btn33.setEnabled(false)
                btn4.setEnabled(false)
                btn44.setEnabled(false)
                btn5.setEnabled(false)
                btn55.setEnabled(false)
                points-=200
                score.text = "SCORE:$points"
            }
        }
        btn22.setOnClickListener {
            if( rand(start, end) == 1 ){
                btn2.setEnabled(false)
                btn22.setEnabled(false)
                btn3.setEnabled(true)
                btn33.setEnabled(true)
                points+=250
                score.text = "SCORE:$points"

            }else{
                btn1.setEnabled(false)
                btn11.setEnabled(false)
                btn2.setEnabled(false)
                btn22.setEnabled(false)
                btn3.setEnabled(false)
                btn33.setEnabled(false)
                btn4.setEnabled(false)
                btn44.setEnabled(false)
                btn5.setEnabled(false)
                btn55.setEnabled(false)
                points-=200
                score.text = "SCORE:$points"
            }
        }
        btn3.setOnClickListener {
            if( rand(start, end) == 1 ){
                btn33.setEnabled(false)
                btn3.setEnabled(false)
                btn4.setEnabled(true)
                btn44.setEnabled(true)
                points+=500
                score.text = "SCORE:$points"

            }else{
                btn1.setEnabled(false)
                btn11.setEnabled(false)
                btn2.setEnabled(false)
                btn22.setEnabled(false)
                btn3.setEnabled(false)
                btn33.setEnabled(false)
                btn4.setEnabled(false)
                btn44.setEnabled(false)
                btn5.setEnabled(false)
                btn55.setEnabled(false)
                points-=200
                score.text = "SCORE:$points"
            }
        }
        btn33.setOnClickListener {
            if( rand(start, end) == 1 ){
                btn3.setEnabled(false)
                btn33.setEnabled(false)
                btn4.setEnabled(true)
                btn44.setEnabled(true)
                points+=500
                score.text = "SCORE:$points"

            }else{
                btn1.setEnabled(false)
                btn11.setEnabled(false)
                btn2.setEnabled(false)
                btn22.setEnabled(false)
                btn3.setEnabled(false)
                btn33.setEnabled(false)
                btn4.setEnabled(false)
                btn44.setEnabled(false)
                btn5.setEnabled(false)
                btn55.setEnabled(false)
                points-=200
                score.text = "SCORE:$points"
            }
        }
        btn4.setOnClickListener {
            if( rand(start, end) == 1 ){
                btn44.setEnabled(false)
                btn4.setEnabled(false)
                btn5.setEnabled(true)
                btn55.setEnabled(true)
                points+=1000
                score.text = "SCORE:$points"

            }else{
                btn1.setEnabled(false)
                btn11.setEnabled(false)
                btn2.setEnabled(false)
                btn22.setEnabled(false)
                btn3.setEnabled(false)
                btn33.setEnabled(false)
                btn4.setEnabled(false)
                btn44.setEnabled(false)
                btn5.setEnabled(false)
                btn55.setEnabled(false)
                points-=200
                score.text = "SCORE:$points"
            }
        }
        btn44.setOnClickListener {
            if( rand(start, end) == 1 ){
                btn4.setEnabled(false)
                btn44.setEnabled(false)
                btn5.setEnabled(true)
                btn55.setEnabled(true)
                points+=1000
                score.text = "SCORE:$points"

            }else{
                btn1.setEnabled(false)
                btn11.setEnabled(false)
                btn2.setEnabled(false)
                btn22.setEnabled(false)
                btn3.setEnabled(false)
                btn33.setEnabled(false)
                btn4.setEnabled(false)
                btn44.setEnabled(false)
                btn5.setEnabled(false)
                btn55.setEnabled(false)
                points-=200
                score.text = "SCORE:$points"
            }
        }
        btn5.setOnClickListener {
            if( rand(start, end) == 1 ){
                btn5.setEnabled(false)
                btn55.setEnabled(false)
                points+=2500
                score.text = "SCORE:$points"

            }else{
                btn1.setEnabled(false)
                btn11.setEnabled(false)
                btn2.setEnabled(false)
                btn22.setEnabled(false)
                btn3.setEnabled(false)
                btn33.setEnabled(false)
                btn4.setEnabled(false)
                btn44.setEnabled(false)
                btn5.setEnabled(false)
                btn55.setEnabled(false)
                points-=200
                score.text = "SCORE:$points"
            }
        }
        btn55.setOnClickListener {
            if( rand(start, end) == 1 ){
                btn5.setEnabled(false)
                btn55.setEnabled(false)
                points+=2500
                score.text = "SCORE:$points"

            }else{
                btn1.setEnabled(false)
                btn11.setEnabled(false)
                btn2.setEnabled(false)
                btn22.setEnabled(false)
                btn3.setEnabled(false)
                btn33.setEnabled(false)
                btn4.setEnabled(false)
                btn44.setEnabled(false)
                btn5.setEnabled(false)
                btn55.setEnabled(false)
                points-=200
                score.text = "SCORE:$points"
            }
        }

        btnNewGame.setOnClickListener {
            start()
        }

    }
}