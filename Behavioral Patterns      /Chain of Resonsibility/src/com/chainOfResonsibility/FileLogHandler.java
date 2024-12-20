package com.chainOfResonsibility;

public class FileLogHandler extends LogHandler {
    public FileLogHandler(LogHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handleLog(String message, String level) {
        if ("Error".equals(level)) {
            System.out.println("[File] Error logged in"+ message);
        }
        if (nextHandler != null) {
            nextHandler.handleLog(message, level);
        }
    }
}
