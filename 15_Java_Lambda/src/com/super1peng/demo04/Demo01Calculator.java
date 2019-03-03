package com.super1peng.demo04;

/**
 * @Author: super1peng
 * @Date: 2019/3/3 下午2:40
 * @Version 1.0
 */
public class Demo01Calculator {
    /*
    Lambda变大时有参数有返回值练习
    需求:
        给定一个计算器Calculator接口，内含抽象方法calc可以将两个int数字相加得到和值
        使用Lambda的标准格式调用invokeCalc方法，完成120和130的相加计算
     */
    public static void main(String[] args) {
        invokeCalc(10, 20, new Calculator() {
            @Override
            public int calc(int a, int b) {
                return a+b;
            }
        });

        invokeCalc(10, 20, (int a, int b ) -> {
            return a + b;
        });

        invokeCalc(10, 20, (a, b) -> a + b);
    }

    public static void invokeCalc(int a, int b, Calculator c){
        int sum = c.calc(a, b);
        System.out.println(sum);
    }
}


/*
    Lambda表达式:是可推导,可以省略
    凡是根据上下文推导出来的内容,都可以省略书写
    可以省略的内容:
        1.(参数列表):括号中参数列表的数据类型,可以省略不写
        2.(参数列表):括号中的参数如果只有一个,那么类型和()都可以省略
        3.{一些代码}:如果{}中的代码只有一行,无论是否有返回值,都可以省略({},return,分号)
            注意:要省略{},return,分号必须一起省略
 */