package com.designpatterns.adapter.adapters;

import com.designpatterns.adapter.entities.Duck;
import com.designpatterns.adapter.entities.Turkey;

// We are short on ducks, so we are going to use turkeys instead using this adapter.
public class TurkeyAdapter implements Duck {

    Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        // Turkeys can only fly short distances, so let's use loop here.
        for (int i = 0; i < 5; i++) {
            turkey.fly();
        }
    }
}
