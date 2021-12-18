package com.example.myapplication.Controller

import android.content.Intent
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.cardview.widget.CardView

import androidx.recyclerview.widget.RecyclerView

import com.example.myapplication.activity.FeedItemDetails

import com.example.myapplication.R

//ToDo:: Recycler View Adapetr  that brings list of FeedListModel and Display it in RecyclerView
class RecyclerViewAdpater : RecyclerView.Adapter<RecyclerViewAdpater.ViewHolder>() {
    var controller = FeedController()
    var model = controller.getOrder()


    override fun getItemCount(): Int {
        //  TODO("Get The Count of List")
        return model.size;
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.cardView.setBackgroundColor(Color.parseColor("#DC746C"))
        //ToDo::It's Refelect the Data from Model and display it in view

            holder.imageView.setBackgroundResource(R.drawable.image3)


       // holder.itemName.text = model[position].name
        //holder.descripation.text = model[position].desc
       // holder.ratingBar.text = model[position].rate
       holder.cardView.setOnClickListener {

            val intent = Intent(holder.itemView.context, FeedItemDetails::class.java);
            intent.putExtra("id", model[position].id);
            holder.itemView.context.startActivity(intent)
           holder.textView.text=model[position].name

}

    }


    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
//ToDo::Here It's Define the Layout that you want to Display in recycler View  and define the content of it
        var cardView:CardView
        var imageView:LinearLayout

        var textView:TextView




        init {
//
            cardView = itemView.findViewById(R.id.cardViewId);
            imageView=itemView.findViewById(R.id.imageView)
            textView=itemView.findViewById(R.id.name)



        }


    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        //ToDo: Here It's Refelect The layout View
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.feed_list_widget, parent, false)
        return ViewHolder(view);
    }
}