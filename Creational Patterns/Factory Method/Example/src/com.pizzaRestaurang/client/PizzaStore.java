package com.pizzaRestaurang.client;

import com.pizzaRestaurang.factory.PizzaFactory;
import com.pizzaRestaurang.products.IPizza;

public class PizzaStore {
    public static void main(String[] args) {
        IPizza cheesePizza = PizzaFactory.createPizza("cheese");
        cheesePizza.prepare();
        cheesePizza.bake();
        cheesePizza.cut();

    }
}
