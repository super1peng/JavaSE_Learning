package com.super1peng.demo01;

/**
 * @Author: super1peng
 * @Date: 2019/2/27 下午1:47
 * @Version 1.0
 */
public class MyInterfaceDefaultB implements MyInterfaceDefault {
    @Override
    public void methodAbs() {
        System.out.println("实现了抽象方法，BBB");
    }

    @Override
    public void methodDefault() {
        System.out.println("实现类B覆盖重写了接口的默认方法");
    }
}