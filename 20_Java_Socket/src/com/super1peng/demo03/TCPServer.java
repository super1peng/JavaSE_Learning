package com.super1peng.demo03;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

/**
 * @Author: super1peng
 * @Date: 2019/3/4 下午2:16
 * @Version 1.0
 */
public class TCPServer {

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8888);


        /*
            让服务器一直处于监听状态(死循环accept方法)
            有一个客户端上传文件,就保存一个文件
         */
        while (true){
            /*
            使用多线程技术，提高程序效率，有一个客户端上传文件，就开启一个线程，完成文件的上传
             */
            Socket socket = serverSocket.accept();

            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        InputStream inputStream = socket.getInputStream();
                        File file = new File("20_Java_Socket/Thread");
                        if(!file.exists()){
                            file.mkdirs();
                        }
                        // 自定义一个文件命名规则，防止同名的文件被覆盖
                        String fileName = "super1peng" + System.currentTimeMillis() + new Random().nextInt(999);
                        FileOutputStream fos = new FileOutputStream(file + "/" + fileName);

                        int len = 0;
                        byte[] bytes = new byte[1024];
                        while ((len = inputStream.read(bytes)) != -1){
                            fos.write(bytes, 0, len);
                        }

                        socket.getOutputStream().write("上传成功".getBytes());

                        // 释放资源
                        socket.close();

                        fos.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        }

        // 服务器不用关闭
        // serverSocket.close();
    }
}
