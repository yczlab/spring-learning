package com.yczlab.spring.beans;

public class HelloWorld {

    private String name;

    public HelloWorld() {
        System.out.println("HelloWorld's Constructor...");
    }
    public HelloWorld(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        System.out.println("setName: " + name);
        this.name = name;
    }

    public void hello() {
        System.out.println("hello: " + name);
    }
}
