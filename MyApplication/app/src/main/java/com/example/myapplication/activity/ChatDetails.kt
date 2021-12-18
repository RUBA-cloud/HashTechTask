package com.example.myapplication.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.Controller.ChatController
import com.example.myapplication.Controller.ChatDetailsAdpater
import com.example.myapplication.Controller.FeedController
import com.example.myapplication.Controller.RecyclerViewAdpater
import com.example.myapplication.Model.ChatModel
import com.example.myapplication.Model.FeedListModel
import com.example.myapplication.R
import com.example.myapplication.adpater.ChatListView

class ChatDetails : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chat_details)

        var bundle : Bundle?= intent.extras
        var message: Int? = bundle!!.getInt("id")
        // here We get the id of FeedListModel and sendeit to Controller to get The dataat this index

        var chat= ChatController().getId(message!!)
       setViewConctent(model = chat)
//    var message: Int? = bundle!!.getInt("id")
//    // here We get the id of FeedListModel and sendeit to Controller to get The dataat this index



}
    fun setViewConctent(model: List<String>){
        //Here We Define The Variables of View

        val recyclerView=findViewById<RecyclerView>(R.id.chatDetails);
        recyclerView.adapter= ChatDetailsAdpater(model)
        recyclerView.layoutManager= LinearLayoutManager(this)
        recyclerView.setHasFixedSize(false)
   }
}
