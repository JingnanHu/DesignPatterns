package com.pizzaRestaurang.products;

public class hawaiiPizza implements IPizza {
    @Override
    public void prepare() {
        System.out.println("Preparing hawaii pizza");
    }

    @Override
    public void bake() {
        System.out.println("Baking hawaii pizza");
    }

    @Override
    public void cut() {
        System.out.println("Cutting hawaii pizza");
    }
}
