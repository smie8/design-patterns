package com.designpatterns.singleton.singletons;

public class SingletonDoubleCheckedLocking {

    // volatile = ensure that multiple threads handle the uniqueInstance variable correctly
    private volatile static SingletonDoubleCheckedLocking uniqueInstance;

    private SingletonDoubleCheckedLocking() {}

    public static SingletonDoubleCheckedLocking getUniqueInstance() {
        // check for an instance and if there isn't one enter a synchronized block
        if (uniqueInstance == null) {
            synchronized (SingletonDoubleCheckedLocking.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new SingletonDoubleCheckedLocking();
                }
            }
        }
        return uniqueInstance;
    }
}
