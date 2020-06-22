package com.example.aa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class InterestedEvents : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_interested_events)
        val events= arrayOf<String>("Django","COSC Event","Android Event")
        val listView=findViewById<ListView>(R.id.InterestedEvent)
        listView.adapter= ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,events)
        listView.setOnItemClickListener { adapterView, view, i, l ->

            val intent = Intent(this,EventsInfo::class.java)
            startActivity(intent)
        }
    }
}