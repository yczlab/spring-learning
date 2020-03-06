package com.yczlab.spring.beans.factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans-factory.xml");

        Car car1 = (Car) context.getBean("staticCar");
        System.out.println(car1);

        System.out.println("**********************");
        Car car2 = (Car) context.getBean("instanceCar");
        System.out.println(car2);

    }
}
