package com.super1peng.demo03;

import java.util.Arrays;

/**
 * @Author: super1peng
 * @Date: 2019/3/3 下午1:49
 * @Version 1.0
 */
public class Demo01Arrays {

    /*
    Lambda表达式有参数有返回值的练习
    需求:
        使用数组存储多个Person对象
        对数组中的Person对象使用Arrays的sort方法通过年龄进行升序排序
 */

    public static void main(String[] args) {
        //使用数组存储多个Person对象
        Person[] arr = {
                new Person("柳岩",38),
                new Person("迪丽热巴",18),
                new Person("古力娜扎",19)
        };

        Arrays.sort(arr, (Person o1, Person o2) -> {
            return o1.getAge() - o2.getAge();
        });

        //优化省略Lambda
        Arrays.sort(arr,(o1, o2)->o1.getAge()-o2.getAge());

        //遍历数组
        for (Person p : arr) {
            System.out.println(p);
        }
    }
}
