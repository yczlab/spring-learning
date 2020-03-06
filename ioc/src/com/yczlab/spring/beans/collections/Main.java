package com.yczlab.spring.beans.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        ListPerson listPerson = (ListPerson) context.getBean("listPerson");
        System.out.println(context.getBean("car"));
        System.out.println(context.getBean("car2"));
        System.out.println(listPerson);

        System.out.println("*************************");
        MapPerson mapPerson = (MapPerson) context.getBean("mapPerson");
        System.out.println(mapPerson);

        System.out.println("*************************");
        DataSource dataSource = context.getBean(DataSource.class);
        System.out.println(dataSource.getProperties());
    }
}