package com.super1peng.demo09;

/**
 * @Author: super1peng
 * @Date: 2019/3/4 下午9:47
 * @Version 1.0
 */
/*
    定义一个创建Person对象的函数式接口
 */
@FunctionalInterface
public interface PersonBuilder {
    //定义一个方法,根据传递的姓名,创建Person对象返回
    Person builderPerson(String name);
}
