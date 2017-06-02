package com.arthur.state;

/**
 * Created by Wanda- on 2017/6/2.
 */
public class ForenoonState extends State {

    @Override
    public void writeProgram(Work work) {
        if (work.getHour() < 12) {
            System.out.println("当前时间:" + work.getHour() + "点，上午工作，精神百倍");
        }else{
            work.setCurrent(new AfternoonState());
            work.writeProgram();
        }
    }
}
