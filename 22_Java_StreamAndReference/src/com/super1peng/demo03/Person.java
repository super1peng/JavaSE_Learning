package com.super1peng.demo03;

/**
 * @Author: super1peng
 * @Date: 2019/3/4 下午9:17
 * @Version 1.0
 */
public class Person {
    private String name;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person() {
    }
}
