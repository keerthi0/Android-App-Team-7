package com.example.aa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_events_info.*

class PastRegisteredEventsInfo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_past_events_info)
        TextHead.setOnClickListener {
            val intent = Intent(this,TextingClubActivity::class.java)
            startActivity(intent)
        }
    }
}