package com.super1peng.demo07;

import java.util.function.Function;

/**
 * @Author: super1peng
 * @Date: 2019/3/4 下午8:43
 * @Version 1.0
 */
public class Demo03Test {

    /*
    练习：自定义函数模型拼接
    题目
    请使用Function进行函数模型的拼接，按照顺序需要执行的多个函数操作为：
        String str = "赵丽颖,20";

    分析:
    1. 将字符串截取数字年龄部分，得到字符串；
        Function<String,String> "赵丽颖,20"->"20"
    2. 将上一步的字符串转换成为int类型的数字；
        Function<String,Integer> "20"->20
    3. 将上一步的int数字累加100，得到结果int数字。
        Function<Integer,Integer> 20->120
 */

    /*
        定义一个方法：
            参数传递包含姓名和年龄的字符串
            参数在传递3个Function接口用于类型转换
     */
    public static int change(String s, Function<String, String> fun1, Function<String, Integer> fun2, Function<Integer, Integer> fun3){
        return fun1.andThen(fun2).andThen(fun3).apply(s);
    }

    public static void main(String[] args) {
        String str = "詹姆斯,33";
        int result = change(str, (String s1) -> {
            return s1.split(",")[1];
        }, (String s2) -> {
            return Integer.parseInt(s2);
        }, (Integer i) -> {
            return i + 100;
        });
        System.out.println(result);

        // 优化lambda
        int num = change(str, s -> s.split(",")[1], s -> Integer.parseInt(s), integer -> integer + 100);
        System.out.println(num);
    }
}
