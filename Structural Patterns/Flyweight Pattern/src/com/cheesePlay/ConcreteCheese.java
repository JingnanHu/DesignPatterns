package com.cheesePlay;

public class ConcreteCheese implements CheesePiece{
    public ConcreteCheese(String color) {
        this.color = color;
    }

    private final String color;
    @Override
    public void place(int x, int y) {
        System.out.println(color + "cheese placed at " + x + ", " + y);
    }
}
