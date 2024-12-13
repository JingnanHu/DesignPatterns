package com.bridge;

import com.bridge.abstract_impl.FileOperation;
import com.bridge.abstract_impl.ReadFileOperation;
import com.bridge.impl.MacOs;
import com.bridge.impl.OperatingSystem;

public class Client {
    public static void main(String[] args) {
        OperatingSystem MacOs = new MacOs();
        // 通过接口来调取实例化
        FileOperation readopeartion =  new ReadFileOperation(MacOs);
        readopeartion.execute("Other File", null);
    }
}
