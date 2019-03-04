package com.super1peng.demo04;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Author: super1peng
 * @Date: 2019/3/4 下午3:13
 * @Version 1.0
 */
public class TCPServerThread {

    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(8888);

        while (true){
            Socket socket = server.accept();
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        InputStream inputStream = socket.getInputStream();
                        BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
                        String line = br.readLine();
                        String[] arr = line.split(" ");
                        String htmlpath = arr[1].substring(1);

                        FileInputStream fis = new FileInputStream(htmlpath);
                        OutputStream outputStream = socket.getOutputStream();

                        // 写入HTTP协议响应头,固定写法
                        outputStream.write("HTTP/1.1 200 OK\r\n".getBytes());
                        outputStream.write("Content-Type:text/html\r\n".getBytes());
                        // 必须要写入空行,否则浏览器不解析
                        outputStream.write("\r\n".getBytes());

                        int len = 0;
                        byte[] bytes = new byte[1024];
                        while ((len = fis.read(bytes)) != -1){
                            outputStream.write(bytes, 0, len);
                        }
                        // 释放资源
                        fis.close();
                        socket.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        }
    }
}
