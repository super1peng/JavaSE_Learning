package com.super1peng.demo03;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @Author: super1peng
 * @Date: 2019/3/4 下午4:53
 * @Version 1.0
 */
public class Demo02Comparator {

    /*
    如果一个方法的返回值类型是一个函数式接口，那么就可以直接返回一个Lambda表达式。
    当需要通过一个方法来获取一个java.util.Comparator接口类型的对象作为排序器时,就可以调该方法获取。
 */

    //定义一个方法，方法的返回值类型使用函数式接口Comparator
    public static Comparator<String> getComparator(){
        return (o1, o2) -> o2.length()-o1.length();
    }

    public static void main(String[] args) {
        //创建一个字符串数组
        String[] arr = {"aaa","b","cccccc","dddddddddddd"};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr, getComparator());
        System.out.println(Arrays.toString((arr)));
    }
}
