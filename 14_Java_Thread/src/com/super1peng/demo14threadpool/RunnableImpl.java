package com.super1peng.demo14threadpool;

/**
 * @Author: super1peng
 * @Date: 2019/3/2 下午5:37
 * @Version 1.0
 */
public class RunnableImpl implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"创建了一个新的线程执行");
    }
}
