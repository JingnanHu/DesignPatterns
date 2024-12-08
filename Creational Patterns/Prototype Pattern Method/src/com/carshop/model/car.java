package com.carshop.model;

public class car implements Cloneable {
    public car(String model, String brand, String color) {
        this.model = model;
        this.brand = brand;
        this.color = color;
    }

    private String model;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public car() {
    }

    private String brand;
    private String color;


    @Override
    public car clone() throws CloneNotSupportedException {
        return (car) super.clone();  // 使用 Object 的 clone 方法进行对象复制
    }
    @Override
    public String toString() {
        return "Car Model: " + model + ", Color: " + color + ", Brand: " + brand;
    }
}
