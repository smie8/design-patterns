package com.designpatterns.factory.pizza.ny;

import com.designpatterns.factory.pizza.Pizza;

public class NYStyleClamPizza extends Pizza {

    public NYStyleClamPizza() {
        setName("NY Style Clam Pizza");
        setDough("Thin Crust Dough");
        setSauce("Marinara Sauce");

        getToppings().add("Grated Reggiano Cheese");
    }
}
