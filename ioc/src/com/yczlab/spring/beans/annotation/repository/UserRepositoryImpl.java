package com.yczlab.spring.beans.annotation.repository;

import com.yczlab.spring.beans.annotation.TestObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

//添加注解并设置bean在IOC容器中的名字，即id。也可以使用默认名字userRepositoryImpl
//@Repository("userRepository")
@Repository
public class UserRepositoryImpl implements UserRepository {

    //设置@Autowired注解的required属性为false，当容器中没有testObject的Bean实例时也不会报错，不然会报错
    @Autowired(required = false)
    private TestObject testObject;

    @Override
    public void save() {
        System.out.println("UserRepository Save...");
        System.out.println("testObject: " + testObject);
    }
}
