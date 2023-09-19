package com.designpatterns.strategy;

import com.designpatterns.strategy.behavior.FlyRocketPowered;
import com.designpatterns.strategy.duck.Duck;
import com.designpatterns.strategy.duck.MallardDuck;
import com.designpatterns.strategy.duck.ModelDuck;

public class MiniDuckSimulator {

    public static void main() {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
