package com.super1peng.demo08threadsafe;

/**
 * @Author: super1peng
 * @Date: 2019/3/2 下午5:01
 * @Version 1.0
 */
public class RunnableImpl implements Runnable {

    // 定义一个多线程共享票源
    private int ticket = 100;

    @Override
    public void run() {
        // 使用死循环
        while (true){
            // 首先判断票是否存在
            if (ticket > 0){
                // 提高安全问题出现的概率，让程序进行睡眠
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //票存在,卖票 ticket--
                System.out.println(Thread.currentThread().getName()+"-->正在卖第"+ticket+"张票");
                ticket--;
            }
        }
    }
}
