package com.arthur.state;

/**
 * Created by Wanda- on 2017/6/2.
 */
public class ForenoonState extends State {

    @Override
    public void writeProgram(Work work) {
        if (work.getHour() < 12) {
            System.out.println("��ǰʱ��:" + work.getHour() + "�㣬���繤��������ٱ�");
        }else{
            work.setCurrent(new AfternoonState());
            work.writeProgram();
        }
    }
}
