package com.super1peng.demo02;

/**
 * @Author: super1peng
 * @Date: 2019/3/4 下午4:45
 * @Version 1.0
 */
public class Demo02Lambda {

    /*
        Lambda的特点：延迟加载
        Lambda的使用前提，必须存在函数式接口
     */
    public static void showLog(int level, MessageBuilder mb){

        if (level == 1){
            System.out.println(mb.builderMessage());
        }
    }

    public static void main(String[] args) {
        String msg1 = "Hello";
        String msg2 = "World";
        String msg3 = "Java";

        showLog(1, ()-> {
            System.out.println("不满足条件不执行");
            return msg1 + msg2 + msg3;
        });
    }
}
