package com.yczlab.spring.aop.helloworld;

import org.springframework.cglib.proxy.InvocationHandler;
import org.springframework.cglib.proxy.Proxy;

import java.lang.reflect.Method;
import java.util.Arrays;

//使用该动态代理类，解决ArithmeticCalculatorImpl类方法中的日志问题
public class ArithmeticCalculatorLoggingProxy {

    //要代理的对象
    private ArithmeticCalculator target;

    public ArithmeticCalculatorLoggingProxy(ArithmeticCalculator target) {
        this.target = target;
    }

    public ArithmeticCalculator getLoggingProxy() {
        ArithmeticCalculator proxy = null;

        //代理对象有哪一个类加载器负责加载
        ClassLoader loader = target.getClass().getClassLoader();
        //代理对象的类型，即其中有哪些方法。可以通过ArithmeticCalculator.class.getMethods()返回一个方法数组Method[]
        Class[] interfaces = new Class[]{ArithmeticCalculator.class};
        //当调用代理对象其中的方法时，该执行的代码
        InvocationHandler h=new InvocationHandler() {
            /*
            * proxy：正在返回的那个代理对象，一般情况下，invoke方法中都不使用该对象。
            * method：正在被调用的方法
            * args：调用方法时，传入的参数
            * */
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                //在这里使用proxy时会出现死循环，StackOverflowError。因为一旦使用，又会被动态代理转移到这儿调用invoke，出现死循环
                //System.out.println(proxy.toString());

                String methodName = method.getName();//获取方法名
                //日志
                System.out.println("<-yczlab-> The method " + methodName + " begins with " + Arrays.asList(args));
                //执行方法
                Object result = null;
                try {
                    //前置通知，类似于@Before注解
                    result = method.invoke(target, args);
                    //返回通知，可以访问到方法的返回值，类似于@AfterReturning注解
                } catch (Exception e) {
                    e.printStackTrace();
                    //异常通知，可以访问到方法出现的异常
                }
                //后置通知，因为方法可能会出异常，所以访问不到方法的返回值

                //日志
                System.out.println("<-yczlab-> The method " + methodName + "ends with " + result);
                return result;
            }
        };
        proxy = (ArithmeticCalculator) Proxy.newProxyInstance(loader, interfaces, h);

        return proxy;
    }

}
