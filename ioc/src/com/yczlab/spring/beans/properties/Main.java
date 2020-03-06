package com.yczlab.spring.beans.properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans-properties.xml");

        DataSource dataSource = (DataSource) context.getBean("dataSource");
        System.out.println(dataSource.getConnection());

        System.out.println("*********************");
        DataSource dataSource1 = (DataSource) context.getBean("dataSource1");
        System.out.println(dataSource1);

    }
}
