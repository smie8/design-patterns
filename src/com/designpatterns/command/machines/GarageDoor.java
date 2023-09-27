package com.designpatterns.command.machines;

public class GarageDoor {

    public void up() {
        System.out.println("Garage door is moving up");
    }

    public void down() {
        System.out.println("Garage door is moving down");
    }

    public void stop() {
        System.out.println("Garage door is stopped");
    }

    public void lightOn() {
        System.out.println("Garage door light is on");
    }

    public void lightOff() {
        System.out.println("Garage door light is off");
    }
}
