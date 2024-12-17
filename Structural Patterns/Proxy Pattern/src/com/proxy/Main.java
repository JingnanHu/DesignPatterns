package com.proxy;

public class Main {
    public static void main(String[] args) {
        RealMan realMan = new RealMan();
        Proxy proxy = new Proxy(realMan);
        proxy.sale();
    }
}
