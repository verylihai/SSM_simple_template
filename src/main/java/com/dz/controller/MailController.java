package com.dz.controller;

import com.dz.utils.SendMail;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MailController {

    @RequestMapping("/sendEmail")
    public ModelAndView sendMessage(@ModelAttribute("toUser") String toUser, @ModelAttribute("sendContent") String sendContent, @ModelAttribute("title") String title){
//        String address = "daiyh_1989@163.com";
//        String title = "ceshi";
//        String content = "email for test";
        try {
            //SendMail.sendEmail(address,title,content);
        } catch (Exception e) {
            e.printStackTrace();
        }
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("sendEmailSuccessful");
        return modelAndView;
    }


}
