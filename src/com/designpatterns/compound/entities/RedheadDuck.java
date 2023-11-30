package com.designpatterns.compound.entities;

import com.designpatterns.compound.observer.Observable;
import com.designpatterns.compound.observer.Observer;

public class RedheadDuck implements Quackable {

    private Observable observable;

    public RedheadDuck() {
        this.observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("Quack");
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        this.observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        this.observable.notifyObservers();
    }

    @Override
    public String toString() {
        return "Redhead Duck";
    }
}
