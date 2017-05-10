package com.arthur.simpleFactory;

/**
 * Created by IntelliJ IDEA.
 * User : xusheng.
 * Date : 2017/4/21 13:44.
 */
public class VegePizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("prepare vegePizza");
    }

    @Override
    public void bake() {
        System.out.println("bake vegePizza");
    }

    @Override
    public void cut() {
        System.out.println("cut vegePizza");
    }

    @Override
    public void box() {
        System.out.println("box vegePizza");
    }
}
