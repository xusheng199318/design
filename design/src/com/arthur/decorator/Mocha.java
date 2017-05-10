package com.arthur.decorator;

/**
 * Created by IntelliJ IDEA.
 * User : xusheng.
 * Date : 2017/4/14 14:20.
 */
public class Mocha extends CondimentDecorator {

    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return 0.20 + this.beverage.cost();
    }

}
