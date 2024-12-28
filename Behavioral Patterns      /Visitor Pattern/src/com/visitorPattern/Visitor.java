package com.visitorPattern;

public interface Visitor {
    void visit(Game game);
    void visit(Photos photos);
}
