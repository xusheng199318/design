package com.arthur.single;

/**
 * Created by IntelliJ IDEA.
 * User : xusheng.
 * Date : 2017/4/25 16:26.
 */
public class Singleton1 {
    private volatile static Singleton1 singleton1;

    private Singleton1(){}

    public static Singleton1 getSingleton(){

        if (singleton1 == null) {
            synchronized (Singleton1.class){
                if (singleton1 == null) {
                    singleton1 = new Singleton1();
                }
            }
        }

        return singleton1;

    }
}
