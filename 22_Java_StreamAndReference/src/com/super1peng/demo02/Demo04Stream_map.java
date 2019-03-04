package com.super1peng.demo02;

import java.util.stream.Stream;

/**
 * @Author: super1peng
 * @Date: 2019/3/4 下午9:11
 * @Version 1.0
 */
public class Demo04Stream_map {

    /*
        Stream流中的常用方法_map:用于类型转换
        如果需要将流中的元素映射到另一个流中，可以使用map方法.
        <R> Stream<R> map(Function<? super T, ? extends R> mapper);
        该接口需要一个Function函数式接口参数，可以将当前流中的T类型数据转换为另一种R类型的流。
        Function中的抽象方法:
            R apply(T t);
     */

    public static void main(String[] args) {
        Stream<String> stream = Stream.of("1", "2", "3", "4");
        Stream<Integer> integerStream = stream.map((String s) -> {
            return Integer.parseInt(s);
        });
        integerStream.forEach(integer-> System.out.println(integer));
    }
}
