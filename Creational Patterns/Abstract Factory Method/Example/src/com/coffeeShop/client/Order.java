package com.coffeeShop.client;

import com.coffeeShop.factories.DrinkAndSnackFactory;
import com.coffeeShop.factories.meny.Combo_1;
import com.coffeeShop.product.IDrink;
import com.coffeeShop.product.ISnack;
import com.coffeeShop.product.realProducts.Tea;

public class Order {
    public static void main(String[] args) {
        DrinkAndSnackFactory order = new Combo_1();
        IDrink drink = order.creatDrink();
        ISnack snack = order.creatSnack();

        drink.prepareDrink();
        snack.prepareSnack();

    }}
