package com.arthur.prototype;

/**
 * Created by Wanda- on 2017/5/12.
 */
public class Resume implements Cloneable {
    private String name;
    private Integer age;
    private String sex;
    private WorkExperience workExperience;

    public Resume(String name){
        this.name = name;
    }

    public void setPersonalInfo(Integer age, String sex){
        this.age = age;
        this.sex = sex;
    }

    public void setWorkExperience(String timeArea, String company){
        this.workExperience = new WorkExperience();
        this.workExperience.setTimeArea(timeArea);
        this.workExperience.setCompany(company);
    }

    public void display(){
        System.out.println(this.name + "," + this.age + "," + this.sex);
        System.out.println("工作经历：" + this.workExperience.getTimeArea() + "," + this.workExperience.getCompany());
    }

    public Object clone(){
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }

}
