package com.coffeeShop.product.realProducts;

import com.coffeeShop.product.ISnack;

public class Cake implements ISnack {
    @Override
    public void prepareSnack() {
        System.out.println("Preparing Cake");
    }

    @Override
    public void makeSnack() {
        System.out.println("Making Cake");
    }

    @Override
    public void serveSnack() {
        System.out.println("Serving Cake");
    }
}
