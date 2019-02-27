package com.super1peng.demo06;

import com.super1peng.red.OpenMode;

/**
 * @Author: super1peng
 * @Date: 2019/2/27 下午4:11
 * @Version 1.0
 */
public class Bootstrap {
    public static void main(String[] args) {
        MyRed red = new MyRed("红包");

        red.setOwnerName("super1peng");


        // 普通红包
//        OpenMode normal = new NormalMode();
//        red.setOpenWay(normal);

        // 随机红包
        OpenMode randomMode = new RandomMode();
        red.setOpenWay(randomMode);
    }
}
