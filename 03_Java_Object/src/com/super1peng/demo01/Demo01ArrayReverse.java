package com.super1peng.demo01;

/**
 * @Author: super1peng
 * @Date: 2019/2/22 下午5:06
 * @Version 1.0
 */
public class Demo01ArrayReverse {

    /*
    数组反转
     */
    public static void main(String[] args) {

        int[] array = {10, 20, 30, 40, 50};

        // 遍历打印数组本来的样子
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        System.out.println("========================");

        for (int min = 0, max = array.length -1; min < max; min++, max--) {
            // 进行元素交换
            int temp = array[min];
            array[min] = array[max];
            array[max] = temp;
        }

        // 遍历打印数组本来的样子
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

}
