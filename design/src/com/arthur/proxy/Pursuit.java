package com.arthur.proxy;

/**
 * Created by IntelliJ IDEA.
 * User : xusheng.
 * Date : 2017/4/26 10:59.
 */
public class Pursuit implements GiveGift{

    private SchoolGirl mm;

    public Pursuit(SchoolGirl mm) {
        this.mm = mm;
    }

    public Pursuit() {
    }

    public void giveDolls(){
        System.out.println(this.mm.getName() + " give dool");
    }

    public void giveFlowers(){
        System.out.println(this.mm.getName() + " give flowers");
    }

    public void giveChocolate(){
        System.out.println(this.mm.getName() + " give chocolate");
    }
}
