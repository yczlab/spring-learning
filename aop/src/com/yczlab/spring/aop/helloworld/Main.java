package com.yczlab.spring.aop.helloworld;

public class Main {
    public static void main(String[] args) {
        //System.out.println("开始Spring的面向切面编程！");

        //直接在实现类ArithmeticCalculatorLoggingImpl的方法中写日志信息
        ArithmeticCalculator arithmeticCalculatorLogging;
        arithmeticCalculatorLogging = new ArithmeticCalculatorLoggingImpl();
        int result = arithmeticCalculatorLogging.add(1, 2);
        System.out.println("-->" + result);
        result = arithmeticCalculatorLogging.div(4, 2);
        System.out.println("-->" + result);

        System.out.println("***********************************");
        //通过使用动态代理的方式写入日志信息
        ArithmeticCalculator target = new ArithmeticCalculatorImpl();
        ArithmeticCalculator proxy = new ArithmeticCalculatorLoggingProxy(target).getLoggingProxy();

        //打印代理对象的信息
        System.out.println(proxy.getClass().getTypeName());
        System.out.println(proxy.getClass().getName());

        result = proxy.add(1, 2);
        System.out.println("-->" + result);
        result = proxy.div(4, 2);
        System.out.println("-->" + result);

    }
}
