package com.yczlab.spring.beans.generic.di;

import org.springframework.stereotype.Repository;

//父类没有加入Spring的自动管理，子类使用@Repository注解加入Spring的自动管理
@Repository
public class UserRepository extends BaseRepository<User> {
}
