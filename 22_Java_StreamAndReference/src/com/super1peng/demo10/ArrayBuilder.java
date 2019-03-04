package com.super1peng.demo10;

/**
 * @Author: super1peng
 * @Date: 2019/3/4 下午9:47
 * @Version 1.0
 */
/*
    定义一个创建数组的函数式接口
 */
@FunctionalInterface
public interface ArrayBuilder {
    //定义一个创建int类型数组的方法,参数传递数组的长度,返回创建好的int类型数组
    int[] builderArray(int length);
}
