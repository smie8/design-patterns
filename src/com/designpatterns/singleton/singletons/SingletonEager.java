package com.designpatterns.singleton.singletons;

public class SingletonEager {

    // if your application always creates and uses an instance of the Singleton
    // eager instantiation could be fine
    private static final SingletonEager uniqueInstance = new SingletonEager();

    private SingletonEager() {}

    public static SingletonEager getUniqueInstance() {
        return uniqueInstance;
    }
}
