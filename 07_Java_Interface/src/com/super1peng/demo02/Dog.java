package com.super1peng.demo02;

/**
 * @Author: super1peng
 * @Date: 2019/2/27 下午1:53
 * @Version 1.0
 */
public class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("狗吃SHIT");
    }

    public void watchHouse() {
        System.out.println("狗看家");
    }
}
