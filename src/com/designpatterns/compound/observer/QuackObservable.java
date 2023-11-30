package com.designpatterns.compound.observer;

// We want to observe individual duck behaviour
public interface QuackObservable {

    // Any object implementing this interface can register as observer
    void registerObserver(Observer observer);
    void notifyObservers();
    // We could also have method for removing observer, but we don't need it in this example.
}
