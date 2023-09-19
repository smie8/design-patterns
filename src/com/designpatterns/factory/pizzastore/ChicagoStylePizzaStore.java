package com.designpatterns.factory.pizzastore;

import com.designpatterns.factory.pizza.Pizza;
import com.designpatterns.factory.pizza.chicago.ChicagoStyleCheesePizza;
import com.designpatterns.factory.pizza.chicago.ChicagoStyleClamPizza;
import com.designpatterns.factory.pizza.chicago.ChicagoStylePepperoniPizza;

public class ChicagoStylePizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        } else if (type.equals("pepperoni")) {
            return new ChicagoStylePepperoniPizza();
        } else if (type.equals("clam")) {
            return new ChicagoStyleClamPizza();
        } else {
            throw new IllegalArgumentException(String.format("Pizza type %s is not supported", type));
        }
    }
}
