package com.super1peng.demo06;

/**
 * @Author: super1peng
 * @Date: 2019/3/2 下午4:55
 * @Version 1.0
 */
public class RunnableImpl2 implements Runnable {

    //2.在实现类中重写Runnable接口的run方法,设置线程任务
    @Override
    public void run() {
        for (int i = 0; i <20 ; i++) {
            System.out.println("HelloWorld"+i);
        }
    }

}
