package com.arthur.observer;

/**
 * Created by IntelliJ IDEA.
 * User : xusheng.
 * Date : 2017/4/12 14:38.
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private float temp;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData){
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println("Current conditions:" + this.temp + "F degree and " + this.humidity + "%humidity");
    }
}
