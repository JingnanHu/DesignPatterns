package com.visitorPattern;

public class Game implements Computer{
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

}
