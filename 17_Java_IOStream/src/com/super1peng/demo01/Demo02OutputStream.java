package com.super1peng.demo01;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

/**
 * @Author: super1peng
 * @Date: 2019/3/3 下午4:12
 * @Version 1.0
 */
public class Demo02OutputStream {
    /*
        一次写多个字节的方法:
            - public void write(byte[] b)：将 b.length字节从指定的字节数组写入此输出流。
            - public void write(byte[] b, int off, int len) ：从指定的字节数组写入 len字节，从偏移量 off开始输出到此输出流。
     */

    public static void main(String[] args) throws IOException {

        // 创建FileOutputStream对象，构造方法中绑定要写入数据的目的地
        FileOutputStream fos = new FileOutputStream(new File("17_Java_IOStream/b.txt"));
        fos.write(49);
        fos.write(48);
        fos.write(48);

        byte[] bytes = {65, 66, 67, 68, 69};
        fos.write(bytes);
        fos.write(bytes, 1, 2);

        byte[] bytes2 = "你好".getBytes();
        System.out.println(Arrays.toString(bytes2));
        fos.write(bytes2);

        // 释放资源
        fos.close();
    }
}
