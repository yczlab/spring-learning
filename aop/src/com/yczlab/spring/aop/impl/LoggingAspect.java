package com.yczlab.spring.aop.impl;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

//把这个类声明为一个切面：需要把该类放入到IOC容器中，再声明为一个切面
@Aspect //声明为一个切面，使用该注解需要“aspectjweaver-xxx.jar”包的支持，"xxx"代表版本
@Component //放入IOC容器中
public class LoggingAspect {

    //声明该方法是一个前置通知：在目标方法开始之前执行
    //如果这样写execution(public int com.yczlab.spring.aop.impl.ArithmeticCalculator.add(int, int))
    //那么只对ArithmeticCalculator.add方法起作用
    @Before("execution(public int com.yczlab.spring.aop.impl.ArithmeticCalculator.*(int, int))")
    public void beforeMethod(JoinPoint joinPoint) {
        //可以通过JoinPoint参数来访问到连接的细节，如方法名称和参数值等
        String methodName = joinPoint.getSignature().getName();
        List<Object> args = Arrays.asList(joinPoint.getArgs());
        System.out.println("The method " + methodName + " begins with " + args);
    }

}
