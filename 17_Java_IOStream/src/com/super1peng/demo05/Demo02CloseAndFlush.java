package com.super1peng.demo05;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @Author: super1peng
 * @Date: 2019/3/3 下午4:59
 * @Version 1.0
 */
public class Demo02CloseAndFlush {

    /*
        flush方法和close方法的区别
            - flush ：刷新缓冲区，流对象可以继续使用。
            - close:  先刷新缓冲区，然后通知系统释放资源。流对象不可以再被使用了。
     */

    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("17_Java_IOStream/e.txt");
        fw.write(97);
        fw.write(98);
        fw.write(96);
        fw.flush();
        fw.close();

        //close方法之后流已经关闭了,已经从内存中消失了,流就不能再使用了
        fw.write(99);//IOException: Stream closed
    }
}
