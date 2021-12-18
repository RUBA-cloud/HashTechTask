package com.example.myapplication.Controller

import com.example.myapplication.Model.ChatModel


class ChatController {
    var list:List<ChatModel> = List(5){
        ChatModel(
                id = it,
                message = List(5){
                    "Meesgae"
                },name = "Ruba")

    }


    fun getChatList():List<ChatModel>{

        return  list;}



    fun getId(id :Int): List<String> {
        var  chat= list.filter{chat ->chat.id==id  }.first()
        return  chat.message

    }
    // To Send New Message

}
