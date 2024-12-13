package com.bridge.abstract_impl;

import com.bridge.impl.OperatingSystem;

public class ReadFileOperation extends FileOperation {
    public ReadFileOperation(OperatingSystem os) {
        super(os);
    }


    @Override
    public void execute(String fileName, String content) {
     os.readFile(fileName);
    }
}
