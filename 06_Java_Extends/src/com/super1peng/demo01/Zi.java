package com.super1peng.demo01;

/**
 * @Author: super1peng
 * @Date: 2019/2/23 下午9:34
 * @Version 1.0
 */
public class Zi extends Fu {

    int numZi = 20;

    int num = 200;

    public void methodZi() {
        // 因为本类当中有num，所以这里用的是本类的num
        System.out.println(num);
    }

}
