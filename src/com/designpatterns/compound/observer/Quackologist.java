package com.designpatterns.compound.observer;

// We want this class to be an observer of Quackable objects
public class Quackologist implements Observer {

    @Override
    public void update(QuackObservable duck) {
        System.out.println("Quackologist: " + duck + " just quacked.");
    }
}
