package com.super1peng.demo05;

/**
 * @Author: super1peng
 * @Date: 2019/3/4 下午9:29
 * @Version 1.0
 */
public class Demo01ObjectMethodReference {

    /*
    通过对象名引用成员方法
    使用前提是对象名是已经存在的,成员方法也是已经存在
    就可以使用对象名来引用成员方法
 */

    // 定义一个方法，方法的参数传递Printable接口
    public static void printString(Printable p){
        p.print("Hello");
    }

    public static void main(String[] args) {
        printString((String s) -> {
            MethodRerObject methodRerObject = new MethodRerObject();
            methodRerObject.printUpperCaseString(s);
        });

        /*
            使用方法引用优化Lambda
            对象是已经存在的MethodRerObject
            成员方法也是已经存在的printUpperCaseString
            所以我们可以使用对象名引用成员方法
         */
        MethodRerObject object = new MethodRerObject();
        printString(object::printUpperCaseString);
    }
}
