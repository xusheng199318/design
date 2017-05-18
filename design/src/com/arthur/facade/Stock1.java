package com.arthur.facade;

/**
 * Created by Wanda- on 2017/5/18.
 */
public class Stock1 implements Stock{

    @Override
    public void buy() {
        System.out.println("buy stock1");
    }

    @Override
    public void sell() {
        System.out.println("sell stock1");
    }
}
