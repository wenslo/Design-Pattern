package com.github.webslo.designpattern.headfirst.chapter2_observer.step2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author wenhailin
 * @version 0.0.1
 * @createTime 2019-01-26 19:15
 * @description
 */
public class DoubleConditionDisplay implements Observer, DisplayElement {
    private static final Logger logger = LoggerFactory.getLogger(com.github.webslo.designpattern.headfirst.chapter2_observer.step2.CurrentConditionDisplay.class);
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public DoubleConditionDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        logger.debug("Double conditions: {}F degrees and  {}% humidity", temperature * 2, humidity * 2);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }
}
