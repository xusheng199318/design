package com.arthur.factory;

/**
 * Created by IntelliJ IDEA.
 * User : xusheng.
 * Date : 2017/4/24 14:48.
 */
public class Volunteer implements LeiFeng {
    @Override
    public void buyPrice() {
        System.out.println("Volunteer buyPrice");
    }

    @Override
    public void sweap() {
        System.out.println("Volunteer sweap");
    }
}
