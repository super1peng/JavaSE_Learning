package com.super1peng.demo02;

/**
 * @Author: super1peng
 * @Date: 2019/3/2 下午4:22
 * @Version 1.0
 */
public class MyThread extends Thread{

    // 1. 创建一个Thread类的子类
    // 2. 在Thread类的子类中重写Thread类中的方法，设置线程任务

    @Override
    public void run(){
        for (int i = 0; i < 20; i++) {
            System.out.println("run:" + i);
        }
    }
}
