package com.designpatterns.proxy.states;

import java.io.Serializable;

// When State extends Serializable, we can transfer State over the network.
public interface State extends Serializable {

    void insertQuarter();
    void ejectQuarter();
    void turnCrank();
    void dispense();
}
