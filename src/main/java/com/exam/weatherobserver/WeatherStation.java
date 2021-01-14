package com.exam.weatherobserver;

import com.exam.weatherobserver.myinterface.impl.CurrentConditionsDisplay;
import com.exam.weatherobserver.myinterface.impl.HeatIndexDisplay;
import com.exam.weatherobserver.myinterface.impl.WeatherData;

public class WeatherStation {
    public static void main(String[] args) {
        // 내가 만든 인터페이스 사용
        WeatherData myWeatherData = new WeatherData();
        CurrentConditionsDisplay myCurrentConditionsDisplay = new CurrentConditionsDisplay(myWeatherData);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(myWeatherData);
        myWeatherData.setMeasurements(20, 65, 30.4f);

        // java.util. 사용
        com.exam.weatherobserver.WeatherData weatherData = new com.exam.weatherobserver.WeatherData();
        com.exam.weatherobserver.CurrentConditionsDisplay currentConditionsDisplay = new com.exam.weatherobserver.CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(-1, 20, 28);
    }
}
