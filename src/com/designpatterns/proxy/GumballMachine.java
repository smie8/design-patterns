package com.designpatterns.proxy;

import com.designpatterns.proxy.states.HasQuarterState;
import com.designpatterns.proxy.states.NoQuarterState;
import com.designpatterns.proxy.states.SoldOutState;
import com.designpatterns.proxy.states.SoldState;
import com.designpatterns.proxy.states.State;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class GumballMachine extends UnicastRemoteObject implements GumballMachineRemote {

    private State soldOutState;
    private State noQuarterState;
    private State hasQuarterState;
    private State soldState;

    private State state;
    private int gumballsCount = 0;
    private String location;

    public GumballMachine(String location, int numberOfGumballs) throws RemoteException {
        // Instantiate all states
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);

        // Set initial state if there are gumballs
        this.gumballsCount = numberOfGumballs;
        if (numberOfGumballs > 0) {
            state = noQuarterState;
        } else {
            state = soldOutState;
        }

        this.location = location;
    }

    // Actions as methods
    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    public void releaseBall() {
        System.out.println("A gumball comes rolling out the slot");
        if (gumballsCount != 0) {
            gumballsCount--;
        }
    }

    public void refill(int count) {
        this.gumballsCount = count;
        state = noQuarterState;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("\nMighty Gumball, Inc.");
        result.append("\nJava-enabled Standing Gumball Model #2004");
        result.append("\nInventory: " + gumballsCount + " gumball");
        if (gumballsCount != 1) {
            result.append("s");
        }
        result.append("\n");
        if (state == soldOutState) {
            result.append("Machine is sold out");
        } else if (state == noQuarterState) {
            result.append("Machine is waiting for quarter");
        } else if (state == hasQuarterState) {
            result.append("Machine is waiting for turn of crank");
        } else if (state == soldState) {
            result.append("Machine is dispensing a gumball");
        }
        result.append("\n");
        return result.toString();
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public void setSoldOutState(State soldOutState) {
        this.soldOutState = soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public void setNoQuarterState(State noQuarterState) {
        this.noQuarterState = noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public void setHasQuarterState(State hasQuarterState) {
        this.hasQuarterState = hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public void setSoldState(State soldState) {
        this.soldState = soldState;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public int getGumballsCount() {
        return gumballsCount;
    }

    public void setGumballsCount(int gumballsCount) {
        this.gumballsCount = gumballsCount;
    }

    @Override
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
