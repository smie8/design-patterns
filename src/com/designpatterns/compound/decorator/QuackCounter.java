package com.designpatterns.compound.decorator;

import com.designpatterns.compound.entities.Quackable;

public class QuackCounter implements Quackable {

    private Quackable duck;
    static int numberOfQuacks; // Instance variable has default value of 0

    public QuackCounter(Quackable duck) {
        this.duck = duck;
    }

    public void quack() {
        duck.quack();
        numberOfQuacks++;
    }

    public static int getQuacks() {
        return numberOfQuacks;
    }
}
