package com.dz.service;

import com.dz.entity.User;

import java.util.List;

public interface UserService {
    public User selectUser(int userId);
    public List<User> getUsers();
}
