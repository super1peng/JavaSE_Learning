package com.super1peng.demo01;

/**
 * @Author: super1peng
 * @Date: 2019/3/3 下午1:32
 * @Version 1.0
 */
public class Demo01Runnable {

    /*
    使用实现Runnable接口的方式实现多线程
     */

    public static void main(String[] args) {
        RunnableImpl run = new RunnableImpl();
        Thread thread = new Thread(run);
        // 使用start方法开启新线程，执行run方法
        thread.start();

        // 简化代码，使用匿名内部类，实现多线程程序
        Runnable r = new Runnable(){
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + " 新线程创建了");
            }
        };
        new Thread(r).start();

        // 简化代码
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + " 新线程创建了");
            }
        }).start();
    }
}
