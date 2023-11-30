package com.designpatterns.compound.decorator;

import com.designpatterns.compound.entities.Quackable;
import com.designpatterns.compound.observer.Observable;
import com.designpatterns.compound.observer.Observer;

public class QuackCounter implements Quackable {

    private Observable observable;
    private Quackable duck;
    static int numberOfQuacks; // Instance variable has default value of 0

    public QuackCounter(Quackable duck) {
        this.duck = duck;
        this.observable = new Observable(duck);
    }

    public void quack() {
        duck.quack();
        numberOfQuacks++;
    }

    public static int getQuacks() {
        return numberOfQuacks;
    }

    @Override
    public void registerObserver(Observer observer) {
        this.observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        this.observable.notifyObservers();
    }
}
