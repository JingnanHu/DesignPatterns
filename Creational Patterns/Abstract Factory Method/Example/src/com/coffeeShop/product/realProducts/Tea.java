package com.coffeeShop.product.realProducts;

import com.coffeeShop.product.IDrink;

public class Tea implements IDrink {
    @Override
    public void prepareDrink() {
        System.out.println("Tea preparing drink");
    }

    @Override
    public void makaDrink() {
        System.out.println("Tea making drink");
    }

    @Override
    public void serveDrink() {
        System.out.println("Tea serving drink");
    }
}
