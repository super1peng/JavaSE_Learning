package com.super1peng.demo01;

import java.util.ArrayList;

/**
 * @Author: super1peng
 * @Date: 2019/3/4 下午8:55
 * @Version 1.0
 */
public class Demo02Stream {
    /*
        使用Stream流的方式，遍历集合，对集合中的数据进行过滤
        Stream流是JDK1.8之后出现的
        关注的是做什么，而不是怎么做
     */

    public static void main(String[] args) {
        // 创建一个集合
        ArrayList<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张强");
        list.add("张三丰");

        // 1. 对list集合中的元素进行过滤 以张开头
        // 2. 对list集合进行过滤， 姓名长度为3
        // 3. 遍历集合
        list.stream().
                filter(name->name.startsWith("张"))
                .filter(name->name.length() == 3)
                .forEach(name-> System.out.println(name));
    }
}
