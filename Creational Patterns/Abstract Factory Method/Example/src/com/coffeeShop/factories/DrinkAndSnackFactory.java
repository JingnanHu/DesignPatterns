package com.coffeeShop.factories;

import com.coffeeShop.product.IDrink;
import com.coffeeShop.product.ISnack;

public interface DrinkAndSnackFactory {
    IDrink creatDrink();
    ISnack creatSnack();

}
