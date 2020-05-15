package com.example.meashall

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_comunication.*

class Comunication : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_comunication)
        val Whats = Intent(Intent.ACTION_VIEW, Uri.parse("https://wa.me/966533568429"))
        val Twitter = Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/ahmedovic04"))
        val instgram = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/ahmedovic044/"))

        whatsapp.setOnClickListener{
            startActivity(Whats)
        }

        twitter.setOnClickListener {
            startActivity(Twitter)
        }

        insta.setOnClickListener {
            startActivity(instgram)

        }
    }
}
