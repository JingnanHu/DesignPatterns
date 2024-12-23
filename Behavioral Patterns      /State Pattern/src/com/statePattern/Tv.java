package com.statePattern;

public class Tv {
    private State state;
    private State offState;
    private State onState;

    public Tv() {
        offState = new OffState(this);
        onState = new OnState(this);
        state = offState;  // 初始状态为关机
    }

    public void onState() {
        state.turnOn();
    }

    public void offState() {
        state.turnOff();
    }

    public void next() {
        state.next();
    }

    public void previousState() {
        state.prev();
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getOffState() {
        return offState;
    }

    public State getOnState() {
        return onState;
    }
}
