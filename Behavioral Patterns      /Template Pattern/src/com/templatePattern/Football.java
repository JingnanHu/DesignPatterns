package com.templatePattern;

public class Football extends Game{
    @Override
    void initialize() {
        System.out.println("Football initialized");
    }

    @Override
    void startPlay() {
        System.out.println("Football starting play");
    }

    @Override
    void endPlay() {
        System.out.println("Football ended");
    }
}
