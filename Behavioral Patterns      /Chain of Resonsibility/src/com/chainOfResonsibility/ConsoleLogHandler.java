package com.chainOfResonsibility;

public class ConsoleLogHandler extends LogHandler {
    public ConsoleLogHandler(LogHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handleLog(String message, String level) {
        System.out.println("[Console] " + level + ": " + message);
        if (nextHandler != null){
            nextHandler.handleLog(message, level);
        }
    }
}
