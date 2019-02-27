package com.super1peng.demo02;

/**
 * @Author: super1peng
 * @Date: 2019/2/27 下午3:50
 * @Version 1.0
 */
public class Demo01InnerClass {

    public static void main(String[] args) {
        Outer.Inner obj = new Outer().new Inner();
        System.out.println(obj.num); // 内部类成员变量
        obj.methodInner();
    }
}
