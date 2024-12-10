package com.singleton;

public class ThreadSafeSingleton {
    private ThreadSafeSingleton() {};
    private static ThreadSafeSingleton instance;

    public static synchronized ThreadSafeSingleton getInstance() {
        if (instance == null) {
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }

}
