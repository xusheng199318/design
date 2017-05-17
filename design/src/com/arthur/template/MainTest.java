package com.arthur.template;

import org.junit.Test;

/**
 * Created by Wanda- on 2017/5/17.
 */
public class MainTest {

    @Test
    public void test1(){
        TestPaperA a = new TestPaperA();
        a.question1();
        System.out.println(a.answer1());
        a.question2();
        System.out.println(a.answer2());
        a.question3();
        System.out.println(a.answer3());

    }
}
