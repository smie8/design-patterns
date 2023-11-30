package com.designpatterns.compound.entities;

import com.designpatterns.compound.observer.QuackObservable;

public interface Quackable extends QuackObservable {

    void quack();
}
