package com.arthur.facade;

/**
 * Created by Wanda- on 2017/5/18.
 */
public class Stock2 implements Stock {

    @Override
    public void buy() {
        System.out.println("buy stock2");
    }

    @Override
    public void sell() {
        System.out.println("sell stock2");
    }

}
