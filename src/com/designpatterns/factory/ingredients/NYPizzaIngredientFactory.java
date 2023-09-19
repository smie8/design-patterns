package com.designpatterns.factory.ingredients;

import com.designpatterns.factory.ingredients.cheese.Cheese;
import com.designpatterns.factory.ingredients.clams.Clams;
import com.designpatterns.factory.ingredients.dough.Dough;
import com.designpatterns.factory.ingredients.clams.FreshClams;
import com.designpatterns.factory.ingredients.sauce.MarinaraSauce;
import com.designpatterns.factory.ingredients.pepperoni.Pepperoni;
import com.designpatterns.factory.ingredients.cheese.ReggianoCheese;
import com.designpatterns.factory.ingredients.sauce.Sauce;
import com.designpatterns.factory.ingredients.pepperoni.SlicedPepperoni;
import com.designpatterns.factory.ingredients.dough.ThinCrustDough;
import com.designpatterns.factory.ingredients.veggies.Garlic;
import com.designpatterns.factory.ingredients.veggies.Mushroom;
import com.designpatterns.factory.ingredients.veggies.Onion;
import com.designpatterns.factory.ingredients.veggies.RedPepper;
import com.designpatterns.factory.ingredients.veggies.Veggies;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[]{ new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClams() {
        return new FreshClams();
    }
}
