package com.super1peng.List;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @Author: super1peng
 * @Date: 2019/3/1 上午11:59
 * @Version 1.0
 */
public class Demo01List {

    public static void main(String[] args) {

        // 创建一个List集合对象，多态
        ArrayList<String> list = new ArrayList<>();
        // 使用add方法往集合中添加元素
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("a");
        System.out.println(list); // 重写了 toString


        //public void add(int index, E element): 将指定的元素，添加到该集合中的指定位置上。
        //在c和d之间添加一个itheima
        list.add(3,"itheima");//[a, b, c, itheima, d, a]
        System.out.println(list);

        //public E remove(int index): 移除列表中指定位置的元素, 返回的是被移除的元素。
        //移除元素
        String removeE = list.remove(2);
        System.out.println("被移除的元素:"+removeE);//被移除的元素:c
        System.out.println(list);//[a, b, itheima, d, a]

        //public E set(int index, E element):用指定元素替换集合中指定位置的元素,返回值的更新前的元素。
        //把最后一个a,替换为A
        String setE = list.set(4, "A");
        System.out.println("被替换的元素:"+setE);//被替换的元素:a
        System.out.println(list);//[a, b, itheima, d, A]

        // list集合遍历有3中方式
        for (int i = 0; i < list.size(); i++){
            String s = list.get(i);
            System.out.println(s);
        }
        System.out.println("========================");

        // 使用迭代器
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            String next = iterator.next();
            System.out.println(next);
        }

        // 使用增强for
        for (String s: list){
            System.out.println(s);
        }
    }
}
