package com.designpatterns.observer.weatherdata;

import com.designpatterns.observer.display.Observer;

public interface Subject {

    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
