package com.designpatterns.facade;

import com.designpatterns.facade.subsystem.CoffeeMachine;
import com.designpatterns.facade.subsystem.Dishwasher;
import com.designpatterns.facade.subsystem.Toaster;

public class FacadeTestDrive {

    public static void main(String[] args) {
        BreakfastMachineFacade breakfastMachineFacade = new BreakfastMachineFacade(
                new CoffeeMachine(),
                new Toaster(),
                new Dishwasher());

        breakfastMachineFacade.makeBreakfast();
        breakfastMachineFacade.cleanUp();
    }
}
