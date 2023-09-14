package com.designpatterns.observer.display;

import com.designpatterns.observer.weatherdata.Subject;

import java.util.ArrayList;
import java.util.List;

import static com.designpatterns.observer.utils.HeatIndexUtility.computeHeatIndex;

public class StatisticsDisplay implements Observer, DisplayElement {

    private List<Float> temperatureList = new ArrayList<>();
    private List<Float> humidityList = new ArrayList<>();
    private List<Float> pressureList = new ArrayList<>();
    private List<Float> heatIndexList = new ArrayList<>();

    private Subject weatherData;

    public StatisticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        // Register the display as an observer
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        temperatureList.add(temperature);
        humidityList.add(humidity);
        pressureList.add(pressure);
        heatIndexList.add(computeHeatIndex(temperature, humidity));

        // Display the updated statistics
        display();
    }

    @Override
    public void display() {
        System.out.println("Statistics:");
        displayMetric("Temperature", "C", temperatureList);
        displayMetric("Humidity", "%", humidityList);
        displayMetric("Pressure", "Pa", pressureList);
        displayMetric("Heat Index", " Heat Index", heatIndexList);
    }

    private void displayMetric(String metricName, String unit, List<Float> dataList) {
        float sum = dataList.stream().reduce(0f, Float::sum);
        float max = dataList.stream().max(Float::compare).orElse(0f);
        float min = dataList.stream().min(Float::compare).orElse(0f);
        float average = sum / dataList.size();

        System.out.println(metricName + ":");
        System.out.println("  Average: " + average + unit);
        System.out.println("  Max: " + max + unit);
        System.out.println("  Min: " + min + unit);
    }
}