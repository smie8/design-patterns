package com.designpatterns.singleton.singletons;

public class Singleton {

    // static = class variable, only one instance per class what we want
    private static Singleton uniqueInstance;

    // we want to prevent clients from using the constructor
    private Singleton() {}

    public static Singleton getUniqueInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
}
