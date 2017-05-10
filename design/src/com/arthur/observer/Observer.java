package com.arthur.observer;

/**
 * Created by IntelliJ IDEA.
 * User : xusheng.
 * Date : 2017/3/30 17:09.
 */
public interface Observer {
    void update(float temp, float humidity, float pressure);
}
