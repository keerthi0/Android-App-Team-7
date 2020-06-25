package com.example.aa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class UpcomingEvents : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_upcoming_events)
        val events= arrayOf<String>("Django","COSC Event","Android Event")
        val listView=findViewById<ListView>(R.id.FutureEvent)
        listView.adapter= ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,events)
        listView.setOnItemClickListener { adapterView, view, i, l ->
            val intent = Intent(this,UpcomingEventsInfo::class.java)
            startActivity(intent)
        }
    }
}