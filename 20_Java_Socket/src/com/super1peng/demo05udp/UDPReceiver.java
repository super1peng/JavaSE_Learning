package com.super1peng.demo05udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * @Author: super1peng
 * @Date: 2019/3/5 上午11:29
 * @Version 1.0
 */
public class UDPReceiver {

    public static void main(String[] args) throws IOException {
        //  向系统所要并绑定8888端口
        DatagramSocket socket = new DatagramSocket(8888);

        // 在接收前，先构建接收容器
        byte[] bytes = new byte[1024];

        DatagramPacket pack = new DatagramPacket(bytes, bytes.length);
        // 接收数据
        socket.receive(pack);
        int length = pack.getLength();
        System.out.println(new String(bytes, 0, length));
    }
}
