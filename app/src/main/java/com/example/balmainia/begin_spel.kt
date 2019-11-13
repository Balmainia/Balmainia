package com.example.balmainia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_begin_spel.*

class begin_spel : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_begin_spel)



        val random_nummer_vraag_1 = (0..11).random()
        val random_nummer_vraag_2 = (0..11).random()

        val nummer_verkeerd_antwoord_1 = (0..22).random()
        val nummer_verkeerd_antwoord_2 = (0..22).random()
        val nummer_verkeerd_antwoord_3 = (0..22).random()




       // button3.setOnClickListener {
        //    fun sum (){
        //        println("sum of $random_nummer_vraag_1 and $random_nummer_vraag_2 is $sum")
        //    }
        }


    }
}
