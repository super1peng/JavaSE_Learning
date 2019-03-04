package com.super1peng.demo02;

import java.util.stream.Stream;

/**
 * @Author: super1peng
 * @Date: 2019/3/4 下午9:05
 * @Version 1.0
 */
public class Demo02Stream_forEach {
    /*
    Stream流中的常用方法_forEach
    void forEach(Consumer<? super T> action);
    该方法接收一个Consumer接口函数，会将每一个流元素交给该函数进行处理。
    Consumer接口是一个消费型的函数式接口,可以传递Lambda表达式,消费数据

    简单记:
        forEach方法,用来遍历流中的数据
        是一个终结方法,遍历之后就不能继续调用Stream流中的其他方法
 */

    public static void main(String[] args) {
        Stream<String> stream = Stream.of("张三", "李四", "王五", "赵六", "田七");
        stream.forEach(name -> System.out.println(name));
    }
}
