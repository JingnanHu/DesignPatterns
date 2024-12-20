package com.mediatorPattern;

public class User {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name) {
        this.name = name;
    }

    public String name;
    public void sendMessage(String message) {
        ChatRoom.showMessage(this, message);
    }
}
