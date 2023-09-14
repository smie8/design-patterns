package com.designpatterns.observer.weatherdata;

import com.designpatterns.observer.display.Observer;

import java.util.ArrayList;

public class WeatherData implements Subject {

    // the actual list that holds the observers during runtime
    private ArrayList<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList();
    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.removeIf(o -> o.equals(observer));
    }

    public void notifyObservers() {
        observers.forEach(o -> o.update(temperature, humidity, pressure));
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    // the purpose of this method is to simulate new weather measurements
    // this could be replaced by actual measurements from a weather station api
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
