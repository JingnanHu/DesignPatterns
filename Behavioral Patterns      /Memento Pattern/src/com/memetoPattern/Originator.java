package com.memetoPattern;

public class Originator {
    private String state;
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }

    public Memeto saveStateToMemeto() {
        return new Memeto(state);
    }

    public void getStateFromMemeto(Memeto memoto) {
       this.state = memoto.getState();
    }
}
