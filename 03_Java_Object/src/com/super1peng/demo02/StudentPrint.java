package com.super1peng.demo02;

import java.util.Arrays;

/**
 * @Author: super1peng
 * @Date: 2019/2/22 下午5:27
 * @Version 1.0
 */
public class StudentPrint {
    /*
    面向过程：当需要实现一个功能的时候，每一个具体的步骤都要亲力亲为，详细处理每一个细节。
    面向对象：当需要实现一个功能的时候，不关心具体的步骤，而是找一个已经具有该功能的人，来帮我做事儿。
     */


    public static void main(String[] args) {
        int[] array = { 10, 20, 30, 40, 50, 60 };

        // 要求打印格式为：[10, 20, 30, 40, 50]
        // 使用面向过程，每一个步骤细节都要亲力亲为。
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) { // 如果是最后一个元素
                System.out.println(array[i] + "]");
            } else { // 如果不是最后一个元素
                System.out.print(array[i] + ", ");
            }
        }
        System.out.println("==============");


        // 使用面向对象
        // 找到一个JDK中给我们提供好的类
        // 其中有一个toString方法
        System.out.println(Arrays.toString(array));
    }

}
