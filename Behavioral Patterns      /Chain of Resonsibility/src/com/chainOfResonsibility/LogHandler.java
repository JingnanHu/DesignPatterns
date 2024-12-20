package com.chainOfResonsibility;

abstract class LogHandler {
    public LogHandler(LogHandler nextHandler) {
        this.nextHandler = nextHandler;
        //public FileLogHandler(LogHandler nextHandler) 是 FileLogHandler 类的构造函数。它的作用是通过调用父类 LogHandler 的构造函数来传递一个 nextHandler（下一个处理器）。
    }

    protected LogHandler nextHandler;

    public void handleLog(String message, String level){
        if (nextHandler != null){
            nextHandler.handleLog(message, level);
        }
    }
}
