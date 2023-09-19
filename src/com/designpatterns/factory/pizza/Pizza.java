package com.designpatterns.factory.pizza;

import com.designpatterns.factory.ingredients.cheese.Cheese;
import com.designpatterns.factory.ingredients.clams.Clams;
import com.designpatterns.factory.ingredients.dough.Dough;
import com.designpatterns.factory.ingredients.pepperoni.Pepperoni;
import com.designpatterns.factory.ingredients.sauce.Sauce;
import com.designpatterns.factory.ingredients.veggies.Veggies;

public abstract class Pizza {

    private String name;
    private Dough dough;
    private Sauce sauce;
    private Veggies[] veggies;
    private Cheese cheese;
    private Pepperoni pepperoni;
    private Clams clams;

    public abstract void prepare();

    public void bake() {
        System.out.println("Baking for 25 minutes at 350 degrees.");
    }

    public void cut() {
        System.out.println("Cutting pizza into diagonal slices.");
    }

    public void box() {
        System.out.println("Boxing pizza in official PizzaStore box.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dough getDough() {
        return dough;
    }

    public void setDough(Dough dough) {
        this.dough = dough;
    }

    public Sauce getSauce() {
        return sauce;
    }

    public void setSauce(Sauce sauce) {
        this.sauce = sauce;
    }

    public Veggies[] getVeggies() {
        return veggies;
    }

    public void setVeggies(Veggies[] veggies) {
        this.veggies = veggies;
    }

    public Cheese getCheese() {
        return cheese;
    }

    public void setCheese(Cheese cheese) {
        this.cheese = cheese;
    }

    public Pepperoni getPepperoni() {
        return pepperoni;
    }

    public void setPepperoni(Pepperoni pepperoni) {
        this.pepperoni = pepperoni;
    }

    public Clams getClams() {
        return clams;
    }

    public void setClams(Clams clam) {
        this.clams = clam;
    }
}
