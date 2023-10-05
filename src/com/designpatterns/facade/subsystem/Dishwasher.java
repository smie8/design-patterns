package com.designpatterns.facade.subsystem;

public class Dishwasher {

    public void turnOn() {
        System.out.println("Dishwasher turned on");
    }

    public void insertDishes() {
        System.out.println("Dishes inserted");
    }

    public void wash() {
        System.out.println("Dishes washed");
    }

    public void turnOff() {
        System.out.println("Dishwasher turned off");
    }
}
