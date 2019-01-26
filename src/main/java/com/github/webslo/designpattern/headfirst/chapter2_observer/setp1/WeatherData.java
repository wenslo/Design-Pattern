package com.github.webslo.designpattern.headfirst.chapter2_observer.setp1;

/**
 * @author wenhailin
 * @version 0.0.1
 * @createTime 2019-01-26 18:48
 * @description
 */
public class WeatherData {
    private String temperature;
    private String humidity;
    private String pressure;
    private CurrentConditionsDisplay currentConditionsDisplay;
    private StatisticsDisplay statisticsDisplay;
    private ForecastDisplay forecastDisplay;

    public WeatherData(CurrentConditionsDisplay currentConditionsDisplay, StatisticsDisplay statisticsDisplay, ForecastDisplay forecastDisplay) {
        this.currentConditionsDisplay = currentConditionsDisplay;
        this.statisticsDisplay = statisticsDisplay;
        this.forecastDisplay = forecastDisplay;

    }

    public void measurementsChanged() {
        currentConditionsDisplay.update(temperature, humidity, pressure);
        statisticsDisplay.update(temperature, humidity, pressure);
        forecastDisplay.update(temperature, humidity, pressure);
    }

    public String getTemperature() {
        return temperature;
    }

    public String getHumidity() {
        return humidity;
    }

    public String getPressure() {
        return pressure;
    }
}
