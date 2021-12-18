package com.example.myapplication.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RatingBar
import android.widget.TextView
import com.example.myapplication.Controller.FeedController
import com.example.myapplication.Model.FeedListModel
import com.example.myapplication.R

//ToDo Disply The Details of feed List
class FeedItemDetails : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feed_item_details)

        var bundle : Bundle?= intent.extras
        var message: Int? = bundle!!.getInt("id")
        // here We get the id of FeedListModel and sendeit to Controller to get The dataat this index

        var feedListModel:FeedListModel= FeedController().getId(id = message!!)
        setContentView(feedListModel)








    }
    fun setContentView (myOrderModel:FeedListModel){
        val name=findViewById<TextView>(R.id.name)
        val descripation=findViewById<TextView>(R.id.desc)
        val date=findViewById<TextView>(R.id.date)
        val address=findViewById<TextView>(R.id.address)
        val phone=findViewById<TextView>(R.id.phone)
        val email=findViewById<TextView>(R.id.email)
        val streetName=findViewById<TextView>(R.id.streetName)


        name.text=myOrderModel.name
        descripation.text=myOrderModel.desc
        address.text=myOrderModel.address
        date.text=myOrderModel.date
        phone.text=myOrderModel.phone
        streetName.text=myOrderModel.streetName
        email.text=myOrderModel.email

    }

}