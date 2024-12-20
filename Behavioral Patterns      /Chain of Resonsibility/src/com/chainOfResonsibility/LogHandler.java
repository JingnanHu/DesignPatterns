package com.chainOfResonsibility;

abstract class LogHandler {
    public LogHandler(LogHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    protected LogHandler nextHandler;

    public void handleLog(String message, String level){
        if (nextHandler != null){
            nextHandler.handleLog(message, level);
        }
    }
}
