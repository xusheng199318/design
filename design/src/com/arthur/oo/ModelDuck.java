package com.arthur.oo;

/**
 * Created by IntelliJ IDEA.
 * User : xusheng.
 * Date : 2017/3/30 15:51.
 */
public class ModelDuck extends Duck {

    public ModelDuck() {
        super.setFlyBehavior(new FlyRocket());
        super.setQuackBehavior(new MuteQuack());
    }

    @Override
    public void display() {
        System.out.println("this is a modelduck");
    }
}
