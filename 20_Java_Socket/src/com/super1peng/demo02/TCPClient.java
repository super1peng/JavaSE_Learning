package com.super1peng.demo02;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @Author: super1peng
 * @Date: 2019/3/4 下午1:55
 * @Version 1.0
 */
public class TCPClient {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("/Users/lxp/Pictures/mirage.jpg");
        Socket socket = new Socket("127.0.0.1", 8888);
        OutputStream outputStream = socket.getOutputStream();
        int len = 0;
        byte[] bytes = new byte[1024];
        while ((len = fis.read(bytes)) != -1){
            outputStream.write(bytes, 0, len);
        }

        /*
            解决:上传完文件,给服务器写一个结束标记
            void shutdownOutput() 禁用此套接字的输出流。
            对于 TCP 套接字，任何以前写入的数据都将被发送，并且后跟 TCP 的正常连接终止序列。
         */
        socket.shutdownOutput();

        // 使用网络字节输入流读取服务器回写的数据
        InputStream inputStream = socket.getInputStream();
        while ((len = inputStream.read(bytes)) != -1 ){
            System.out.println(new String(bytes, 0 ,len));
        }

        // 释放资源
        socket.close();
        fis.close();
    }

}
