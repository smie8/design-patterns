package com.designpatterns.facade.subsystem;

public class CoffeeMachine {

    public void turnOn() {
        System.out.println("Coffee machine turned on");
    }

    public void grindBeans() {
        System.out.println("Beans ground");
    }

    public void brew() {
        System.out.println("Coffee brewed");
    }

    public void turnOff() {
        System.out.println("Coffee machine turned off");
    }
}
