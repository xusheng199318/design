package com.arthur.simpleFactory;

/**
 * Created by IntelliJ IDEA.
 * User : xusheng.
 * Date : 2017/4/20 10:35.
 */
public class PizzaStore {

    SimpleFactory simpleFactory;

    public PizzaStore(SimpleFactory simpleFactory) {
        this.simpleFactory = simpleFactory;
    }

    public void orderPizza(String type){

        Pizza pizza;

        pizza = simpleFactory.createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
    }
}
