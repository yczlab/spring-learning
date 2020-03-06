package com.yczlab.spring.beans.generic.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//父类没有加入Spring的自动管理，子类使用@Service注解加入Spring的自动管理
@Service
public class UserService extends BaseService<User> {
    //继承@AutoWired注解后，会自动配置好BaseRepository<User>类型的实例Bean
    //相当于如下代码：
    /*
    @Autowired
    protected BaseRepository<User> repository;
    **/
}
