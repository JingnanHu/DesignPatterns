package com.builderShop.model;

public class House {
    private  String wallpaper;

    public House() {
    }

    private  String floor;
    private  String light;


    public House(String wallpaper, String floor, String light) {
        this.wallpaper = wallpaper;
        this.floor = floor;
        this.light = light;
    }

    public String getWallpaper() {
        return wallpaper;
    }

    public void setWallpaper(String wallpaper) {
        this.wallpaper = wallpaper;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public String getLight() {
        return light;
    }

    public void setLight(String light) {
        this.light = light;
    }


}
