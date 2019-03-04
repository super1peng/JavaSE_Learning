package com.super1peng.demo06;

import java.util.function.Predicate;

/**
 * @Author: super1peng
 * @Date: 2019/3/4 下午7:47
 * @Version 1.0
 */
public class Demo03Predicate_or {

    /*
        定义一个方法，方法的参数，传递一个字符串
            传递两个Predicate接口
                一个用于判断字符串的长度是否大于5
                一个用于判断字符串是否包含a
                满足一个条件即可
     */

    public static boolean checkString(String str, Predicate<String> pre1, Predicate<String> pre2){
        return pre1.or(pre2).test(str);
    }

    public static void main(String[] args) {
        String s = "bc";
        boolean a = checkString(s, (String str) -> {
            return str.length() > 5;
        }, (String str) -> {
            return str.contains("a");
        });
        System.out.println(a);
    }
}

