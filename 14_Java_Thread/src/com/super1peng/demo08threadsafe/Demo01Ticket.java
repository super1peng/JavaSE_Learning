package com.super1peng.demo08threadsafe;

/**
 * @Author: super1peng
 * @Date: 2019/3/2 下午5:04
 * @Version 1.0
 */
public class Demo01Ticket {

    public static void main(String[] args) {
        Runnable r = new RunnableImpl();
        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);
        Thread t3 = new Thread(r);
        t1.start();
        t2.start();
        t3.start();
    }
}
