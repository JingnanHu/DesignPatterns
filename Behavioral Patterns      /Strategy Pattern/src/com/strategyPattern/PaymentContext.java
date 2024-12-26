package com.strategyPattern;

public class PaymentContext {
    private Payment payment;
    public PaymentContext(Payment payment) {
        this.payment = payment;
    }
    public void payment(){
        payment.payment();
    }
}
