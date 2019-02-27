package com.super1peng.demo01;

/**
 * @Author: super1peng
 * @Date: 2019/2/27 下午1:45
 * @Version 1.0
 */
public interface MyInterfaceDefault {

    // 抽象方法
    public abstract void methodAbs();

    // 新添加了一个抽象方法
//    public abstract void methodAbs2();

    // 新添加的方法，改成默认方法
    public default void methodDefault() {
        System.out.println("这是新添加的默认方法");
    }
}
