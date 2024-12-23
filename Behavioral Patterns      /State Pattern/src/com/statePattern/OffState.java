package com.statePattern;

public class OffState implements State {

    Tv tv;
    public OffState(Tv tv) {
        this.tv = tv;
    }

    @Override
    public void turnOn() {
        System.out.println("Turning on TV");
        tv.setState(tv.getOnState());
    }

    @Override
    public void turnOff() {
        System.out.println("The Tv is already off");
    }

    @Override
    public void next() {
        System.out.println("Can't change channels. Tv is off");
    }

    @Override
    public void prev() {
        System.out.println("Can't change channels. Tv is off");
    }
}
