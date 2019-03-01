package com.super1peng.generic;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @Author: super1peng
 * @Date: 2019/3/1 上午11:23
 * @Version 1.0
 */
public class Demo05Generic {

    /*
    泛型的通配符:
        ?:代表任意的数据类型
    使用方式:
        不能创建对象使用
        只能作为方法的参数使用
 */


    public static void main(String[] args) {
        ArrayList<Integer> list01 = new ArrayList<>();
        list01.add(1);
        list01.add(2);


        ArrayList<String> list02 = new ArrayList<>();
        list02.add("a");
        list02.add("b");

        printArray(list01);
        printArray(list02);

    }

    /*
        定义一个方法,能遍历所有类型的ArrayList集合
        这时候我们不知道ArrayList集合使用什么数据类型,可以泛型的通配符?来接收数据类型
        注意:
            泛型没有继承概念的
     */

    public static void printArray(ArrayList<?> list){

        Iterator<?> iterator = list.iterator();
        while (iterator.hasNext()){
            Object next = iterator.next();
            System.out.println(next);
        }
    }
}
