package com.designpatterns.decorator.beverages.condiments;

import com.designpatterns.decorator.beverages.Beverage;

public class Whip extends CondimentDecorator {

    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return 0.10 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }
}
