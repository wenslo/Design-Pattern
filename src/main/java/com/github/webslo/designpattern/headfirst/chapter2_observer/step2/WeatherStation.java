package com.github.webslo.designpattern.headfirst.chapter2_observer.step2;

/**
 * @author wenhailin
 * @version 0.0.1
 * @createTime 2019-01-26 19:11
 * @description
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        DoubleConditionDisplay doubleConditionDisplay = new DoubleConditionDisplay(weatherData);
        weatherData.setMeasurement(80, 65, 30.4f);
        weatherData.setMeasurement(82, 70, 29.2f);
        weatherData.setMeasurement(78, 90, 29.4f);
    }
}
