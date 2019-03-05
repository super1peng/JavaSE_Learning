package com.super1peng.demo05udp.screenbroadcast;

/**
 * @Author: super1peng
 * @Date: 2019/3/5 下午1:08
 * @Version 1.0
 */
public class Student {
    public static void main(String[] args) {
        StudentUI ui = new StudentUI();
        new Receiver(ui).start();
    }
}