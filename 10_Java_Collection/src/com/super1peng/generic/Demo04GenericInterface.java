package com.super1peng.generic;

/**
 * @Author: super1peng
 * @Date: 2019/3/1 上午11:21
 * @Version 1.0
 */
public class Demo04GenericInterface {


    public static void main(String[] args) {
        GenericInterfaceImpl1 genericInterfaceImpl1 = new GenericInterfaceImpl1();
        genericInterfaceImpl1.method("字符串");

        GenericInterfaceImpl2<Integer> genericInterfaceImpl2 = new GenericInterfaceImpl2<>();
        genericInterfaceImpl2.method(10);

        GenericInterfaceImpl2<Double> gi3 = new GenericInterfaceImpl2<>();
        gi3.method(8.8);
    }
}
