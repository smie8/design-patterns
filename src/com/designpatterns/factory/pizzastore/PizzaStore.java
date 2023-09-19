package com.designpatterns.factory.pizzastore;

import com.designpatterns.factory.pizza.Pizza;

public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza;

        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    // factory object is encapsulated in this method so the method acts as a factory now
    // (i.e. subclasses of PizzaStore handle object instantiation)
    public abstract Pizza createPizza(String type);
}
