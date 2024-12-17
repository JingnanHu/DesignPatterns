package com.proxy;

public class RealMan implements Sale{
    @Override
    public void sale() {
        System.out.println("My apartment is in solna, 56cm2. It close to TC.");
    }
}
