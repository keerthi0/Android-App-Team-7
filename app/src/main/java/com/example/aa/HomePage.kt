package com.example.aa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_home_page.*

class HomePage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)
        imageMenu.setOnClickListener {
            val intent = Intent(this,Dashboard::class.java)
            startActivity(intent)}

            past.setOnClickListener {
                val intent = Intent(this,PastEvents::class.java)
                startActivity(intent)
        }
        present.setOnClickListener {
            val intent = Intent(this,OngoingEvents::class.java)
            startActivity(intent)
        }
        future.setOnClickListener {
            val intent = Intent(this,UpcomingEvents::class.java)
            startActivity(intent)
        }


    }
}