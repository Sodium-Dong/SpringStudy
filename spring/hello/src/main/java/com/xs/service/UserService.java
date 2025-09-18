package com.xs.service;

import com.xs.dao.IUserDao;
import com.xs.dao.User2Dao;
import com.xs.dao.UserDao;

public class UserService {

    IUserDao userDao  = new User2Dao();

    public void getUser(){
        userDao.getUser();
    }
}
