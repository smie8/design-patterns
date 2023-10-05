package com.designpatterns.templatemethod;

public abstract class CaffeineBeverage {

    // This is the template method, and it's final because we don't want subclasses to be able to alter the recipe.
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();

        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    // Subclasses will implement these methods, so they are abstract.
    abstract void brew();

    abstract void addCondiments();

    void boilWater() {
        System.out.println("Boiling water");
    }

    void pourInCup() {
        System.out.println("Pouring into cup");
    }

    // This is a hook, because the subclass can override this method, but doesn't have to (that's why it's not abstract).
    boolean customerWantsCondiments() {
        return true;
    }

    // Clients of beverages will depend on the CaffeineBeverage abstraction rather than
    // the concrete classes, which reduces dependencies and makes the code more flexible.
}
