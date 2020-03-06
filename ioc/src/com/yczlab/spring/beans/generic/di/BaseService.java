package com.yczlab.spring.beans.generic.di;

import org.springframework.beans.factory.annotation.Autowired;

public class BaseService<T> {

    //该注解会被子类继承
    @Autowired
    protected BaseRepository<T> repository;

    public  void add() {
        System.out.println("add...");
        System.out.println(repository);
    }

}
