package com.commandPattern;

class Light {
    public Light() {
        this.isOn = isOn;
    }

    public boolean isOn() {
        return isOn;
    }

    private boolean isOn = false;

    public void turnOn(){
        if (!isOn) {
            isOn = true;
            System.out.println("Light is turned on");
        }

    }
    public void turnOff(){
        if (isOn) {
            isOn = false;
            System.out.println("Light is turned off");
        }

    }
}
