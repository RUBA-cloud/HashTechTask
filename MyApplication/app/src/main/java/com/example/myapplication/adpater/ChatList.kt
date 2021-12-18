package com.example.myapplication.adpater

import com.example.myapplication.Controller.FeedController



import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import android.widget.TextView
import androidx.cardview.widget.CardView

import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.Controller.ChatController


import com.example.myapplication.R
import com.example.myapplication.activity.ChatDetails

//ToDo:: Recycler View Adapetr  that brings list of FeedListModel and Display it in RecyclerView
class ChatListView : RecyclerView.Adapter<ChatListView.ViewHolder>() {
    var controller = ChatController()
    var model = controller.getChatList()


    override fun getItemCount(): Int {
        //  TODO("Get The Count of List")
      //  return model.size;
        return model.size;
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        //ToDo::It's Refelect the Data from Model and display it in view
        holder.name.text = model[position].name

        holder.cardView.setOnClickListener {

            val intent = Intent(holder.itemView.context, ChatDetails::class.java);
            intent.putExtra("id", model[position].id);
            holder.itemView.context.startActivity(intent)

        }

    }


    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        //ToDo::Here It's Define the Layout that you want to Display in recycler View  and define the content of it
        var name: TextView
        var cardView:CardView



        init {

            name = itemView.findViewById(R.id.name);
            cardView=itemView.findViewById(R.id.listTile)

        }


    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        //ToDo: Here It's Refelect The layout View
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.chat_list_wiget, parent, false)
        return ViewHolder(view);
    }
}