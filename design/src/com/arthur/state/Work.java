package com.arthur.state;

/**
 * Created by Wanda- on 2017/6/2.
 */
public class Work {
    private State current;
    private int hour;
    private boolean finish;

    public Work(){
        current = new ForenoonState();
    }

    public void writeProgram(){
        current.writeProgram(this);
    }

    public State getCurrent() {
        return current;
    }

    public void setCurrent(State current) {
        this.current = current;
    }

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
}
