package com.super1peng.demo01;

/**
 * @Author: super1peng
 * @Date: 2019/3/3 下午1:31
 * @Version 1.0
 */
public class RunnableImpl implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " 新线程创建了");
    }
}
