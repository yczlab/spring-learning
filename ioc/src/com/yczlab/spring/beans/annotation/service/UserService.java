package com.yczlab.spring.beans.annotation.service;

import com.yczlab.spring.beans.annotation.repository.UserJdbcRepositoryImpl;
import com.yczlab.spring.beans.annotation.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    //@Autowired注解直接放在属性上
    @Autowired
    @Qualifier("userRepositoryImpl")//特别指定IOC容器中的哪个bean实例装配到该属性
    private UserRepository userRepository;

    @Autowired
    @Qualifier("userJdbcRepositoryImpl")
    private UserRepository userJdbcRepository;

    //@Autowired注解也可以放在方法上
    /*
    @Autowired
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    */

    //@Autowired注解也可以放在形参前面
    /*
    @Autowired
    public void setUserRepository(@Autowired UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    */

    public void add() {
        System.out.println("UserService add...");
        userRepository.save();
        userJdbcRepository.save();
    }
}
