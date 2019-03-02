package com.super1peng.demo05;

/**
 * @Author: super1peng
 * @Date: 2019/3/2 下午4:43
 * @Version 1.0
 */
public class Demo01Sleep {

    public static void main(String[] args) {
        // 模拟秒表

        for (int i = 0; i < 60; i++) {
            System.out.println(i);

        // 使用Thread类的slepp方法让程序睡1秒
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
