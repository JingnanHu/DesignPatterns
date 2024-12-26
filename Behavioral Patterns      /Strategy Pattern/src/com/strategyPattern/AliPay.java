package com.strategyPattern;

public class AliPay implements Payment {
    @Override
    public void payment() {
        System.out.println("Payment is through AliPay");
    }
}
