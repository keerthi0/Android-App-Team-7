package com.example.aa

import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import kotlinx.android.synthetic.main.activity_dashboard.*

class Dashboard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)
        Logout.setOnClickListener {
        val intent = Intent(this,MainActivity::class.java)
        startActivity(intent)
        }
        myevents.setOnClickListener {
            val intent = Intent(this,MyEventsInfo::class.java)
            startActivity(intent)
        }
    }
}