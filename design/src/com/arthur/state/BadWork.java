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
            System.out.println("当前时间:" + hour + "点，上午工作，精神百倍");
        }else if (hour < 13) {
            System.out.println("当前时间:" + hour + "点，饿了，午饭，午休");
        }else if (hour < 17) {
            System.out.println("当前时间:" + hour + "点，下午状态还不错，继续努力");
        }else {
            if (finish) {
                System.out.println("工作完成，下班回家");
            }else {
                if (hour < 21) {
                    System.out.println("当前时间:" + hour + "加班");
                }else {
                    System.out.println("当前时间:" + hour + "不行了，睡着了");
                }
            }
        }
    }
}
