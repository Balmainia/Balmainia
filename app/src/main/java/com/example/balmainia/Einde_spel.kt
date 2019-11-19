package com.example.balmainia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_begin_spel.*
import kotlinx.android.synthetic.main.activity_einde_spel.*

class Einde_spel : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_einde_spel)

        nogEenKeer.setOnClickListener {
            val intent = Intent(this@Einde_spel,begin_spel::class.java)
            startActivity(intent)
        }

    }
}
