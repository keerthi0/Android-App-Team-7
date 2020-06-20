package com.example.aa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class OngoingEvents : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ongoing_events)
        val events= arrayOf<String>("Django","COSC Event","Android Event")
        val listView=findViewById<ListView>(R.id.PresentEvent)
        listView.adapter= ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,events)
        listView.setOnItemClickListener { adapterView, view, i, l ->
            val intent = Intent(this,EventsInfo::class.java)
            intent.putExtra("event",events[i])
            startActivity(intent)
    }}
}