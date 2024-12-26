package com.strategyPattern;

public class Paypal implements Payment {
    @Override
    public void payment() {
        System.out.println("payment is through Alipay" );
    }
}
