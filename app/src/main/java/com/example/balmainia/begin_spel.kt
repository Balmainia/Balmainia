package com.example.balmainia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_begin_spel.*
import kotlinx.android.synthetic.main.activity_main.*

class begin_spel : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_begin_spel)



        var RandomNummerVraag1 = (0..11).random()
        var RandomNummerVraag2 = (0..11).random()

        var VerkeerdAntwoord1 = (0..22).random()
        var VerkeerdAntwoord2 = (0..22).random()
        var VerkeerdAntwoord3 = (0..22).random()

        var vraag = ("$RandomNummerVraag1 + $RandomNummerVraag2 = ")
        var antwoord = RandomNummerVraag1 + RandomNummerVraag2


        textView3.text = vraag

        







    }


}
