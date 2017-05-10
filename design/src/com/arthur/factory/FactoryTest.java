package com.arthur.factory;

import org.junit.Test;

/**
 * Created by IntelliJ IDEA.
 * User : xusheng.
 * Date : 2017/4/24 15:08.
 */
public class FactoryTest {

    @Test
    public void test1(){
        LeiFengFactory leiFengFactory = new VolunteerFactory();
        LeiFeng lf = leiFengFactory.createLeiFeng();
        lf.buyPrice();
        lf.sweap();
    }

    @Test
    public void test2(){
        LeiFengFactory leiFengFactory = new UnderFactory();
        LeiFeng lf = leiFengFactory.createLeiFeng();
        lf.buyPrice();
        lf.sweap();
    }

}
