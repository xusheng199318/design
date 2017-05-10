package com.arthur.observer;

import org.junit.Test;

/**
 * Created by IntelliJ IDEA.
 * User : xusheng.
 * Date : 2017/4/12 15:19.
 */
public class MainTest {

    @Test
    public void test1(){
        WeatherData wd = new WeatherData();

        CurrentConditionsDisplay ccd = new CurrentConditionsDisplay(wd);

        //wd.removeObserver(ccd);

        wd.setMeasurements(10,11,12);
    }
}
