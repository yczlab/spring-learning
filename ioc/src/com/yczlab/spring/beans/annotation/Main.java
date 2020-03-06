package com.yczlab.spring.beans.annotation;

import com.yczlab.spring.beans.annotation.controller.UserController;
import com.yczlab.spring.beans.annotation.repository.UserRepository;
import com.yczlab.spring.beans.annotation.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans-annotation.xml");

        TestObject testObject = (TestObject) context.getBean("testObject");
        System.out.println(testObject);

        UserController userController = (UserController) context.getBean("userController");
        System.out.println(userController);

        UserService userService = (UserService) context.getBean("userService");
        System.out.println(userService);

        UserRepository userRepository = (UserRepository) context.getBean("userRepository");
        System.out.println(userRepository);

    }
}
