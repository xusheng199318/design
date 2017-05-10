package com.arthur.proxy;

/**
 * Created by IntelliJ IDEA.
 * User : xusheng.
 * Date : 2017/4/26 14:12.
 */
public class Proxy implements GiveGift {

    private Pursuit pursuit;

    public Proxy(SchoolGirl mm) {
        this.pursuit = new Pursuit(mm);
    }

    @Override
    public void giveDolls() {
        this.pursuit.giveDolls();
    }

    @Override
    public void giveFlowers() {
        this.pursuit.giveFlowers();
    }

    @Override
    public void giveChocolate() {
        this.pursuit.giveChocolate();
    }
}
