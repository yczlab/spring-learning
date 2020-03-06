package com.yczlab.spring.beans.annotation.repository;

import org.springframework.stereotype.Repository;

//添加注解并设置bean在IOC容器中的名字，即id
@Repository("userRepository")
public class UserRepositoryImpl implements UserRepository {
    @Override
    public void save() {
        System.out.println("UserRepository Save...");
    }
}
