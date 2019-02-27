package com.super1peng.demo03;

/**
 * @Author: super1peng
 * @Date: 2019/2/27 下午1:57
 * @Version 1.0
 */
// 键盘就是一个USB设备
public class Keyboard implements USB {
    @Override
    public void open() {
        System.out.println("打开键盘");
    }

    @Override
    public void close() {
        System.out.println("关闭键盘");
    }

    public void type() {
        System.out.println("键盘输入");
    }
}
