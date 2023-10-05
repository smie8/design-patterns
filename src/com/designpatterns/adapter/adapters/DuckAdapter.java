package com.designpatterns.adapter.adapters;

import com.designpatterns.adapter.entities.Duck;
import com.designpatterns.adapter.entities.Turkey;

import java.util.Random;

public class DuckAdapter implements Turkey {

    private Duck duck;
    private Random random;

    public DuckAdapter(Duck duck) {
        this.duck = duck;
    }

    @Override
    public void gobble() {
        duck.quack(); // Duck's quack() method is equivalent to Turkey's gobble() method.
    }

    @Override
    public void fly() {
        if (random.nextInt(5) == 0) { // 20% chance of flying.
            duck.fly();
        }
    }
}
