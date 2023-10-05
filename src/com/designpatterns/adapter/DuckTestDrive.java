package com.designpatterns.adapter;

import com.designpatterns.adapter.adapters.TurkeyAdapter;
import com.designpatterns.adapter.entities.Duck;
import com.designpatterns.adapter.entities.MallardDuck;
import com.designpatterns.adapter.entities.WildTurkey;

public class DuckTestDrive {

    public static void main(String[] args) {
        MallardDuck duck = new MallardDuck();
        WildTurkey turkey = new WildTurkey();
        // We are short on ducks, so we are going to user turkey instead of duck using this adapter.
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("The Turkey says...");
        turkey.gobble();
        turkey.fly();

        System.out.println("\nThe Duck says...");
        testDuck(duck);

        System.out.println("\nThe TurkeyAdapter says...");
        testDuck(turkeyAdapter);
    }

    private static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
