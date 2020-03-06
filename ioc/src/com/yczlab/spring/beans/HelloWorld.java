package com.yczlab.spring.beans;

public class HelloWorld {

    private String name;

    public void hello() {
        System.out.println("hello:" + name);
    }

    public HelloWorld() {

    }

    public HelloWorld(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
