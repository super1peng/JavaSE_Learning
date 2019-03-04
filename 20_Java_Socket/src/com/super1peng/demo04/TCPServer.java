package com.super1peng.demo04;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Author: super1peng
 * @Date: 2019/3/4 下午2:53
 * @Version 1.0
 */
public class TCPServer {

    // 创建BS版本服务器


    public static void main(String[] args) throws IOException {
        // 创建一个服务器ServerSocket，和系统要指定的端口号
        ServerSocket server = new ServerSocket(8088);
        Socket socket = server.accept();
        InputStream inputStream = socket.getInputStream();

        // 把网络字节输入流对象，转换为字符流缓冲输入流
        BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));

        // 把客户端请求信息的狄航读取出来 GET /20_Java_Socket/web/index.html HTTP/1.1
        String line = br.readLine();
        String[] arr = line.split(" ");
        String htmlpath = arr[1].substring(1);
        System.out.println(htmlpath);

        // 创建一个本地字节输入流，构造方法中绑定要读取的html路径
        FileInputStream fis = new FileInputStream(htmlpath);
        OutputStream outputStream = socket.getOutputStream();

        // 写入HTTP协议响应头，固定写法
        outputStream.write("HTTP/1.1 200 OK\r\n".getBytes());
        outputStream.write("Content-Type:text/html\r\n".getBytes());

        // 必须写入空行，不然浏览器不解析
        outputStream.write("\r\n".getBytes());

        // 一读一写复制文件，把服务读取的html文件回写到客户端
        int len = 0;
        byte[] bytes = new byte[1024];
        while ((len = fis.read(bytes))!= -1){
            outputStream.write(bytes, 0, len);
        }
        fis.close();
        socket.close();
        server.close();
    }
}
