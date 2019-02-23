package com.super1peng.demo01;

/**
 * @Author: super1peng
 * @Date: 2019/2/23 下午4:33
 * @Version 1.0
 */
public class Demo07StringSplit {

    public static void main(String[] args) {
        String str1 = "aaa,bbb,ccc";
        String[] array1 = str1.split(",");
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }
        System.out.println("===============");

        String str2 = "aaa bbb ccc";
        String[] array2 = str2.split(" ");
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }
        System.out.println("===============");

        String str3 = "XXX.YYY.ZZZ";
        String[] array3 = str3.split("\\.");
        System.out.println(array3.length); // 0
        for (int i = 0; i < array3.length; i++) {
            System.out.println(array3[i]);
        }
    }
}
