package com.designpatterns.facade;

import com.designpatterns.facade.subsystem.CoffeeMachine;
import com.designpatterns.facade.subsystem.Dishwasher;
import com.designpatterns.facade.subsystem.Toaster;

public class BreakfastMachineFacade {

    private CoffeeMachine coffeeMachine;
    private Toaster toaster;
    private Dishwasher dishwasher;

    public BreakfastMachineFacade(CoffeeMachine coffeeMachine, Toaster toaster, Dishwasher dishwasher) {
        this.coffeeMachine = coffeeMachine;
        this.toaster = toaster;
        this.dishwasher = dishwasher;
    }

    public void makeBreakfast() {
        coffeeMachine.turnOn();
        coffeeMachine.grindBeans();
        coffeeMachine.brew();
        coffeeMachine.turnOff();

        toaster.turnOn();
        toaster.insertBread();
        toaster.toast();
        toaster.turnOff();

        System.out.println("Breakfast is ready!\n");
    }

    public void cleanUp() {
        dishwasher.turnOn();
        dishwasher.insertDishes();
        dishwasher.wash();
        dishwasher.turnOff();

        System.out.println("Dishes are clean!\n");
    }
}
