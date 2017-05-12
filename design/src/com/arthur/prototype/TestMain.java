package com.arthur.prototype;

import org.junit.Test;

/**
 * Created by Wanda- on 2017/5/12.
 */
public class TestMain {

    @Test
    public void test1(){
        Resume resume1 = new Resume("haha");
        resume1.setPersonalInfo(18, "ÄÐ");
        resume1.setWorkExperience("2000-2002", "wonders");

        Resume resume2 = (Resume) resume1.clone();
        resume2.setPersonalInfo(20, "Å®");
        resume2.setWorkExperience("2001-2003", "heihei");

        resume1.display();
        resume2.display();
    }
}
