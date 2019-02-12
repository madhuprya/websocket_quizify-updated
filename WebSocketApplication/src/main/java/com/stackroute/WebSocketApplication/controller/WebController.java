package com.stackroute.WebSocketApplication.controller;


import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import com.stackroute.WebSocketApplication.model.Hello;
import com.stackroute.WebSocketApplication.model.User;

@Controller
public class WebController {

    @MessageMapping("/hello")
    @SendTo("/topic/hi")
    public Hello greeting(User user) throws Exception {
        return new Hello("Hi, " + user.getName() + "!");
    }
}

