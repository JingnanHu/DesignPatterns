package com.strategyPattern;

public class Main {
    public static void main(String[] args) {
        PaymentContext aliPay = new PaymentContext(new AliPay());
        aliPay.payment();
    }
}
