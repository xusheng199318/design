package com.arthur.single;

import java.security.KeyStore;

/**
 * Created by IntelliJ IDEA.
 * User : xusheng.
 * Date : 2017/4/25 16:31.
 */
public class Singleton2 {

    private static Singleton2 singleton2 = new Singleton2();

    private Singleton2(){}

    public static Singleton2 getInstance(){
        return singleton2;
    }
}
