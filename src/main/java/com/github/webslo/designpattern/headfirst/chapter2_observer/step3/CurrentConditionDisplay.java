package com.github.webslo.designpattern.headfirst.chapter2_observer.step3;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Observable;
import java.util.Observer;

/**
 * @author wenhailin
 * @version 0.0.1
 * @createTime 2019-01-26 19:24
 * @description
 */
public class CurrentConditionDisplay implements Observer, DisplayElement {
    private static final Logger logger = LoggerFactory.getLogger(CurrentConditionDisplay.class);
    Observable observable;
    private float temperature;
    private float humidity;

    public CurrentConditionDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable observable, Object arg) {
        if (observable instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) observable;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }

    @Override
    public void display() {
        logger.debug("Current conditions: {}F degrees and  {}% humidity", temperature, humidity);
    }
}
