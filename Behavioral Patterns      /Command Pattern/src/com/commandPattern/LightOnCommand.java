package com.commandPattern;

public class LightOnCommand implements Command {
    private final Light light;
    private boolean lateStatus;
    public LightOnCommand(Light light) {
        this.light = light;
    }
    @Override
    public void turnOnLight() {
    lateStatus = light.isOn();
    light.turnOn();
    }

    @Override
    public void turnOffLight() {
    if (lateStatus) {
        light.turnOff();
    } else {
        light.turnOff();
    }
    }
}
