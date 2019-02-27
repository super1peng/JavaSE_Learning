package com.super1peng.demo06;

import com.super1peng.red.RedPacketFrame;

/**
 * @Author: super1peng
 * @Date: 2019/2/27 下午4:10
 * @Version 1.0
 */
public class MyRed extends RedPacketFrame {
    /**
     * 构造方法：生成红包界面。
     *
     * @param title 界面的标题
     */
    public MyRed(String title) {
        super(title);
    }
}