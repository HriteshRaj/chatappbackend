package com.myproject.chatappbackend.controller;


import com.myproject.chatappbackend.models.ChatMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ChatController {




    //when anyone sends message it gets in topic messages
        @MessageMapping("/sendMessage")
        @SendTo("/topic/messages")
        public ChatMessage sendMessage(ChatMessage message){
            return  message;
        }

        @GetMapping("/")
        public String chat(){
            return "chat";
        }



}
