package com.coffeeShop.factories.meny;

import com.coffeeShop.factories.DrinkAndSnackFactory;
import com.coffeeShop.product.IDrink;
import com.coffeeShop.product.ISnack;
import com.coffeeShop.product.realProducts.Cake;
import com.coffeeShop.product.realProducts.Coffee;

import java.awt.*;

public class Combo_02 implements DrinkAndSnackFactory {

    @Override
    public IDrink creatDrink() {
        return new Coffee();
    }

    @Override
    public ISnack creatSnack() {
        return new Cake();
    }
}
