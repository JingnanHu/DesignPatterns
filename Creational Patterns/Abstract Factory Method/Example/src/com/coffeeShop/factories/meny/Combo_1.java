package com.coffeeShop.factories.meny;

import com.coffeeShop.factories.DrinkAndSnackFactory;
import com.coffeeShop.product.IDrink;
import com.coffeeShop.product.ISnack;
import com.coffeeShop.product.realProducts.Cookie;
import com.coffeeShop.product.realProducts.Tea;

public class Combo_1 implements DrinkAndSnackFactory {
    @Override
    public IDrink creatDrink() {
        return new Tea();
    }

    @Override
    public ISnack creatSnack() {
        return new Cookie();
    }
}
