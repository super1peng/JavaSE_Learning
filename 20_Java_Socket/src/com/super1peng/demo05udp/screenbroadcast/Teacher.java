package com.super1peng.demo05udp.screenbroadcast;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: super1peng
 * @Date: 2019/3/5 下午12:50
 * @Version 1.0
 */
public class Teacher {

    private static DatagramSocket socket = null;

    static {
        try {
            socket = new DatagramSocket(9999);
        } catch (SocketException e) {
            e.printStackTrace();
        }
    }

    // 每个frameunit的最大值
    public final static int FRAME_UNIT_MAX = 60 * 1024;

    public static void main(String[] args) {
        while (true){
            sendOneScreenData();
        }
    }

    private static void sendOneScreenData(){
        // 截屏
        try {
            byte[] frame = Util.captureScreen();
            frame = Util.zipData(frame);

            // 切屏
            List<FrameUnit> units = splitFrame(frame);

            // 发送units
            sendUnits(units);
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    private static void sendUnits(List<FrameUnit> units){
        try{
            for (FrameUnit unit : units){
                byte[] bytes = new byte[unit.getDataLen() + 14];
                //frameid

                byte[] frameIdBytes = Util.long2Bytes(unit.getFrameId());
                System.arraycopy(frameIdBytes, 0, bytes, 0, 8);

                //unitCount
                bytes[8] = (byte)unit.getUnitCount();
                //unitNo
                bytes[9] = (byte)unit.getUnitNo();

                //dataLen
                byte[] dataLenBytes = Util.int2Bytes(unit.getDataLen());
                System.arraycopy(dataLenBytes, 0, bytes, 10, 4);

                //data
                System.arraycopy(unit.getData(), 0, bytes, 14, unit.getDataLen());

                //构造datagramePack
                DatagramPacket pack = new DatagramPacket(bytes, unit.getDataLen() + 14);
                pack.setSocketAddress(new InetSocketAddress("127.0.0.1", 8888));
                socket.send(pack);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }




    /**
     * 切割屏幕，形成FrameUnit集合
     */
    private static List<FrameUnit> splitFrame(byte[] frame){

        ArrayList<FrameUnit> unitList = new ArrayList<>();

        // 判断是否大于60k
        int count = 0;
        if (frame.length % FRAME_UNIT_MAX == 0){
            count = frame.length / FRAME_UNIT_MAX;
        }else {
            count = frame.length / FRAME_UNIT_MAX + 1;
        }

        FrameUnit unit = null;
        long frameID = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
             unit = new FrameUnit();
             unit.setFrameId(frameID);
             unit.setUnitCount(count);
             unit.setUnitNo(i);

             // 最后一个unit
            if (i==(count -1)){
                if (frame.length % FRAME_UNIT_MAX == 0){
                    unit.setDataLen(FRAME_UNIT_MAX);
                    byte[] unitData = new byte[FRAME_UNIT_MAX];
                    System.arraycopy(frame, i*FRAME_UNIT_MAX, unitData, 0, FRAME_UNIT_MAX);
                    unit.setData(unitData);
                }else {
                    unit.setDataLen(frame.length % FRAME_UNIT_MAX);
                    byte[] unitData = new byte[frame.length % FRAME_UNIT_MAX];
                    System.arraycopy(frame, i * FRAME_UNIT_MAX, unitData, 0, frame.length % FRAME_UNIT_MAX);
                    unit.setData(unitData);
                }
            }else {
                unit.setDataLen(FRAME_UNIT_MAX);
                byte[] unitData = new byte[FRAME_UNIT_MAX];
                System.arraycopy(frame, i * FRAME_UNIT_MAX, unitData, 0, FRAME_UNIT_MAX);
                unit.setData(unitData);
            }
            unitList.add(unit);
        }
        return unitList;
    }
}
