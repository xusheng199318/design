package com.arthur.facade;

/**
 * Created by Wanda- on 2017/5/18.
 */
public class MyFund {
    private Stock1 stock1;
    private Stock2 stock2;

    public MyFund() {
        stock1 = new Stock1();
        stock2 = new Stock2();
    }

    public void buyFund(){
        stock1.buy();
        stock2.buy();
    }

    public void sellFund(){
        stock1.sell();
        stock2.sell();
    }
}
