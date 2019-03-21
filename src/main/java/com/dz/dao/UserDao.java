package com.dz.dao;

import com.dz.entity.User;

import java.util.List;

public interface UserDao {
    User selectUser(int id);
    List<User> getUsers();
}
