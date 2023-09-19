package com.designpatterns.factory;

import com.designpatterns.factory.pizza.Pizza;
import com.designpatterns.factory.pizzastore.ChicagoStylePizzaStore;
import com.designpatterns.factory.pizzastore.NYStylePizzaStore;
import com.designpatterns.factory.pizzastore.PizzaStore;

public class PizzaTestDrive {

    public static void main(String args[]) {
        PizzaStore nyStore = new NYStylePizzaStore();
        PizzaStore chicagoStore = new ChicagoStylePizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");
    }
}
