package com.super1peng.demo01;

/**
 * @Author: super1peng
 * @Date: 2019/2/23 下午4:12
 * @Version 1.0
 */


/*
字符串的特点：
1. 字符串的内容永不可变。【重点】
2. 正是因为字符串不可改变，所以字符串是可以共享使用的。
3. 字符串效果上相当于是char[]字符数组，但是底层原理是byte[]字节数组。

创建字符串的常见3+1种方法：
三种构造方法：
public String()：创建一个空白字符串，不含有任何内容。
public String(char[] array)：根据字符数组的内容，来创建对应的字符串。
public String(byte[] array)：根据字节数组的内容，来创建对应的字符串。
一种直接创建：
String str = "Hello"; // 右边直接用双引号
 */
public class Demo01String {

    public static void main(String[] args) {

        // 创建方式一
        String str1 = new String(); // 小括号留空，说明字符串什么内容都没有。
        System.out.println("第1个字符串：" + str1);

        // 创建方式二
        char[] charArray = {'A', 'B', 'C'};
        String str2 = new String(charArray);
        System.out.println("第2个字符串：" + str2);

        // 创建方式三
        byte[] byteArray = { 97, 98, 99 };
        String str3 = new String(byteArray);
        System.out.println("第3个字符串：" + str3);

        // 直接创建
        String str4 = "Hello";
        System.out.println("第4个字符串：" + str4);
    }

}
