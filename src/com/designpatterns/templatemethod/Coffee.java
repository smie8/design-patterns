package com.designpatterns.templatemethod;

public class Coffee extends CaffeineBeverage {

    private boolean customerWantsCondiments = false;

    @Override
    void brew() {
        System.out.println("Dripping coffee through filter");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding sugar and milk");
    }

    @Override
    boolean customerWantsCondiments() {
        customerWantsCondiments = getCoinFlipBooleanResult();

        if (customerWantsCondiments) {
            System.out.println("(This customer wants condiments)");
        } else {
            System.out.println("(This customer does not want condiments)");
        }

        return customerWantsCondiments;
    }

    private boolean getCoinFlipBooleanResult() {
        return Math.random() < 0.5;
    }
}
