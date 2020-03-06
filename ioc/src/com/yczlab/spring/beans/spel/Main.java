package com.yczlab.spring.beans.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans-spel.xml");

        Address address = (Address) context.getBean("address");
        System.out.println(address);

        System.out.println("****************");
        Car car = (Car) context.getBean("car");
        System.out.println(car);

        System.out.println("****************");
        Person person = (Person) context.getBean("person");
        System.out.println(person);

    }
}
