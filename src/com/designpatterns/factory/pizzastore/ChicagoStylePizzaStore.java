package com.designpatterns.factory.pizzastore;

import com.designpatterns.factory.ingredients.ChicagoPizzaIngredientFactory;
import com.designpatterns.factory.ingredients.PizzaIngredientFactory;
import com.designpatterns.factory.pizza.CheesePizza;
import com.designpatterns.factory.pizza.ClamPizza;
import com.designpatterns.factory.pizza.PepperoniPizza;
import com.designpatterns.factory.pizza.Pizza;

public class ChicagoStylePizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();

        switch (type) {
            case "cheese":
                pizza = new CheesePizza(ingredientFactory);
                pizza.setName("Chicago Style Cheese Pizza");
                break;
            case "pepperoni":
                pizza = new PepperoniPizza(ingredientFactory);
                pizza.setName("Chicago Style Pepperoni Pizza");
                break;
            case "clam":
                pizza = new ClamPizza(ingredientFactory);
                pizza.setName("Chicago Style Clam Pizza");
                break;
        }

        return pizza;
    }
}
