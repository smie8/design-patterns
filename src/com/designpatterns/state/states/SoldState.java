package com.designpatterns.state.states;

import com.designpatterns.state.GumballMachine;

public class SoldState implements State {

    private GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Please wait. We're already giving you a gumball");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Sorry. You already turned the crank");
    }

    @Override
    public void turnCrank() {
        System.out.println("Turning twice doesn't get you another gumball");
    }

    @Override
    public void dispense() {
        gumballMachine.releaseBall();
        if (gumballMachine.getGumballsCount() > 0) {
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        } else {
            System.out.println("Oops. Out of gumballs");
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
    }
}
