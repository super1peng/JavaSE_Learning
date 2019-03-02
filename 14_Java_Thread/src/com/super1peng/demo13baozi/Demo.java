package com.super1peng.demo13baozi;

/**
 * @Author: super1peng
 * @Date: 2019/3/2 下午5:48
 * @Version 1.0
 */
public class Demo {

    public static void main(String[] args) {
        BaoZi bz = new BaoZi();
        new BaoZiPu(bz).start();
        new ChiHuo(bz).start();
    }
}
