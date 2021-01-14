package com.exam.weatherobserver;

import com.exam.weatherobserver.impl.CurrentConditionsDisplay;
import com.exam.weatherobserver.impl.HeatIndexDisplay;
import com.exam.weatherobserver.impl.WeatherData;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

        weatherData.setMeasurements(20, 65, 30.4f);
    }
}
