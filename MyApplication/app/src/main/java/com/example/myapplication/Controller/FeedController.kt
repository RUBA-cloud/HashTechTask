package com.example.myapplication.Controller

import android.graphics.drawable.Drawable
import com.example.myapplication.Model.FeedListModel
import com.example.myapplication.R
import java.util.*


class FeedController {

    var list:List<FeedListModel> = List(5){
        FeedListModel(
            id = it,
            name ="Resturant Name",
            desc = "Everything is Amazing for Us !!!!!!!",
            date = "2020-3-3",
            email = "Email@gmail.com",
            rate = "0",
            address = "Amman Street 1",
            phone = "0799787959",
            streetName = " Wasfi Tal Street",
        image = "image1")
    }

    fun getOrder():List<FeedListModel>{

        return  list;}

    fun getId(id :Int): FeedListModel {
        return list.filter{feedListModel ->feedListModel.id==id  }.first()

    }}