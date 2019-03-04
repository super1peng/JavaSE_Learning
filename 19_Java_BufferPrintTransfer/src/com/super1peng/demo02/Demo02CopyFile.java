package com.super1peng.demo02;

import java.io.*;

/**
 * @Author: super1peng
 * @Date: 2019/3/4 上午10:51
 * @Version 1.0
 */
public class Demo02CopyFile {
    /*
        文件复制的步骤:
            1.创建字节缓冲输入流对象,构造方法中传递字节输入流
            2.创建字节缓冲输出流对象,构造方法中传递字节输出流
            3.使用字节缓冲输入流对象中的方法read,读取文件
            4.使用字节缓冲输出流中的方法write,把读取的数据写入到内部缓冲区中
            5.释放资源(会先把缓冲区中的数据,刷新到文件中)
     */

    public static void main(String[] args) throws IOException {
        long s = System.currentTimeMillis();
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("d.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("e.txt"));
        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = bis.read(bytes)) != -1){
            bos.write(bytes, 0 ,len);
        }
        bos.close();
        bis.close();
        long e = System.currentTimeMillis();
        System.out.println("复制文件共耗时:"+(e-s)+"毫秒");
    }
}
