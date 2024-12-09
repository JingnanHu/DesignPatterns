package com.coffeeShop.product.realProducts;

import com.coffeeShop.product.IDrink;

public class Coffee implements IDrink {
    @Override
    public void prepareDrink() {
        System.out.println("Preparing Coffee");
    }

    @Override
    public void makaDrink() {
        System.out.println("Making Coffee");
    }

    @Override
    public void serveDrink() {
        System.out.println("Serving Coffee");
    }
}
