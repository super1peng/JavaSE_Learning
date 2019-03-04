package com.super1peng.demo05;

import java.util.function.Consumer;

/**
 * @Author: super1peng
 * @Date: 2019/3/4 下午7:25
 * @Version 1.0
 */
public class Demo01Consumer {

    /*
    java.util.function.Consumer<T>接口则正好与Supplier接口相反，
        它不是生产一个数据，而是消费一个数据，其数据类型由泛型决定。
    Consumer接口中包含抽象方法void accept(T t)，意为消费一个指定泛型的数据。

    Consumer接口是一个消费类型接口，泛型执行什么类型，就可以使用accept方法消费什么类型的数据
    至于具体怎么消费（使用），需要自定义
     */

    public static void method(String name, Consumer<String> con){
        con.accept(name);
    }

    public static void main(String[] args) {
        // 调用method方法，传递字符串姓名，方法的另一个参数是Consumer接口，是一个函数式接口，所以可以传递Lambda表达式
        method("吴青峰",(String name) -> {
            // 将字符串进行反转输出
            String reName = new StringBuffer(name).reverse().toString();
            System.out.println(reName);
        });
    }
}
