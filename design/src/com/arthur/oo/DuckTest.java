package com.arthur.oo;

import org.junit.Test;

/**
 * Created by IntelliJ IDEA.
 * User : xusheng.
 * Date : 2017/3/30 15:44.
 */
public class DuckTest {

    @Test
    public void testRedDuck(){
        Duck redDuck = new RedDuck();
        redDuck.display();
        redDuck.performFly();
        redDuck.performQuack();
        redDuck.swim();
    }


    @Test
    public void testModelDuck(){
        Duck modelDuck = new ModelDuck();
        modelDuck.display();
        modelDuck.swim();
        modelDuck.performFly();
        modelDuck.performQuack();
    }

}
