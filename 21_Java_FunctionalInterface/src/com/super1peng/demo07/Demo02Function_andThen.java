package com.super1peng.demo07;

import java.util.function.Function;

/**
 * @Author: super1peng
 * @Date: 2019/3/4 下午8:39
 * @Version 1.0
 */
public class Demo02Function_andThen {
    /*
    Function接口中的默认方法andThen:用来进行组合操作

    需求:
        把String类型的"123",转换为Inteter类型,把转换后的结果加10
        把增加之后的Integer类型的数据,转换为String类型

    分析:
        转换了两次
        第一次是把String类型转换为了Integer类型
            所以我们可以使用Function<String,Integer> fun1
                Integer i = fun1.apply("123")+10;
        第二次是把Integer类型转换为String类型
            所以我们可以使用Function<Integer,String> fun2
                String s = fun2.apply(i);
        我们可以使用andThen方法,把两次转换组合在一起使用
            String s = fun1.andThen(fun2).apply("123");
            fun1先调用apply方法,把字符串转换为Integer
            fun2再调用apply方法,把Integer转换为字符串
 */

    public static void change(String s, Function<String, Integer> fun1, Function<Integer, String> fun2){
        String s1 = fun1.andThen(fun2).apply(s);
        System.out.println(s1);
    }

    public static void main(String[] args) {
        String s = "123";
        change(s, (String ss) -> {
            return Integer.parseInt(ss)+10;
        }, (Integer i) -> {
            return i+"";
        });

        // 优化Lambda表达式
        change(s, s1 -> Integer.parseInt(s1)+10, integer -> integer+"");
    }
}
