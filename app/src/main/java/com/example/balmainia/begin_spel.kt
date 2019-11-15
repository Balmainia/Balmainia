package com.example.balmainia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_begin_spel.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class begin_spel : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_begin_spel)


        var RandomNummerVraag1 = (0..11).random()
        var RandomNummerVraag2 = (0..11).random()
        var random = (0..3).random()


        var vraag = ("$RandomNummerVraag1 + $RandomNummerVraag2 = ")
        var AntwoordVraag = RandomNummerVraag1 + RandomNummerVraag2


        val randomAnswers = List(3) { Random.nextInt(0, 22) }
        val antwoorden = arrayOf(antwoord1, antwoord2, antwoord3, antwoord4)


        textView3.text = vraag
        for(antwoord in antwoorden){
            antwoord.text = Random.nextInt(0, 22).toString()

            antwoorden[random].text = AntwoordVraag.toString()
        }

        












    }


}
