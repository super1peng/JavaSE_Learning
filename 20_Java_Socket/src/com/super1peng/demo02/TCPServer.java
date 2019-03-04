package com.super1peng.demo02;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Author: super1peng
 * @Date: 2019/3/4 下午2:03
 * @Version 1.0
 */
public class TCPServer {

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8888);
        Socket socket = serverSocket.accept();

        InputStream inputStream = socket.getInputStream();

        File file = new File("20_Java_Socket");
        // 判断文件夹是否存在
        if (!file.exists()){
            file.mkdirs();
        }

        FileOutputStream fos = new FileOutputStream(file + "/ceshi.jpg");

        int len = 0;
        byte[] bytes = new byte[1024];
        while ((len = inputStream.read(bytes)) != -1){
            fos.write(bytes, 0, len);
        }

        socket.getOutputStream().write("上传成功".getBytes());

        // 释放资源
        socket.close();
        serverSocket.close();
        fos.close();
    }
}
