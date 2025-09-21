package com.xs.dao;

import com.xs.dao.IUserDao;
import org.springframework.stereotype.Component;

//@Repository
public class UserDao implements IUserDao {

    @Override
    public void getUser(){
        System.out.println("hello spring from UserDao");
    }
}
