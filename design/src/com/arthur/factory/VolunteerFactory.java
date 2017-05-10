package com.arthur.factory;

/**
 * Created by IntelliJ IDEA.
 * User : xusheng.
 * Date : 2017/4/24 14:52.
 */
public class VolunteerFactory implements LeiFengFactory {

    @Override
    public LeiFeng createLeiFeng() {
        return new Volunteer();
    }

}
