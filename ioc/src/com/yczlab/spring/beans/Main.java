package com.yczlab.spring.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        /*
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setName("yczlab");
        helloWorld.hello();
        */

        //1、创建Spring的IOC容器对象
        //ApplicationContext(接口) 代表IOC
        //ClassPathXmlApplicationContext 是ApplicationContext接口的实现类，从类路径下加载配置文件夹
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        //2、从IOC容器中获取Bean实例
        //利用id定位到IOC容器中的bean
        HelloWorld helloWorld = (HelloWorld)ctx.getBean("helloWorld");
        //利用类型放回IOC容器中的Bean，但要求IOC容器中必须只能有一个该类型的Bean
        //HelloWorld helloWorld = (HelloWorld) ctx.getBean(HelloWorld.class);
        //3、调用hello方法
        helloWorld.hello();

        System.out.println("************************");
        Car car = (Car) ctx.getBean("car");
        System.out.println(car);

        car = (Car) ctx.getBean("car2");
        System.out.println(car);

        System.out.println("************************");
        Person person = (Person) ctx.getBean("person");
        System.out.println(person);

        person = (Person) ctx.getBean("person2");
        System.out.println(person);

    }
}
