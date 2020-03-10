package com.example.myapplication

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        setTitle("Georgs Visitenkarte")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val name = "Georg Wenderoth"
        val textView= findViewById<TextView>(R.id.textName)
        textView.text = name



        val button3 = findViewById<Button>(R.id.button3)
        button3.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://media.giphy.com/media/MM0Jrc8BHKx3y/giphy.gif")
            startActivity(intent)
        }
        val button2 = findViewById<Button>(R.id.button2)
        button2.setOnClickListener {
            val callIntent = Intent(Intent.ACTION_DIAL)
            callIntent.data = Uri.parse("tel: +491788775759")
            startActivity(callIntent)
         
        }

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            val intent = Intent(Intent.ACTION_SENDTO)
            intent.data = Uri.parse("mailto:"+"gwe@adorsys.de")
            startActivity(intent)
        }


    }
}
