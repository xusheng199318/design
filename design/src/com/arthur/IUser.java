package com.arthur;

import com.arthur.aFactory.User;

/**
 * Created by IntelliJ IDEA.
 * User : xusheng.
 * Date : 2017/4/25 14:00.
 */
public interface IUser {
    void insert(User u);
    User getUser(String id);
}
