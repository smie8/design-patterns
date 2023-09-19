package com.designpatterns.factory.pizzastore;

import com.designpatterns.factory.pizza.Pizza;
import com.designpatterns.factory.pizza.ny.NYStyleCheesePizza;
import com.designpatterns.factory.pizza.ny.NYStyleClamPizza;
import com.designpatterns.factory.pizza.ny.NYStylePepperoniPizza;

public class NYStylePizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new NYStyleCheesePizza();
        } else if (type.equals("pepperoni")) {
            return new NYStylePepperoniPizza();
        } else if (type.equals("clam")) {
            return new NYStyleClamPizza();
        } else {
            throw new IllegalArgumentException(String.format("Pizza type %s is not supported", type));
        }
    }
}
