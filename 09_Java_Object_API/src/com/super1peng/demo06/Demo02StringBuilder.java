package com.super1peng.demo06;

/**
 * @Author: super1peng
 * @Date: 2019/2/27 下午9:08
 * @Version 1.0
 */
public class Demo02StringBuilder {

    public static void main(String[] args) {
        StringBuilder bu = new StringBuilder();
        /*
            链式编程:方法返回值是一个对象,可以继续调用方法
         */
        System.out.println("abc".toUpperCase().toLowerCase().toUpperCase().toLowerCase());
        bu.append("abc").append(1).append(true).append(8.8).append('中');
        System.out.println(bu);//abc1true8.8中
    }
}
