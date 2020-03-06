package com.yczlab.spring.beans.annotation.controller;

import com.yczlab.spring.beans.annotation.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {

    //@Autowired注解可以放在属性上
    @Autowired
    private UserService userService;

    public void execute() {
        System.out.println("UserController execute...");
        userService.add();
    }
}
