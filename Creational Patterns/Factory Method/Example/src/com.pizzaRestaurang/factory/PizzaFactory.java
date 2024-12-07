package com.pizzaRestaurang.factory;

import com.pizzaRestaurang.products.IPizza;
import com.pizzaRestaurang.products.cheesePizza;
import com.pizzaRestaurang.products.hawaiiPizza;

public class PizzaFactory {
public static IPizza createPizza(String type) {
    if (type.equalsIgnoreCase("cheese")) {
        return new cheesePizza();
    } else if (type.equalsIgnoreCase("hawaii")) {
        return new hawaiiPizza();
    }
    else {
        System.out.println("Invalid pizza type");
        return null;
    }

}

}
