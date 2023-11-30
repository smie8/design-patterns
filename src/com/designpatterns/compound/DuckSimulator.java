package com.designpatterns.compound;

import com.designpatterns.compound.adapter.GooseAdapter;
import com.designpatterns.compound.decorator.QuackCounter;
import com.designpatterns.compound.entities.DuckCall;
import com.designpatterns.compound.entities.Goose;
import com.designpatterns.compound.entities.MallardDuck;
import com.designpatterns.compound.entities.Quackable;
import com.designpatterns.compound.entities.RedheadDuck;
import com.designpatterns.compound.entities.RubberDuck;

public class DuckSimulator {

    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        simulator.simulate();
    }

    private void simulate() {
        Quackable mallardDuck = new QuackCounter(new MallardDuck());
        Quackable redheadDuck = new QuackCounter(new RedheadDuck());
        Quackable duckCall = new QuackCounter(new DuckCall());
        Quackable rubberDuck = new QuackCounter(new RubberDuck());
        Quackable goose = new GooseAdapter(new Goose()); // We are not counting goose honks

        System.out.println("\nDuck Simulator\n");

        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(goose);

        System.out.println("\nThe ducks quacked " + QuackCounter.getQuacks() + " times");
    }

    // Polymorphism in action
    private void simulate(Quackable duck) {
        duck.quack();
    }
}
