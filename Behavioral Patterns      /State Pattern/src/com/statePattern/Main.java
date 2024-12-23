package com.statePattern;

public class Main {
    public static void main(String[] args) {
        Tv tv = new Tv();
        tv.onState();
        tv.next();
        tv.offState();
        tv.onState();
    }
}
