package com.super1peng.demo05udp.screenbroadcast;

/**
 * @Author: super1peng
 * @Date: 2019/3/5 上午11:53
 * @Version 1.0
 */

/**
 *  切割屏幕的帧单元
 * @author lxp
 *
 */

public class FrameUnit {
    // 截屏的id
    private long frameId;

    // 切屏之后，frameUnit的个数
    private int unitCount;

    // 切屏之后，每个frameUnit的编号
    private int unitNo;

    // 数据的长度
    private int dataLen;

    // 数据,frameUnit 的内容
    private byte[] data;

    public long getFrameId() {
        return frameId;
    }

    public void setFrameId(long frameId) {
        this.frameId = frameId;
    }

    public int getUnitCount() {
        return unitCount;
    }

    public void setUnitCount(int unitCount) {
        this.unitCount = unitCount;
    }

    public int getUnitNo() {
        return unitNo;
    }

    public void setUnitNo(int unitNo) {
        this.unitNo = unitNo;
    }

    public int getDataLen() {
        return dataLen;
    }

    public void setDataLen(int dataLen) {
        this.dataLen = dataLen;
    }

    public byte[] getData() {
        return data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }

}
