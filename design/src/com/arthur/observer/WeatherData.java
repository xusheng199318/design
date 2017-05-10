package com.arthur.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User : xusheng.
 * Date : 2017/3/30 17:16.
 */
public class WeatherData implements Subject {

    private List<Observer> observers;
    private float temp;
    private float humidity;
    private float pressure;

    public WeatherData() {
        this.observers = new ArrayList<Observer>();
    }


    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int i = observers.indexOf(observer);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    /**
     * 通知观察者状态变化
     */
    @Override
    public void notifyObservers() {
        for(Observer o : observers){
            o.update(this.temp, this.humidity, this.pressure);
        }
    }

    public void measurementChanged(){
        notifyObservers();
    }

    public void setMeasurements(float temp, float humidity, float pressure){

        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;

        measurementChanged();
    }

}
