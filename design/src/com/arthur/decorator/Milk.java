package com.arthur.decorator;

/**
 * Created by IntelliJ IDEA.
 * User : xusheng.
 * Date : 2017/4/14 17:06.
 */
public class Milk extends CondimentDecorator {

    private  Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + ",Milk";
    }

    @Override
    public double cost() {
        return this.beverage.cost() + 1.11;
    }
}
