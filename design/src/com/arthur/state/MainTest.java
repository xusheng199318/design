package com.arthur.state;

import org.junit.Test;

/**
 * Created by Wanda- on 2017/6/2.
 */
public class MainTest {

    @Test
    public void test1(){
        BadWork work = new BadWork();
        work.setHour(10);
        work.writeProgram();
        work.setHour(15);
        work.writeProgram();
        work.setHour(18);
        work.writeProgram();
        work.setHour(19);
        work.writeProgram();
        work.setHour(22);
        work.writeProgram();
    }

    @Test
    public void test2(){
        Work work = new Work();
        work.setHour(13);
        State state = new ForenoonState();
        work.writeProgram();
    }
}
