package com.super1peng.demo06;

/**
 * @Author: super1peng
 * @Date: 2019/3/4 下午9:33
 * @Version 1.0
 */
@FunctionalInterface
public interface Calcable {
    //定义一个抽象方法,传递一个整数,对整数进行绝对值计算并返回
    int calsAbs(int number);
}