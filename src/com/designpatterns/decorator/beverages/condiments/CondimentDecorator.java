package com.designpatterns.decorator.beverages.condiments;

import com.designpatterns.decorator.beverages.Beverage;

public abstract class CondimentDecorator extends Beverage {

    // We want that all condiment decorators implement the getDescription method
    public abstract String getDescription();
}
