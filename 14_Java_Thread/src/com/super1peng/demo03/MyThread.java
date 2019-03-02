package com.super1peng.demo03;

/**
 * @Author: super1peng
 * @Date: 2019/3/2 下午4:28
 * @Version 1.0
 */
public class MyThread extends Thread {

    /*
    获取线程的名称：
        1. 使用Thread类中的方法getName String getName()
        2. 可以先获取当前正在执行的线程，使用线程中的方法getName()获取线程的名称
            static Thread currentThread() 返回对当前正在执行的线程对象的引用
     */

    @Override
    public void run(){
        System.out.println(getName());
        System.out.println(Thread.currentThread().getName());
    }
}
