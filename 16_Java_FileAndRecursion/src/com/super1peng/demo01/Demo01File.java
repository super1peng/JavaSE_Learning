package com.super1peng.demo01;

import java.io.File;

/**
 * @Author: super1peng
 * @Date: 2019/3/3 下午2:49
 * @Version 1.0
 */
public class Demo01File {

    /*
            static String pathSeparator 与系统有关的路径分隔符，为了方便，它被表示为一个字符串。
            static char pathSeparatorChar 与系统有关的路径分隔符。

            static String separator 与系统有关的默认名称分隔符，为了方便，它被表示为一个字符串。
            static char separatorChar 与系统有关的默认名称分隔符。

            操作路径:路径不能写死了
            C:\develop\a\a.txt  windows
            C:/develop/a/a.txt  linux
            "C:"+File.separator+"develop"+File.separator+"a"+File.separator+"a.txt"
         */


    public static void main(String[] args) {
        String pathSeparator = File.pathSeparator;
        System.out.println(pathSeparator); // 路径分隔符 windows为分号，Linux为冒号

        String separator = File.separator;
        System.out.println(separator); // 文件名分隔符，windows为分号，Linux为正斜杠
    }
}
