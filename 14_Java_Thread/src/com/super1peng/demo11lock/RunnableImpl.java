package com.super1peng.demo11lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author: super1peng
 * @Date: 2019/3/2 下午5:18
 * @Version 1.0
 */
public class RunnableImpl implements Runnable{

    /*
        解决线程安全问题的三种方案:使用Lock锁
        java.util.concurrent.locks.Lock接口
        Lock 实现提供了比使用 synchronized 方法和语句可获得的更广泛的锁定操作。
        Lock接口中的方法:
            void lock()获取锁。
            void unlock()  释放锁。
        java.util.concurrent.locks.ReentrantLock implements Lock接口


        使用步骤:
            1.在成员位置创建一个ReentrantLock对象
            2.在可能会出现安全问题的代码前调用Lock接口中的方法lock获取锁
            3.在可能会出现安全问题的代码后调用Lock接口中的方法unlock释放锁
     */

    private int ticket = 100;
    Lock l = new ReentrantLock();

    @Override
    public void run() {
        while (true){
            l.lock();
            //先判断票是否存在
            if(ticket>0){
                //提高安全问题出现的概率,让程序睡眠
                try {
                    Thread.sleep(10);
                    //票存在,卖票 ticket--
                    System.out.println(Thread.currentThread().getName()+"-->正在卖第"+ticket+"张票");
                    ticket--;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    //3.在可能会出现安全问题的代码后调用Lock接口中的方法unlock释放锁
                    l.unlock();//无论程序是否异常,都会把锁释放
                }
            }
        }
    }
}
