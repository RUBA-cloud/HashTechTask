package com.example.myapplication.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.Controller.RecyclerViewAdpater
import com.example.myapplication.R
import com.example.myapplication.adpater.ChatListView

class ChatActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chat)
        setContentView()

    }

    fun setContentView(){
        val recyclerView=findViewById<RecyclerView>(R.id.chatList);
        recyclerView.adapter= ChatListView()
        recyclerView.layoutManager= LinearLayoutManager(this)
        recyclerView.setHasFixedSize(false)
    }
}