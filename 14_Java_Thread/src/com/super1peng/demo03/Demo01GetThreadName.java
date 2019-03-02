package com.super1peng.demo03;

/**
 * @Author: super1peng
 * @Date: 2019/3/2 下午4:31
 * @Version 1.0
 */
public class Demo01GetThreadName {
    /*
    线程的名称:
        主线程: main
        新线程: Thread-0,Thread-1,Thread-2
 */

    public static void main(String[] args) {
        // 创建Thread类的子类对象
        MyThread myThread = new MyThread();
        // 调用start方法，开启新线程，执行run方法
        myThread.start();

        new MyThread().start();
        new MyThread().start();

        System.out.println(Thread.currentThread().getName());
    }
}
