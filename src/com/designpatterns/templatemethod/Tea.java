package com.designpatterns.templatemethod;

public class Tea extends CaffeineBeverage {

    @Override
    void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding lemon");
    }

    // Don't override customerWantsCondiments(), so it will use the default implementation (true) in the superclass.
}
