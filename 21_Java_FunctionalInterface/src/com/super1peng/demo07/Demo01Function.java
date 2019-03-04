package com.super1peng.demo07;

import java.util.function.Function;

/**
 * @Author: super1peng
 * @Date: 2019/3/4 下午8:36
 * @Version 1.0
 */
public class Demo01Function {

    /*
    java.util.function.Function<T,R>接口用来根据一个类型的数据得到另一个类型的数据，
        前者称为前置条件，后者称为后置条件。
    Function接口中最主要的抽象方法为：R apply(T t)，根据类型T的参数获取类型R的结果。
        使用的场景例如：将String类型转换为Integer类型。
 */

    public static void change(String s, Function<String, Integer> fun){
        Integer in = fun.apply(s);
        System.out.println(in);
    }

    public static void main(String[] args) {
        String s = "1234";
        change(s, (String str)->{
            return Integer.parseInt(str);
        });

        // 优化Lambda
        change(s, s1 -> Integer.parseInt(s1));
    }
}
