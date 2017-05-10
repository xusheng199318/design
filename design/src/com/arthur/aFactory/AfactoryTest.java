package com.arthur.aFactory;


import com.arthur.IUser;
import org.junit.Test;

/**
 * Created by IntelliJ IDEA.
 * User : xusheng.
 * Date : 2017/4/25 14:08.
 */
public class AfactoryTest {

    @Test
    public void test1(){
        IFactory iFactory = new MySqlFactory();
        IUser user = iFactory.createUser();

        User u = new User();
        u.setId("10");
        u.setName("haha");

        user.insert(u);
        user.getUser("10");

    }
}
