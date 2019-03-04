package com.super1peng.demo04;

import java.util.function.Supplier;

/**
 * @Author: super1peng
 * @Date: 2019/3/4 下午4:58
 * @Version 1.0
 */
public class Demo01Supplier {

    /*
    常用的函数式接口
    java.util.function.Supplier<T>接口仅包含一个无参的方法：T get()。用来获取一个泛型参数指定类型的对象数据。

    Supplier<T>接口被称之为生产型接口,指定接口的泛型是什么类型,那么接口中的get方法就会生产什么类型的数据
 */
    public static String getString(Supplier<String> sup){
        return sup.get();
    }

    public static void main(String[] args) {
        String s = getString(()->{
            return "胡歌";
        });
        System.out.println(s);

        //优化Lambda表达式
        String s2 = getString(()->"胡歌");
        System.out.println(s2);
    }
}
