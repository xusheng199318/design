package com.arthur.aFactory;

import com.arthur.IUser;

/**
 * Created by IntelliJ IDEA.
 * User : xusheng.
 * Date : 2017/4/25 14:07.
 */
public class MySqlFactory implements IFactory {

    @Override
    public IUser createUser() {
        return new MySqlUser();
    }
}
