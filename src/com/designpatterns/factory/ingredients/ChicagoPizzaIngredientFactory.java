package com.designpatterns.factory.ingredients;

import com.designpatterns.factory.ingredients.cheese.Cheese;
import com.designpatterns.factory.ingredients.clams.Clams;
import com.designpatterns.factory.ingredients.dough.Dough;
import com.designpatterns.factory.ingredients.clams.FreshClams;
import com.designpatterns.factory.ingredients.dough.ThickCrustDough;
import com.designpatterns.factory.ingredients.sauce.MarinaraSauce;
import com.designpatterns.factory.ingredients.pepperoni.Pepperoni;
import com.designpatterns.factory.ingredients.cheese.ReggianoCheese;
import com.designpatterns.factory.ingredients.sauce.Sauce;
import com.designpatterns.factory.ingredients.pepperoni.SlicedPepperoni;
import com.designpatterns.factory.ingredients.veggies.BlackOlives;
import com.designpatterns.factory.ingredients.veggies.EggPlant;
import com.designpatterns.factory.ingredients.veggies.Spinach;
import com.designpatterns.factory.ingredients.veggies.Veggies;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ThickCrustDough();
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
        return new Veggies[]{ new BlackOlives(), new Spinach(), new EggPlant() };
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
