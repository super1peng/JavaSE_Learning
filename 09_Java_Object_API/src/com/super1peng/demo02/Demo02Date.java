package com.super1peng.demo02;

import java.util.Date;

/**
 * @Author: super1peng
 * @Date: 2019/2/27 下午8:37
 * @Version 1.0
 */
public class Demo02Date {
    public static void main(String[] args) {
        demo02();
    }

    public static void demo03(){
        Date date = new Date();
        long time = date.getTime();
        System.out.println(time);
    }

    public static void demo02(){
        Date date = new Date(0L);
        System.out.println(date);
        date = new Date(3742767540068L);
        System.out.println(date);
    }


    /*
        Date类的空参数构造方法
        Date() 获取当前系统的日期和时间
     */
    private static void demo01() {
        Date date = new Date();
        System.out.println(date);//Sun Aug 08 12:23:03 CST 2088
    }
}
