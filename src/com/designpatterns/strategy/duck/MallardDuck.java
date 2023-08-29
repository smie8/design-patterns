package com.designpatterns.strategy.duck;

import com.designpatterns.strategy.behavior.FlyWithWings;
import com.designpatterns.strategy.behavior.Quack;
import com.designpatterns.strategy.duck.Duck;

public class MallardDuck extends Duck {

    public MallardDuck() {
        // MallardDuck uses the Quack class to handle its quack, so when performQuack() is called, the responsibility for the quack is delegated to the Quack object and we get a real quack.
        quackBehavior = new Quack();
        // And it uses the FlyWithWings class to handle its flying behavior.
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
