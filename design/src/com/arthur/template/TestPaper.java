package com.arthur.template;

/**
 * Created by Wanda- on 2017/5/17.
 */
public abstract class TestPaper {

    public void question1(){
        System.out.println("问题1：");
    }

    public void question2(){
        System.out.println("问题2：");
    }

    public void question3(){
        System.out.println("问题3：");
    }

    protected abstract String answer1();

    protected abstract String answer2();

    protected abstract String answer3();

}
