package com.arthur.decorator;

/**
 * Created by IntelliJ IDEA.
 * User : xusheng.
 * Date : 2017/4/14 14:00.
 */
public class Espresso extends Beverage {

    public Espresso(){
        super.description = "Espresso";
    }


    @Override
    public double cost() {
        return 1.99;
    }
}
