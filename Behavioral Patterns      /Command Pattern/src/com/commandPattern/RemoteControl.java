package com.commandPattern;

class RemoteControl {
    private Command command;

    public RemoteControl(LightOnCommand lightOnCommand) {
        this.command = lightOnCommand;
    }

    public void pressButton(){
        command.turnOnLight();
    }
    public void releaseButton(){
        command.turnOffLight();
    }
}
