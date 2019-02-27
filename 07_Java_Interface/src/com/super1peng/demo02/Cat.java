package com.super1peng.demo02;

/**
 * @Author: super1peng
 * @Date: 2019/2/27 下午1:53
 * @Version 1.0
 */
public class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    // 子类特有方法
    public void catchMouse() {
        System.out.println("猫抓老鼠");
    }
}