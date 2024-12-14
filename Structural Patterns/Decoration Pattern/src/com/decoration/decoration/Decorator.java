package com.decoration.decoration;

import com.decoration.method.House;

import java.awt.*;

public class Decorator implements House {
    private House house;
    public Decorator(House house){
        this.house=house;
    }
    @Override
    public void whoHouse() {
        System.out.println("Before Decoration");
        house.whoHouse();
        System.out.println("After Decoration");
    }
}
