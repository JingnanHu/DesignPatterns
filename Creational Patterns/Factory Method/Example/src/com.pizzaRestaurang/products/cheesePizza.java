package com.pizzaRestaurang.products;

public class cheesePizza implements IPizza {
    @Override
    public void prepare() {
        System.out.println("Preparing cheesePizza");
    }

    @Override
    public void bake() {
        System.out.println("Baking cheesePizza");
    }

    @Override
    public void cut() {
        System.out.println("Cutting cheesePizza");
    }
}
