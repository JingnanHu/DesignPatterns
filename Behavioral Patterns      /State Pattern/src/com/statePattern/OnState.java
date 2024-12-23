package com.statePattern;

public class OnState implements State {
    Tv tv;

    public OnState(Tv tv) {
        this.tv = tv;
    }

    @Override
    public void turnOn() {
        System.out.println("Tv is already on");
    }

    @Override
    public void turnOff() {
        System.out.println("Turning off Tv");
        tv.setState(tv.getOffState());
    }

    @Override
    public void next() {
        System.out.println("Next Channel");

    }

    @Override
    public void prev() {
        System.out.println("Prev Channel");
    }
}
