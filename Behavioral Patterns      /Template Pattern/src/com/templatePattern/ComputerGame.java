package com.templatePattern;

public class ComputerGame extends Game {
    @Override
    void initialize() {
        System.out.println("Computer Game Initialized! Start Computer.");
    }

    @Override
    void startPlay() {
        System.out.println("Computer Game Started. Enjoy the game!");
    }

    @Override
    void endPlay() {
        System.out.println("Computer Game Finished!");
    }
}
