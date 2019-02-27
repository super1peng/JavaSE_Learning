package com.super1peng.demo01;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * @Author: super1peng
 * @Date: 2019/2/27 下午7:58
 * @Version 1.0
 */
public class Demo01ToString {

    public static void main(String[] args) {
        /*
            Person类默认继承了Object类,所以可以使用Object类中的toString方法
            String toString() 返回该对象的字符串表示。
         */

        Person p = new Person("张三", 18);
        String s = p.toString();
        System.out.println(s);
        System.out.println(p);

        //看一个类是否重写了toString,直接打印这个类的对象即可,如果没有重写toString方法那么打印的是对象的地址值
        Random random = new Random();
        System.out.println(random);

        Scanner sc = new Scanner(System.in);
        System.out.println(sc);


        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);
    }
}
