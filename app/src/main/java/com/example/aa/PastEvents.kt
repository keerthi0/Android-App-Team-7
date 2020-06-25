package com.example.aa

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.BaseAdapter
import android.widget.ListView
import kotlinx.android.synthetic.main.activity_past_events.*

class PastEvents : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_past_events)
        val events= arrayOf<String>("Django","COSC Event","Android Event")
        val listView=findViewById<ListView>(R.id.PastEvent)
        listView.adapter=ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,events)
        listView.setOnItemClickListener { adapterView, view, i, l ->

            val intent = Intent(this,PastRegisteredEventsInfo::class.java)
            startActivity(intent)
        }

    }}
