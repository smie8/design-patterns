package com.designpatterns.factory.pizza.ny;

import com.designpatterns.factory.pizza.Pizza;

public class NYStylePepperoniPizza extends Pizza {

    public NYStylePepperoniPizza() {
        setName("NY Style Pepperoni Pizza");
        setDough("Thin Crust Dough");
        setSauce("Marinara Sauce");

        getToppings().add("Grated Reggiano Cheese");
    }
}
