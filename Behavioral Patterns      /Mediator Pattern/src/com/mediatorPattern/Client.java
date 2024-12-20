package com.mediatorPattern;

public class Client {
    public static void main(String[] args) {
        User John = new User("John");
        User Jane = new User("Jane");

        John.sendMessage("HI, I am John");
        Jane.sendMessage("HI, I am Jane, nice to meet you!");
    }
}
