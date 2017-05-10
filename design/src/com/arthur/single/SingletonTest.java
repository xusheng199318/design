package com.arthur.single;

import org.junit.Test;

/**
 * Created by IntelliJ IDEA.
 * User : xusheng.
 * Date : 2017/4/25 16:33.
 */
public class SingletonTest {

    @Test
    public void test1(){
        Singleton1 s1 = Singleton1.getSingleton();
        Singleton1 s2 = Singleton1.getSingleton();
        System.out.println(s1 == s2);
    }

    @Test
    public void test2(){
        Singleton2 s1 = Singleton2.getInstance();
        Singleton2 s2 = Singleton2.getInstance();
        System.out.println(s1 == s2);
    }
}
