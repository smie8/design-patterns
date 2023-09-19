package com.designpatterns.factory.pizzastore;

import com.designpatterns.factory.ingredients.NYPizzaIngredientFactory;
import com.designpatterns.factory.ingredients.PizzaIngredientFactory;
import com.designpatterns.factory.pizza.CheesePizza;
import com.designpatterns.factory.pizza.ClamPizza;
import com.designpatterns.factory.pizza.PepperoniPizza;
import com.designpatterns.factory.pizza.Pizza;

public class NYStylePizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        switch (type) {
            case "cheese":
                pizza = new CheesePizza(ingredientFactory);
                pizza.setName("New York Style Cheese Pizza");
                break;
            case "clam":
                pizza = new ClamPizza(ingredientFactory);
                pizza.setName("New York Style Clam Pizza");
                break;
            case "pepperoni":
                pizza = new PepperoniPizza(ingredientFactory);
                pizza.setName("New York Style Pepperoni Pizza");
                break;
        }

        return pizza;
    }
}
