package com.bridge.abstract_impl;

import com.bridge.impl.OperatingSystem;

public class WriteFileOperator extends FileOperation {
    public WriteFileOperator (OperatingSystem os){
        super(os);
    }


    @Override
    public void execute(String fileName, String content) {
        os.writeFile(fileName, content);
    }
}
