package com.example.myapplication.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.Controller.RecyclerViewAdpater
import com.example.myapplication.R
import com.example.myapplication.adpater.ChatListView


//ToDo :// We Initlize The List Feed 
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        setViewConctent()
      


    }
    //TODO Set View Componetns
    fun setViewConctent(){
        //Here We Define The Variables of View 
val  chat= findViewById<ImageButton>(R.id.chatDetails);
        chat.setOnClickListener(){
            val intent = Intent(this, ChatActivity::class.java);

this.           startActivity(intent)
        }
        val recyclerView=findViewById<RecyclerView>(R.id.feedList);
        recyclerView.adapter= RecyclerViewAdpater()
        recyclerView.layoutManager=LinearLayoutManager(this)
        recyclerView.setHasFixedSize(false)
    }
}