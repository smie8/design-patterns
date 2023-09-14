package com.designpatterns.observer.display;

import com.designpatterns.observer.weatherdata.Subject;

import static com.designpatterns.observer.utils.HeatIndexUtility.computeHeatIndex;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private float pressure;
    private float heatIndex;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        // register the display as an observer
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        this.heatIndex = computeHeatIndex(temperature, humidity);
        // display the measurements (Note that this is not the most optimal place to call display())
        display();
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " +
                temperature + "C degrees, " +
                humidity + "% humidity, " +
                pressure + " pressure " +
                "and " +
                heatIndex + " heat index");
    }
}
