package com.arthur.oo;

/**
 * Created by IntelliJ IDEA.
 * User : xusheng.
 * Date : 2017/3/30 15:28.
 */
public class FlyNoWay implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("can't fly");
    }

}
