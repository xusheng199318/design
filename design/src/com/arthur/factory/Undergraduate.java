package com.arthur.factory;

/**
 * Created by IntelliJ IDEA.
 * User : xusheng.
 * Date : 2017/4/24 14:47.
 */
public class Undergraduate implements LeiFeng {
    @Override
    public void buyPrice() {
        System.out.println("Undergraduate buyPrice");
    }

    @Override
    public void sweap() {
        System.out.println("Undergraduate sweap");
    }
}
