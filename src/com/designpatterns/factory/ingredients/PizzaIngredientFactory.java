package com.designpatterns.factory.ingredients;

import com.designpatterns.factory.ingredients.cheese.Cheese;
import com.designpatterns.factory.ingredients.clams.Clams;
import com.designpatterns.factory.ingredients.dough.Dough;
import com.designpatterns.factory.ingredients.pepperoni.Pepperoni;
import com.designpatterns.factory.ingredients.sauce.Sauce;
import com.designpatterns.factory.ingredients.veggies.Veggies;

public interface PizzaIngredientFactory {

    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    Pepperoni createPepperoni();
    Clams createClams();
    Veggies[] createVeggies();
}
