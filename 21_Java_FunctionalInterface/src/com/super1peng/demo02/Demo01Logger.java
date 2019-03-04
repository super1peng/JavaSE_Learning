package com.super1peng.demo02;

/**
 * @Author: super1peng
 * @Date: 2019/3/4 下午4:43
 * @Version 1.0
 */
public class Demo01Logger {

    // 定义一个根据日志级别，显示日志信息的方法
    public static void showLog(int level, String message){
        if (level == 1){
            System.out.println(message);
        }
    }

    public static void main(String[] args) {
        String msg1 = "Hello";
        String msg2 = "World";
        String msg3 = "Java";

        //调用showLog方法,传递日志级别和日志信息
        showLog(2,msg1+msg2+msg3);
    }
}
