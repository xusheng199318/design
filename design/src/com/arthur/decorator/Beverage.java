package com.arthur.decorator;

/**
 * Created by IntelliJ IDEA.
 * User : xusheng.
 * Date : 2017/4/14 13:49.
 */
public abstract class Beverage {

    String description = "Unknown Beverage";

    public String getDescription(){
        return this.description;
    }

    public abstract  double cost();

}
