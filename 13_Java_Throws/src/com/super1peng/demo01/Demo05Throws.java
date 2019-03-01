package com.super1peng.demo01;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @Author: super1peng
 * @Date: 2019/3/1 下午4:44
 * @Version 1.0
 */
public class Demo05Throws {

    /*
    throws关键字:异常处理的第一种方式,交给别人处理
    作用:
        当方法内部抛出异常对象的时候,那么我们就必须处理这个异常对象
        可以使用throws关键字处理异常对象,会把异常对象声明抛出给方法的调用者处理(自己不处理,给别人处理),最终交给JVM处理-->中断处理
    使用格式:在方法声明时使用
        修饰符 返回值类型 方法名(参数列表) throws AAAExcepiton,BBBExcepiton...{
            throw new AAAExcepiton("产生原因");
            throw new BBBExcepiton("产生原因");
            ...
        }
     注意:
        1.throws关键字必须写在方法声明处
        2.throws关键字后边声明的异常必须是Exception或者是Exception的子类
        3.方法内部如果抛出了多个异常对象,那么throws后边必须也声明多个异常
            如果抛出的多个异常对象有子父类关系,那么直接声明父类异常即可
        4.调用了一个声明抛出异常的方法,我们就必须的处理声明的异常
            要么继续使用throws声明抛出,交给方法的调用者处理,最终交给JVM
            要么try...catch自己处理异常
 */


    public static void main(String[] args) throws IOException {
        readFile("a.txt");
        System.out.println("后续代码");
    }

    public static void readFile(String filename) throws FileNotFoundException, IOException {
        if (!filename.equals("a.txt")){
            throw new FileNotFoundException("传递的文件不是 a.txt");
        }
        if (!filename.endsWith(".txt")){
            throw new IOException("文件名的后缀名不对");
        }
        System.out.println("路径没有问题,读取文件");
    }
}
