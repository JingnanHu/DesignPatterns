package com.bridge.impl;

public class MacOs implements OperatingSystem {
    @Override
    public void readFile(String fileName) {
        System.out.println("read file in MacOs");
    }

    @Override
    public void writeFile(String fileName, String content) {
        System.out.println("write file in MacOs");
    }
}
