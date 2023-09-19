package com.designpatterns.factory.pizza;

import com.designpatterns.factory.ingredients.PizzaIngredientFactory;

public class PepperoniPizza extends Pizza {

    PizzaIngredientFactory ingredientFactory;

    public PepperoniPizza(PizzaIngredientFactory ingredientFactory) {
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
        setPepperoni(ingredientFactory.createPepperoni());
    }
}
