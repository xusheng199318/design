package com.arthur.facade;

import org.junit.Test;

/**
 * Created by Wanda- on 2017/5/18.
 */
public class MainTest {

    @Test
    public void test1(){
        MyFund myFund = new MyFund();
        myFund.buyFund();
        myFund.sellFund();
    }
}
