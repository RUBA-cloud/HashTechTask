package com.example.myapplication.Controller

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView

import androidx.recyclerview.widget.RecyclerView

import com.example.myapplication.activity.FeedItemDetails

import com.example.myapplication.R

//ToDo:: Recycler View Adapetr  that brings list of FeedListModel and Display it in RecyclerView
class ChatDetailsAdpater(model1:List<String>) : RecyclerView.Adapter<ChatDetailsAdpater.ViewHolder>() {
   var  model=model1


    override fun getItemCount(): Int {
        //  TODO("Get The Count of List")
        return model.size;
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        //ToDo::It's Refelect the Data from Model and display it in view
        holder.messge.text = model[position]





    }


    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        //ToDo::Here It's Define the Layout that you want to Display in recycler View  and define the content of it
        var messge: TextView




        init {

            messge = itemView.findViewById(R.id.message);


        }


    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        //ToDo: Here It's Refelect The layout View
        val view =
                LayoutInflater.from(parent.context).inflate(R.layout.chat_message_widget, parent, false)
        return ViewHolder(view);
    }
}