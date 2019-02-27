package com.super1peng.demo02;

/**
 * @Author: super1peng
 * @Date: 2019/2/27 下午3:53
 * @Version 1.0
 */
public class Demo02Inner {

    public static void main(String[] args) {
        Body body = new Body();
        body.methodBody();
        System.out.println("=================");

        Body.Heart heart = new Body().new Heart();
        heart.beat();

    }
}
