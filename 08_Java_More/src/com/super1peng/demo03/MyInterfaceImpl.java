package com.super1peng.demo03;

/**
 * @Author: super1peng
 * @Date: 2019/2/27 下午3:56
 * @Version 1.0
 */
public class MyInterfaceImpl implements MyInterface {

    @Override
    public void method1() {
        System.out.println("实现类覆盖重写了方法！111");
    }

    @Override
    public void method2() {
        System.out.println("实现类覆盖重写了方法！222");
    }
}
