package com.yczlab.spring.beans.relation;

import com.yczlab.spring.beans.autowire.Address;
import com.yczlab.spring.beans.autowire.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans-relation.xml");
        //抽象Bean在IOC容器中不会被实例化
        //Address address = (Address) context.getBean("address");
        //System.out.println(address);

        Address address = (Address) context.getBean("address2");
        System.out.println(address);

        System.out.println("******************************");
        address = (Address) context.getBean("address3");
        System.out.println(address);

        System.out.println("******************************");
        address = (Address) context.getBean("address4");
        System.out.println(address);

        System.out.println("******************************");
        Person person = (Person) context.getBean("person");
        System.out.println(person);

    }
}
