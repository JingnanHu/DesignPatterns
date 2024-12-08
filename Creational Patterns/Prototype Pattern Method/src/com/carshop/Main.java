package com.carshop;

import com.carshop.model.car;


public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        car car1 = new car();
        car1.setBrand("Benz");
        car1.setColor("Blue");
        car1.setModel("Model 2");

        car car2 = car1.clone();
        System.out.println(car1);
        System.out.println(car2);
    }
}
