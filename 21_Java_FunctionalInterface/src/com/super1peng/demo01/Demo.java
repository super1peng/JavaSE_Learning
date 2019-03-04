package com.super1peng.demo01;

/**
 * @Author: super1peng
 * @Date: 2019/3/4 下午4:38
 * @Version 1.0
 */
public class Demo {


    // 定义一个方法，参数使用函数式接口MyFunctionalInterface
    public static void show(MyFunctionalInterface myInter){
        myInter.method();
    }


    public static void main(String[] args) {
        show(new MyFunctionalInterface() {
            @Override
            public void method() {
                System.out.println("使用匿名内部类重写接口中的抽象方法");
            }
        });

        show(() -> {
            System.out.println("使用Lambda表达式重写接口中的抽象方法");
        });

        show(() -> System.out.println("使用Lambda优化表达式重写接口中的方法"));
    }
}
