package com.commandPattern;

public class Client {
    public static void main(String[] args) {
        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        RemoteControl remoteControl = new RemoteControl(lightOnCommand);
        remoteControl.pressButton();
        remoteControl.releaseButton();
    }
}
