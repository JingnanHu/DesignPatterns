package com.builderShop;

import com.builderShop.model.House;
import com.builderShop.util.HouseFormatter;

public class Main {
    public static void main(String[] args) {
        House house = new House();
        house.setFloor("wooden");
        house.setLight("Two lights");
        house.setWallpaper("white");
        System.out.println(HouseFormatter.format(house));
    }


}
