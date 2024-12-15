package com.singleton;

public class DoubleCheckedLocking {
    private DoubleCheckedLocking() {};
    private static DoubleCheckedLocking instance;

    public static i DoubleCheckedLocking getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckedLocking.class) {
                //作用：为当前类加锁。
                //目的：确保在多线程环境下，同一时刻只有一个线程可以进入同步块，防止多个线程同时创建实例。
                if (instance == null) {
                    instance = new DoubleCheckedLocking();
                }

            }

        }
        return instance;
    }
}
