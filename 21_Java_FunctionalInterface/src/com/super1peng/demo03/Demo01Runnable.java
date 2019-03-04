package com.super1peng.demo03;

/**
 * @Author: super1peng
 * @Date: 2019/3/4 下午4:50
 * @Version 1.0
 */
public class Demo01Runnable {

    public static void startThread(Runnable run){
        // 开启线程
        new Thread(run).start();
    }

    public static void main(String[] args) {
        startThread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "-->" + "线程启动了");
            }
        });

        startThread(() -> {
            System.out.println(Thread.currentThread().getName() + "-->" + "线程启动了");
        });

        startThread(()-> System.out.println(Thread.currentThread().getName() + "-->" + "线程启动了"));
    }
}
