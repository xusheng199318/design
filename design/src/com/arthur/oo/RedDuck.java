package com.arthur.oo;

/**
 * Created by IntelliJ IDEA.
 * User : xusheng.
 * Date : 2017/3/30 15:41.
 */
public class RedDuck extends Duck {

    public RedDuck() {
        super.setFlyBehavior(new FlyWithWings());
        super.setQuackBehavior(new Quack());
    }

    @Override
    public void display() {
        System.out.println("red duck");
    }

}
