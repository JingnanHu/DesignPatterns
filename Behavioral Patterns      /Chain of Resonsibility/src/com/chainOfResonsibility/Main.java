package com.chainOfResonsibility;

import java.util.logging.ConsoleHandler;

public class Main {
    public static void main(String[] args) {
        LogHandler fileLogHandler = new FileLogHandler(null);

        LogHandler consoleLogHandler = new ConsoleLogHandler(fileLogHandler);

        consoleLogHandler.handleLog("System start", "Info");
        consoleLogHandler.handleLog("System scan", "Debug");
        consoleLogHandler.handleLog("An error occurred", "Error");

    }
}
