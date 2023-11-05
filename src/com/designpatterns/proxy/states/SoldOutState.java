package com.designpatterns.proxy.states;

import com.designpatterns.proxy.GumballMachine;

public class SoldOutState implements State {

    private transient GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You can insert a quarter. Sold out");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You can't eject. You haven't inserted a quarter yet");
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned but there's no gumballs");
    }

    @Override
    public void dispense() {
        System.out.println("No gumball dispensed");
    }
}
