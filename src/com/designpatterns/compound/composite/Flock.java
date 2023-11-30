package com.designpatterns.compound.composite;

import com.designpatterns.compound.entities.Quackable;
import com.designpatterns.compound.observer.Observable;
import com.designpatterns.compound.observer.Observer;

import java.util.ArrayList;
import java.util.Iterator;

public class Flock implements Quackable {

    private ArrayList<Quackable> ducks = new ArrayList<>();

    public void add(Quackable quacker) {
        this.ducks.add(quacker);
    }

    @Override
    public void quack() {
        // We could use forEach here, but we want to use Iterator pattern for educational purposes.
        Iterator iterator = this.ducks.iterator();
        while (iterator.hasNext()) {
            Quackable duck = (Quackable) iterator.next();
            duck.quack();
            // TODO: Why do we need to notify observers here? Why doesn't the quack() method of each quacker notify work?
//            duck.notifyObservers();
        }
    }

    @Override
    public void registerObserver(Observer observer) {
        Iterator<Quackable> iterator = ducks.iterator();
        while (iterator.hasNext()) {
            Quackable duck = (Quackable) iterator.next();
            duck.registerObserver(observer);
        }
    }

    @Override
    public void notifyObservers() {
    }
}
