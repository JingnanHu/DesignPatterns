package com.builderShop.util;

import com.builderShop.model.House;

public class HouseFormatter {

    public static String format(House house) {
        return "House{" +
                "floor='" + house.getFloor() + '\'' +
                ", Wallpaper='" + house.getWallpaper() + '\'' +
                ", Light='" + house.getLight() + '\'' +
                '}';
    }
}
