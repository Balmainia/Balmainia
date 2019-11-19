package com.example.balmainia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_begin_spel.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random
import android.os.CountDownTimer
import androidx.core.app.ComponentActivity
import androidx.core.app.ComponentActivity.ExtraData
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import kotlinx.android.synthetic.main.activity_einde_spel.*


class begin_spel : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_begin_spel)




        object : CountDownTimer( 120000, 1000) {

            override fun onTick(millisUntilFinished: Long) {
                timer.setText("" + millisUntilFinished / 1000)
            }

            override fun onFinish() {
                val intent = Intent(this@begin_spel,Einde_spel::class.java)
                startActivity(intent)


            }
        }.start()

        var RandomNummerVraag1 = (0..11).random()
        var RandomNummerVraag2 = (0..11).random()
        var random = (0..3).random()


        var vraag = ("$RandomNummerVraag1 + $RandomNummerVraag2 = ")
        var AntwoordVraag = RandomNummerVraag1 + RandomNummerVraag2


        val randomAnswers = List(3) { Random.nextInt(0, 22) }
        val antwoorden = arrayOf(antwoord1, antwoord2, antwoord3, antwoord4)


        textView3.text = vraag
        for(antwoord in antwoorden){
            // Geeft alle id uit de list antwoorden een random antwoord
            antwoord.text = Random.nextInt(0, 22).toString()
            // Geeft een random antwoord id uit de list antwoorden het juiste antwoord
            var goedeAntwoordKnop = antwoorden[random]
            goedeAntwoordKnop.text = AntwoordVraag.toString()
            println(goedeAntwoordKnop)

            // Juiste Knop
            goedeAntwoordKnop.setOnClickListener {
                textView3.text = "Pepernoot"
            }
        }
    }
}
