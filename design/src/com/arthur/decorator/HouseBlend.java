package com.arthur.decorator;

/**
 * Created by IntelliJ IDEA.
 * User : xusheng.
 * Date : 2017/4/14 14:12.
 */
public class HouseBlend extends Beverage {

    public HouseBlend(){
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return 0.89;
    }

}
