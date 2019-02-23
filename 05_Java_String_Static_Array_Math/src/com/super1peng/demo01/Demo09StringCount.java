package com.super1peng.demo01;

import java.util.Scanner;


/**
 * @Author: super1peng
 * @Date: 2019/2/23 下午4:35
 * @Version 1.0
 */
public class Demo09StringCount {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String input = sc.next(); // 获取键盘输入的一个字符串

        int countUpper = 0; // 大写字母
        int countLower = 0; // 小写字母
        int countNumber = 0; // 数字
        int countOther = 0; // 其他字符

        char[] charArray = input.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char ch = charArray[i]; // 当前单个字符
            if ('A' <= ch && ch <= 'Z') {
                countUpper++;
            } else if ('a' <= ch && ch <= 'z') {
                countLower++;
            } else if ('0' <= ch && ch <= '9') {
                countNumber++;
            } else {
                countOther++;
            }
        }

        System.out.println("大写字母有：" + countUpper);
        System.out.println("小写字母有：" + countLower);
        System.out.println("数字有：" + countNumber);
        System.out.println("其他字符有：" + countOther);
    }
}
