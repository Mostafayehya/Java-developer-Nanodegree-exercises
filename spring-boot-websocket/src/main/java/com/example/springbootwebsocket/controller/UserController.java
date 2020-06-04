package com.example.springbootwebsocket.controller;

import com.example.springbootwebsocket.model.User;
import com.example.springbootwebsocket.model.UserResponse;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {

    @MessageMapping("/user")
    @SendTo("/topic/user")       // Message broker end point
    public UserResponse getUser(User user){  // We get user from UI and wrap it with UserResponse
        return new UserResponse("hello, " +user.getName());
    }
}

