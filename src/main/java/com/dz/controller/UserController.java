package com.dz.controller;

import com.dz.entity.User;
import com.dz.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping("/user/{userId}")
    @ResponseBody
    public User getUser(@PathVariable int userId) {
        User user = userService.selectUser(userId);
        System.out.println("**************" + user + "**************");
        return user;
    }

    @RequestMapping("/user/all")
    @ResponseBody
    public ModelAndView getUsers() {
        List<User> userList = userService.getUsers();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("userList");
        modelAndView.addObject(userList);
        return modelAndView;
    }

}
