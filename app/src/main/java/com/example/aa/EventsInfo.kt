package com.example.aa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_events_info.*
import kotlinx.android.synthetic.main.activity_main.*

class EventsInfo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_events_info)
        Registration.setOnClickListener {
            val intent = Intent(this,RegistrationForm::class.java)
            startActivity(intent)
    }
}}