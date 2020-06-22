package com.example.aa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_home_page.*
import kotlinx.android.synthetic.main.activity_my_events_info.*

class MyEventsInfo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_events_info)
        registeredevents.setOnClickListener {
            val intent = Intent(this,RegisteredEvents::class.java)
            startActivity(intent)}
        interestedevents.setOnClickListener {
            val intent = Intent(this,InterestedEvents::class.java)
            startActivity(intent)}
    }
}