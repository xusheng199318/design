package com.arthur.state;

/**
 * Created by Wanda- on 2017/6/2.
 */
public class BadWork {
    private int hour;
    private boolean finish;

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public boolean isFinish() {
        return finish;
    }

    public void setFinish(boolean finish) {
        this.finish = finish;
    }

    public void writeProgram(){
        if (hour < 12) {
            System.out.println("��ǰʱ��:" + hour + "�㣬���繤��������ٱ�");
        }else if (hour < 13) {
            System.out.println("��ǰʱ��:" + hour + "�㣬���ˣ��緹������");
        }else if (hour < 17) {
            System.out.println("��ǰʱ��:" + hour + "�㣬����״̬����������Ŭ��");
        }else {
            if (finish) {
                System.out.println("������ɣ��°�ؼ�");
            }else {
                if (hour < 21) {
                    System.out.println("��ǰʱ��:" + hour + "�Ӱ�");
                }else {
                    System.out.println("��ǰʱ��:" + hour + "�����ˣ�˯����");
                }
            }
        }
    }
}
