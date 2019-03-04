package com.super1peng.demo04;

import java.util.function.Supplier;

/**
 * @Author: super1peng
 * @Date: 2019/3/4 下午5:00
 * @Version 1.0
 */
public class Demo02Test {

    /*
    练习：求数组元素最大值
        使用Supplier接口作为方法参数类型，通过Lambda表达式求出int数组中的最大值。
        提示：接口的泛型请使用java.lang.Integer类。
 */

    public static int getMax(Supplier<Integer> sup){
        return sup.get();
    }

    public static void main(String[] args) {
        int[] arr = {100, 0, -50, 880, 99, 33, -30};
        // 调用getMax方法，方法的参数Supplier是一个函数式接口，所以可以传递Lambda表达式
        int maxValue = getMax(() -> {
            int max = arr[0];
            for(int i : arr){
                if ( i > max){
                    max = i;
                }
            }
            return max;
        });
        System.out.println("数组中元素的最大值是："+ maxValue);
    }

}
