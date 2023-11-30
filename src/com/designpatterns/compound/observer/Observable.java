package com.designpatterns.compound.observer;

import java.util.ArrayList;

// This class implements all the functionality a Quackable needs to be an observable.
// Just plug it into a class and have that class delegate to Observable.
public class Observable implements QuackObservable {

    private ArrayList<Observer> observers = new ArrayList<>();
    private QuackObservable duck;

    public Observable(QuackObservable duck) {
        this.duck = duck;
    }

    @Override
    public void registerObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        this.observers.forEach(observer -> observer.update(this.duck));
    }
}
