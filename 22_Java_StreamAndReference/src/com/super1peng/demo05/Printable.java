package com.super1peng.demo05;

/**
 * @Author: super1peng
 * @Date: 2019/3/4 下午9:28
 * @Version 1.0
 */
/*
    定义一个打印的函数式接口
 */
@FunctionalInterface
public interface Printable {
    //定义字符串的抽象方法
    void print(String s);
}
