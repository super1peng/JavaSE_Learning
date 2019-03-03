package com.super1peng.demo04;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @Author: super1peng
 * @Date: 2019/3/3 下午4:49
 * @Version 1.0
 */
public class Demo01InputStream {

    /*
        使用字节流读取中文文件
        1个中文：
            GBK：占用2个字节
            UTF8：占用3个字节
     */

    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("17_Java_IOStream/c.txt");
        int len = 0;
        while ((len = fis.read()) != -1){
            System.out.println((char) len);
        }
        fis.close();
    }
}
