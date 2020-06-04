package com.example.springbootwebsocket.model;

 // This should be the message component in Websocket
public class User {

    private String name;

    public User(){}

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
