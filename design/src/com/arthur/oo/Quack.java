package com.arthur.oo;

/**
 * Created by IntelliJ IDEA.
 * User : xusheng.
 * Date : 2017/3/30 15:31.
 */
public class Quack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("quack");
    }
}
