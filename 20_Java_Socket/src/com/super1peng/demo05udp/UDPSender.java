package com.super1peng.demo05udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.Inet4Address;
import java.net.InetSocketAddress;

/**
 * @Author: super1peng
 * @Date: 2019/3/5 上午11:34
 * @Version 1.0
 */
public class UDPSender {

    // 开放Sender的9999端口，用于发送数据
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket(9999);

        byte[] bytes = "Hello World".getBytes();
        DatagramPacket packet = new DatagramPacket(bytes, bytes.length);
        packet.setSocketAddress(new InetSocketAddress("127.0.0.1",8888));
        socket.send(packet);
    }
}
