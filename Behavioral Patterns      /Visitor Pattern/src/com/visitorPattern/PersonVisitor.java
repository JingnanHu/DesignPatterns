package com.visitorPattern;

public class PersonVisitor implements Visitor {

    @Override
    public void visit(Game game) {
        System.out.println("The visitor is playing game");
    }

    @Override
    public void visit(Photos photos) {
        System.out.println("The visitor is playing photos");
    }
}
