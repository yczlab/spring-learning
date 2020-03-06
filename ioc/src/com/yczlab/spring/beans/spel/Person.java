package com.yczlab.spring.beans.spel;

public class Person {
    private String name;
    private Car car;
    private String city;//打算 引用address bean的city属性
    private String info;//打算 根据car的price属性确定info。price>=300000,为金领；否则为白领

    public Person() {
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Car getCar() {
        return car;
    }
    public void setCar(Car car) {
        this.car = car;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getInfo() {
        return info;
    }
    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", car=" + car +
                ", city='" + city + '\'' +
                ", info='" + info + '\'' +
                '}';
    }
}
