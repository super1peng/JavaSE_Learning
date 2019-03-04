package com.super1peng.demo03;

import java.io.*;
import java.net.Socket;

/**
 * @Author: super1peng
 * @Date: 2019/3/4 下午2:11
 * @Version 1.0
 */
public class TCPClient {

    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("/Users/lxp/Pictures/Tuscany_Italy.jpg");
        Socket socket = new Socket("127.0.0.1", 8888);
        OutputStream outputStream = socket.getOutputStream();
        int len = 0;
        byte[] bytes = new byte[1024];
        while ((len = fis.read(bytes)) != -1){
            outputStream.write(bytes, 0, len);
        }
        socket.shutdownOutput();

        InputStream inputStream = socket.getInputStream();
        while ((len = inputStream.read(bytes)) != -1){
            System.out.println(new String(bytes, 0, len));
        }

        fis.close();
        socket.close();
    }
}
