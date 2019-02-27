package com.super1peng.demo03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author: super1peng
 * @Date: 2019/2/27 下午8:42
 * @Version 1.0
 */
public class Demo01DateFormat {

    public static void main(String[] args) throws ParseException {

        demo01();
        demo02();
    }


    private static void demo01(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        Date date = new Date();
        String format = sdf.format(date);
        System.out.println(format);
        System.out.println(date);
    }

    private static void demo02() throws ParseException {
        //1.创建SimpleDateFormat对象,构造方法中传递指定的模式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        //2.调用SimpleDateFormat对象中的方法parse,把符合构造方法中模式的字符串,解析为Date日期
        Date date = sdf.parse("2088年08月08日 15时51分54秒");
        System.out.println(date);
    }

}
