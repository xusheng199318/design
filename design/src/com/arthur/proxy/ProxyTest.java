package com.arthur.proxy;


import org.junit.Test;

/**
 * Created by IntelliJ IDEA.
 * User : xusheng.
 * Date : 2017/4/26 11:03.
 */
public class ProxyTest {

    @Test
    public void test1(){
        SchoolGirl mm = new SchoolGirl("haha");
        Proxy daili = new Proxy(mm);
        daili.giveDolls();
        daili.giveFlowers();
        daili.giveChocolate();
    }

}
