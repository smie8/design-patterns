package com.designpatterns.compound.observer;

public interface Observer {

    // This method is called when the observed object is changed
    void update(QuackObservable duck);
}
