package com.super1peng.demo02;

import java.util.*;
import java.util.stream.Stream;

/**
 * @Author: super1peng
 * @Date: 2019/3/4 下午8:59
 * @Version 1.0
 */
public class Demo01GetStream {
    /*
    java.util.stream.Stream<T>是Java 8新加入的最常用的流接口。（这并不是一个函数式接口。）
    获取一个流非常简单，有以下几种常用的方式：
        - 所有的Collection集合都可以通过stream默认方法获取流；
            default Stream<E> stream​()
        - Stream接口的静态方法of可以获取数组对应的流。
            static <T> Stream<T> of​(T... values)
            参数是一个可变参数,那么我们就可以传递一个数组
 */

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Stream<String> stream1 = list.stream();

        HashSet<String> hashSet = new HashSet<>();
        Stream<String> stream2 = hashSet.stream();

        HashMap<String, String> hashMap = new HashMap<>();
        Stream<String> stream3 = hashMap.keySet().stream();
        Stream<String> stream4 = hashMap.values().stream();

        Set<Map.Entry<String, String>> entrySet = hashMap.entrySet();
        Stream<Map.Entry<String, String>> stream5 = entrySet.stream();


        // 把数组转换成Stream
        Stream<Integer> stream6 = Stream.of(1, 2, 3, 4, 5);

        // 可变参数可以传递数组
        Integer[] arr = {1,2,3,4};
        Stream<Integer> stream7 = Stream.of(arr);

        String[] arr2 = {"a","bb","ccc"};
        Stream<String> stream8 = Stream.of(arr2);
    }
}
