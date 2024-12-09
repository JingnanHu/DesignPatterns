package com.coffeeShop.product.realProducts;

import com.coffeeShop.product.ISnack;

public class Cookie implements ISnack {

    @Override
    public void prepareSnack() {
        System.out.println("Preparing cookie...");
    }

    @Override
    public void makeSnack() {
        System.out.println("Making cookie...");
    }

    @Override
    public void serveSnack() {
        System.out.println("Serving cookie...");
    }
}
