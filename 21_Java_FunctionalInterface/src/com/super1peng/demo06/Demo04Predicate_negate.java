package com.super1peng.demo06;

import java.util.function.Predicate;

/**
 * @Author: super1peng
 * @Date: 2019/3/4 下午7:51
 * @Version 1.0
 */
public class Demo04Predicate_negate {
    /*

        定义一个方法，方法的参数，传递一个字符串
        使用Predicate接口判断字符串的长度是否大于5
     */
    public static boolean checkString(String s , Predicate<String> pre){
        return pre.negate().test(s);
    }

    public static void main(String[] args) {
        // 定义一个字符串
        String s = "abc";
        boolean b = checkString(s, (String str) -> {
            return str.length() > 5;
        });
        System.out.println(b);
    }
}
