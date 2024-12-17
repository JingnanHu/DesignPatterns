package com.proxy;

public class Proxy implements Sale{
    private RealMan realMan;

    public Proxy(RealMan realMan) {
        this.realMan = realMan;
    }

    @Override
    public void sale() {
        realMan.sale();


    }
}
