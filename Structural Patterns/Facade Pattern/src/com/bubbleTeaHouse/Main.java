package com.bubbleTeaHouse;

import com.bubbleTeaHouse.facade.Facade;

public class Main {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.classicBubbleTea();
        System.out.println("Enjoy your drinking");
        facade.matchabubbleTea();
        System.out.println("Enjoy your drinking");
    }
}
