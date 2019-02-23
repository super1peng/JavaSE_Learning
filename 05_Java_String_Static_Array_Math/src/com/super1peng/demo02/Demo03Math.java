package com.super1peng.demo02;

/**
 * @Author: super1peng
 * @Date: 2019/2/23 下午4:42
 * @Version 1.0
 */
public class Demo03Math {

    public static void main(String[] args) {
        // 获取绝对值
        System.out.println(Math.abs(3.14)); // 3.14
        System.out.println(Math.abs(0)); // 0
        System.out.println(Math.abs(-2.5)); // 2.5
        System.out.println("================");

        // 向上取整
        System.out.println(Math.ceil(3.9)); // 4.0
        System.out.println(Math.ceil(3.1)); // 4.0
        System.out.println(Math.ceil(3.0)); // 3.0
        System.out.println("================");

        // 向下取整，抹零
        System.out.println(Math.floor(30.1)); // 30.0
        System.out.println(Math.floor(30.9)); // 30.0
        System.out.println(Math.floor(31.0)); // 31.0
        System.out.println("================");

        System.out.println(Math.round(20.4)); // 20
        System.out.println(Math.round(10.5)); // 11
    }
}
