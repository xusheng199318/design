package com.arthur.oo;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by IntelliJ IDEA.
 * User : xusheng.
 * Date : 2017/3/30 15:32.
 */
public class MuteQuack implements  QuackBehavior {

    @Override
    public void quack() {
        System.out.println("silence");
    }
}
