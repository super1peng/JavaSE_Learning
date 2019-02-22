package com.super1peng.demo03;

/**
 * @Author: super1peng
 * @Date: 2019/2/22 下午5:37
 * @Version 1.0
 */

/*
对于基本类型当中的boolean值，Getter方法一定要写成isXxx的形式，而setXxx规则不变。
 */

public class Student {

    private String name;
    private  int age;
    private boolean male;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isMale() {
        return male;
    }

    public void setMale(boolean male) {
        this.male = male;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
