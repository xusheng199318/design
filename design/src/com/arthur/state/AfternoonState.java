package com.arthur.state;

/**
 * Created by Wanda- on 2017/6/2.
 */
public class AfternoonState extends State {

    @Override
    public void writeProgram(Work work) {
        if (work.getHour() < 14) {
            System.out.println("当前时间:" + work.getHour() + "点，饿了，午饭，午休");
        }
    }

}
