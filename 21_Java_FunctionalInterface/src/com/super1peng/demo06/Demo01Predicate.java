package com.super1peng.demo06;

import java.util.function.Predicate;

/**
 * @Author: super1peng
 * @Date: 2019/3/4 下午7:39
 * @Version 1.0
 */
public class Demo01Predicate {

    /*
    java.util.function.Predicate<T>接口
    作用:对某种数据类型的数据进行判断,结果返回一个boolean值

    Predicate接口中包含一个抽象方法：
        boolean test(T t):用来对指定数据类型数据进行判断的方法
            结果:
                符合条件,返回true
                不符合条件,返回false
*/

    public static boolean checkString(String s, Predicate<String> pre){
        return pre.test(s);
    }

    public static void main(String[] args) {
        // 定义一个字符串
        String s = "abcdef";

        boolean b = checkString(s, (str) -> {
            return str.length() > 5;
        });
        System.out.println(b);

        boolean b1 = checkString(s, str -> str.length() > 5);
        System.out.println(b1);
    }
}
