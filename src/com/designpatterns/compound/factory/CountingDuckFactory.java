package com.designpatterns.compound.factory;

import com.designpatterns.compound.decorator.QuackCounter;
import com.designpatterns.compound.entities.DuckCall;
import com.designpatterns.compound.entities.MallardDuck;
import com.designpatterns.compound.entities.Quackable;
import com.designpatterns.compound.entities.RedheadDuck;
import com.designpatterns.compound.entities.RubberDuck;

public class CountingDuckFactory extends AbstractDuckFactory {

    @Override
    public Quackable createMallardDuck(){
        return new QuackCounter(new MallardDuck());
    }

    @Override
    public Quackable createRedheadDuck(){
        return new QuackCounter(new RedheadDuck());
    }

    @Override
    public Quackable createDuckCall(){
        return new QuackCounter(new DuckCall());
    }

    @Override
    public Quackable createRubberDuck(){
        return new QuackCounter(new RubberDuck());
    }
}
