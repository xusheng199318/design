package com.arthur.aFactory;

import com.arthur.IUser;

/**
 * Created by IntelliJ IDEA.
 * User : xusheng.
 * Date : 2017/4/25 14:02.
 */
public class SqlserverUser implements IUser {

    @Override
    public void insert(User u) {
        System.out.println("SqlServer insert");
    }

    @Override
    public User getUser(String id) {
        System.out.println("SqlServer get");
        return null;
    }

}
