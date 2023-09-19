package com.designpatterns.singleton.singletons;

public class SingletonSynchronized {

    private static SingletonSynchronized uniqueInstance;

    private SingletonSynchronized() {}

    // only one thread can access this at a time
    // note that synchronizing the method is expensive
    public static synchronized SingletonSynchronized getUniqueInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new SingletonSynchronized();
        }
        return uniqueInstance;
    }
}
