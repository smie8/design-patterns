package com.designpatterns.factory.pizza;

import com.designpatterns.factory.ingredients.PizzaIngredientFactory;

public class CheesePizza extends Pizza {

    // we are creating families of objects here
    // i.e. using the abstract factory pattern
    PizzaIngredientFactory ingredientFactory;

    public CheesePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println(
            "Preparing " + getName()
        );
        setDough(ingredientFactory.createDough());
        setSauce(ingredientFactory.createSauce());
        setCheese(ingredientFactory.createCheese());
    }
}
