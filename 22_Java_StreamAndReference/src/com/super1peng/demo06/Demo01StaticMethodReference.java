package com.super1peng.demo06;

/**
 * @Author: super1peng
 * @Date: 2019/3/4 下午9:33
 * @Version 1.0
 */
public class Demo01StaticMethodReference {

    public static int method(int number, Calcable c){
        return c.calsAbs(number);
    }

    public static void main(String[] args) {
        int num = method(-10, (int i) -> {
            return Math.abs(i);
        });

        System.out.println(num);

        int res = method(-30,Math::abs);
        System.out.println(res);
    }
}
