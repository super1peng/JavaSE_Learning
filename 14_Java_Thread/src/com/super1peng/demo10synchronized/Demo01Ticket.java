package com.super1peng.demo10synchronized;

/**
 * @Author: super1peng
 * @Date: 2019/3/2 下午5:16
 * @Version 1.0
 */
public class Demo01Ticket {

    public static void main(String[] args) {
        //创建Runnable接口的实现类对象
        RunnableImpl run = new RunnableImpl();
        System.out.println("run:"+run);//run:com.itheima.demo08.Synchronized.RunnableImpl@58ceff1
        //创建Thread类对象,构造方法中传递Runnable接口的实现类对象
        Thread t0 = new Thread(run);
        Thread t1 = new Thread(run);
        Thread t2 = new Thread(run);
        //调用start方法开启多线程
        t0.start();
        t1.start();
        t2.start();
    }
}