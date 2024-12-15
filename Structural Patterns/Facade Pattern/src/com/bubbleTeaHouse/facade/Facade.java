package com.bubbleTeaHouse.facade;

import com.bubbleTeaHouse.milk.Milk;
import com.bubbleTeaHouse.sugar.Sugar;
import com.bubbleTeaHouse.tea.Tea;
import com.bubbleTeaHouse.topping.Topping;

public class Facade {
    Topping topping = new Topping();
    Tea tea = new Tea();
    Milk milk = new Milk();
    Sugar sugar = new Sugar();


    public void classicBubbleTea(){
        topping.tapioca();
        tea.blackTea();
        milk.milkBase();
        sugar.whiteSyrup();
        System.out.println("Classic Bubble Tea is done.");
    }

    public void matchabubbleTea(){
        topping.tapioca();
        tea.matcha();
        milk.milkBase();
        sugar.whiteSyrup();
        System.out.println("Matchabubble Tea is done.");
    }
}
