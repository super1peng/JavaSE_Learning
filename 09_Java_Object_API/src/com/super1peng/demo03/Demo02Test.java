package com.super1peng.demo03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @Author: super1peng
 * @Date: 2019/2/27 下午8:48
 * @Version 1.0
 */
public class Demo02Test {

    public static void main(String[] args) throws ParseException {

        //1.使用Scanner类中的方法next,获取出生日期
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入您的出生日期,格式:yyyy-MM-dd");
        String birthdayDateString = scanner.next();
        //2.使用DateFormat类中的方法parse,把字符串的出生日期,解析为Date格式的出生日期
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date birthdayDate = sdf.parse(birthdayDateString);
        //3.把Date格式的出生日期转换为毫秒值
        long birthdayDateTime = birthdayDate.getTime();
        //4.获取当前的日期,转换为毫秒值
        long todayTime = new Date().getTime();
        //5.使用当前日期的毫秒值-出生日期的毫秒值
        long time = todayTime-birthdayDateTime;
        //6.把毫秒差值转换为天(s/1000/60/60/24)
        System.out.println(time/1000/60/60/24);
    }
}
