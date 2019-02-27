package com.super1peng.demo01;

import java.util.ArrayList;

/**
 * @Author: super1peng
 * @Date: 2019/2/27 下午8:20
 * @Version 1.0
 */
public class Demo02Equals {

    public static void main(String[] args) {
        Person p1 = new Person("迪丽热巴", 18);
        Person p2 = new Person("迪丽热巴", 18);

        System.out.println("p1:"+p1);
        System.out.println("p2:"+p2);

        //p1=p2;//把p2的地址值赋值给p1
        ArrayList<String> list = new ArrayList<>();
        boolean b = p1.equals(p1);
        System.out.println(b);
    }

}
