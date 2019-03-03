package com.super1peng.demo05;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @Author: super1peng
 * @Date: 2019/3/3 下午5:02
 * @Version 1.0
 */
public class Demo03Writer {

    /*
    字符输出流写数据的其他方法
        - void write(char[] cbuf)写入字符数组。
        - abstract  void write(char[] cbuf, int off, int len)写入字符数组的某一部分,off数组的开始索引,len写的字符个数。
        - void write(String str)写入字符串。
        - void write(String str, int off, int len) 写入字符串的某一部分,off字符串的开始索引,len写的字符个数。
 */
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("17_Java_IOStream/d.txt");
        char[] cs = {'a','b','c','d','e'};

        fw.write(cs);
        fw.write(cs, 1, 3);
        fw.write("测试");
        fw.write("南京邮电大学",2, 3);
        fw.close();
    }

}
