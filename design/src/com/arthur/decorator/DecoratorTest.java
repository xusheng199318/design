package com.arthur.decorator;

import org.junit.Test;

/**
 * Created by IntelliJ IDEA.
 * User : xusheng.
 * Date : 2017/4/14 14:23.
 */
public class DecoratorTest {

    @Test
    public void testDecorator(){
        Beverage espresso = new Espresso();
        System.out.println(espresso.getDescription() + " $" + espresso.cost());

        Beverage houseBlend = new HouseBlend();
        System.out.println(houseBlend.getDescription() + " $" + houseBlend.cost());

        Mocha mocha = new Mocha(espresso);
        System.out.println(mocha.getDescription());
        System.out.println(mocha.cost());

        Milk milk = new Milk(mocha);
        System.out.println(milk.getDescription());
        System.out.println(milk.cost());
    }

}
