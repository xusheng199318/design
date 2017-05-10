package com.arthur.aFactory;

import com.arthur.IUser;

/**
 * Created by IntelliJ IDEA.
 * User : xusheng.
 * Date : 2017/4/25 14:07.
 */
public class MySqlUser implements IUser {

    @Override
    public void insert(User u) {
        System.out.println("MySql insert");
    }

    @Override
    public User getUser(String id) {
        System.out.println("MySql get");
        return null;
    }

}
