package com.arthur.simpleFactory;

/**
 * Created by IntelliJ IDEA.
 * User : xusheng.
 * Date : 2017/4/20 10:36.
 */
public class SimpleFactory {

    public Pizza createPizza(String type){

        if("cheese".equals(type)){
            return new CheesePizza();
        }

        if("vege".equals(type)){
            return new VegePizza();
        }

        return null;

    }

}
