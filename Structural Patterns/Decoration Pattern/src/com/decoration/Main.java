package com.decoration;

import com.decoration.decoration.Decorator;
import com.decoration.method.House;
import com.decoration.method.WhoHouse;

public class Main {
    public static void main(String[] args) {
        House house = new WhoHouse();
        Decorator decorator = new Decorator(house);
        decorator.whoHouse();
    }
}
