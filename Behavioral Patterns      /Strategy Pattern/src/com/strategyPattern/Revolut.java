package com.strategyPattern;

public class Revolut implements Payment{
    @Override
    public void payment() {
        System.out.println("Payment is through Revolut");
    }
}
