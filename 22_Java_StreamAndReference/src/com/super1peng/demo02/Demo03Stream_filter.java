package com.super1peng.demo02;

import java.util.stream.Stream;

/**
 * @Author: super1peng
 * @Date: 2019/3/4 下午9:06
 * @Version 1.0
 */
public class Demo03Stream_filter {

    /*
    Stream流中的常用方法_filter:用于对Stream流中的数据进行过滤
    Stream<T> filter(Predicate<? super T> predicate);
    filter方法的参数Predicate是一个函数式接口,所以可以传递Lambda表达式,对数据进行过滤
    Predicate中的抽象方法:
        boolean test(T t);
 */

    public static void main(String[] args) {
        Stream<String> stream = Stream.of("张三丰", "张翠山", "赵敏", "周芷若", "张无忌");
        Stream<String> stream1 = stream.filter((String name) -> {
            return name.startsWith("张");
        });
        stream.forEach(name->System.out.println(name));
    }
}
