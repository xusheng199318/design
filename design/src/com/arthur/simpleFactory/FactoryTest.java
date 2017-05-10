package com.arthur.simpleFactory;

import org.junit.Test;

/**
 * Created by IntelliJ IDEA.
 * User : xusheng.
 * Date : 2017/4/21 13:48.
 */
public class FactoryTest {

    @Test
    public void test1(){
        SimpleFactory simpleFactory = new SimpleFactory();
        PizzaStore pizzaStore = new PizzaStore(simpleFactory);
        pizzaStore.orderPizza("vege");
        pizzaStore.orderPizza("cheese");
    }
}
