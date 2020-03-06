package com.yczlab.spring.beans.generic.di;

import org.springframework.stereotype.Service;

//父类没有加入Spring的自动管理，子类使用@Service注解加入Spring的自动管理
@Service
public class UserService extends BaseService<User> {

}
