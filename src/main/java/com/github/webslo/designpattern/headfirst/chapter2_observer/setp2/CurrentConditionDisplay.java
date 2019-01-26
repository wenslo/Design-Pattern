package com.github.webslo.designpattern.headfirst.chapter2_observer.setp2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author wenhailin
 * @version 0.0.1
 * @createTime 2019-01-26 19:07
 * @description
 */
public class CurrentConditionDisplay implements Observer, DisplayElement {
    private static final Logger logger = LoggerFactory.getLogger(CurrentConditionDisplay.class);
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        logger.debug("Current conditions: {}F degrees and  {}% humidity", temperature, humidity);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }
}
