package com.example.balmainia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_begin_spel.*
import kotlinx.android.synthetic.main.activity_main.*

class begin_spel : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_begin_spel)




        var random_nummer_vraag_1 = (0..11).random()
        var random_nummer_vraag_2 = (0..11).random()

        var nummer_verkeerd_antwoord_1 = (0..22).random()
        var nummer_verkeerd_antwoord_2 = (0..22).random()
        var nummer_verkeerd_antwoord_3 = (0..22).random()

        var vraag = "random_nummer_vraag_1 + random_nummer_vraag_2"
        var antwoord = random_nummer_vraag_1 + random_nummer_vraag_2





        }


}
