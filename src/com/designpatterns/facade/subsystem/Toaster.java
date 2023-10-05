package com.designpatterns.facade.subsystem;

public class Toaster {

    public void turnOn() {
        System.out.println("Toaster turned on");
    }

    public void insertBread() {
        System.out.println("Bread inserted");
    }

    public void toast() {
        System.out.println("Bread toasted");
    }

    public void turnOff() {
        System.out.println("Toaster turned off");
    }
}
