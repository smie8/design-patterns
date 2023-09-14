package com.designpatterns.observer.weatherstation;

import com.designpatterns.observer.display.CurrentConditionsDisplay;
import com.designpatterns.observer.display.StatisticsDisplay;

public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);

        weatherData.setMeasurements(24, 65, 30.4f);
        weatherData.setMeasurements(20, 70, 29.2f);
        weatherData.setMeasurements(22, 90, 29.2f);
        weatherData.setMeasurements(17, 95, 39.9f);
    }
}
