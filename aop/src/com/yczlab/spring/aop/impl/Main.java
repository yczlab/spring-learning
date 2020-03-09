package com.yczlab.spring.aop.impl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        //1、创建Spring的IOC容器
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //2、从IOC容器中获取bean的实例
        ArithmeticCalculator arithmeticCalculator = context.getBean(ArithmeticCalculator.class);

        //3、使用bean
        /*
        int result = arithmeticCalculator.add(3, 6);
        System.out.println("result: " + result);

        System.out.println("*****************");
        result = arithmeticCalculator.div(12, 6);
        System.out.println("result" + result);
        */

        //以下程序故意发生异常，测试异常通知
        /*
        System.out.println("*****************");
        result = arithmeticCalculator.div(12, 0);
        System.out.println("result" + result);
        */

        //测试环绕通知（环绕通知类似于动态代理）
        System.out.println("****************");
        int result = arithmeticCalculator.sub(12, 6);
        System.out.println("result: " + result);
        System.out.println("****************");
        result = arithmeticCalculator.mul(3, 4);
        System.out.println("result: " + result);
        System.out.println("****************");
        //测试异常情况，“除零”异常发生时返回值为null，无法转换为int类型，会在次发生异常。主要测试“除零”异常
        result = arithmeticCalculator.div(100, 0);//测试异常情况，异常发生时返回值为null，无法转换为int
        System.out.println("result: " + result);
    }
}
