package com.arthur;

/**
 * Created by Wanda- on 2017/5/18.
 */
public enum Size {


    SMALL("S"),MIDDLE("M"),BIG("B");

    private String value;
    private Size(String value){
        this.value = value;
    }
    public String getValue(){
        return this.value;
    }
}
