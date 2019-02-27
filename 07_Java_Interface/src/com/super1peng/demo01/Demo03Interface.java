package com.super1peng.demo01;

/**
 * @Author: super1peng
 * @Date: 2019/2/27 下午1:48
 * @Version 1.0
 */
public class Demo03Interface {

    public static void main(String[] args) {
        // 创建了实现类对象
        MyInterfaceStaticImpl impl = new MyInterfaceStaticImpl();

        // 错误写法！
//        impl.methodStatic();

        // 直接通过接口名称调用静态方法
        MyInterfaceStatic.methodStatic();
    }
}
