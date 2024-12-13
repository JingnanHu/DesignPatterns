package com.bridge.abstract_impl;

import com.bridge.impl.OperatingSystem;

public class FileOperation {
    protected OperatingSystem os;

    public FileOperation(OperatingSystem os) {
        this.os=os;
    }

    public void execute(String fileName, String content) {
        System.out.println("Executing file " + fileName);
    }
}
