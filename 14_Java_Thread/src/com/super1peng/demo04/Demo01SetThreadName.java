package com.super1peng.demo04;

/**
 * @Author: super1peng
 * @Date: 2019/3/2 下午4:34
 * @Version 1.0
 */
public class Demo01SetThreadName {

    public static void main(String[] args) {
        //开启多线程
        MyThread mt = new MyThread();
        mt.setName("小强");
        mt.start();

        //开启多线程
        new MyThread("旺财").start();
    }
}