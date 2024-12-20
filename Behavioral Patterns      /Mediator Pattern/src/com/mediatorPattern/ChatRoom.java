package com.mediatorPattern;

import java.util.Date;

public class ChatRoom {
    public static void showMessage (User user, String Message) {
        System.out.println(new Date().toString() + "[" + user + "]: " + Message);
    }
}
