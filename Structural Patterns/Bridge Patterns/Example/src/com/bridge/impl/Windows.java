package com.bridge.impl;

public class Windows implements OperatingSystem {
    @Override
    public void readFile(String fileName) {
        System.out.println("read File in Windows");
    }

    @Override
    public void writeFile(String fileName, String content) {
        System.out.println("write File in Windows");
    }
}
