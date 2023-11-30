package com.designpatterns.compound.adapter;

import com.designpatterns.compound.entities.Goose;
import com.designpatterns.compound.entities.Quackable;

// We want to use goose in place of duck, but goose does not implement Quackable.
public class GooseAdapter implements Quackable {

    private Goose goose;

    public GooseAdapter(Goose goose) {
        this.goose = goose;
    }

    @Override
    public void quack() {
        goose.honk();
    }
}
