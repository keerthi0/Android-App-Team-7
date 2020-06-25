package com.example.aa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class RegisteredEvents : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registered_events)
        val events= arrayOf<String>("Django","COSC Event","Android Event")
        val listView=findViewById<ListView>(R.id.RegisteredEvent)
        listView.adapter= ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,events)
        listView.setOnItemClickListener { adapterView, view, i, l ->

            val intent = Intent(this,RegisteredEventsInfo::class.java)
            startActivity(intent)
        }
    }
}