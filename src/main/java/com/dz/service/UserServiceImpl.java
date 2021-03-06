package com.dz.service;

import com.dz.dao.UserDao;
import com.dz.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;
    @Override
    public User selectUser(int userId) {
        return this.userDao.selectUser(userId);
    }

    @Override
    public List<User> getUsers() {
        return userDao.getUsers();
    }
}
