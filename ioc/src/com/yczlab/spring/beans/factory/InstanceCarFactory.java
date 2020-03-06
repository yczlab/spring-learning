package com.yczlab.spring.beans.factory;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description: 实例工厂的方法：即先需要创建工厂本身，再调用实例化后的工厂的方法返回bean实例
 * @Author: ycz
 * @Date: 2020/3/5
 */
public class InstanceCarFactory {

    private Map<String, Car> cars = null;

    public InstanceCarFactory() {
        cars = new HashMap<String, Car>();
        cars.put("audi", new Car("audi", 300000));
        cars.put("ford", new Car("ford", 400000));
    }

    public Car getCar(String brand) {
        return cars.get(brand);
    }

}
