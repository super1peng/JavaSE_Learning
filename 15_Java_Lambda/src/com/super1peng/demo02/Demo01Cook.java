package com.super1peng.demo02;

/**
 * @Author: super1peng
 * @Date: 2019/3/3 下午1:40
 * @Version 1.0
 */
public class Demo01Cook {

    public static void main(String[] args) {
        // 调用invokeCook方法，参数是Cook 方法，传递Cook接口的匿名内部类对象
        invokeCook(new Cook() {
            @Override
            public void makeFood() {
                System.out.println("吃饭了");
            }
        });

        // 使用Lambda表达式
        invokeCook(() -> {
            System.out.println("吃饭了");
        });
        invokeCook(() -> System.out.println("吃饭啦"));
    }

    //定义一个方法,参数传递Cook接口,方法内部调用Cook接口中的方法makeFood
    public static void invokeCook(Cook cook){
        cook.makeFood();
    }
}
