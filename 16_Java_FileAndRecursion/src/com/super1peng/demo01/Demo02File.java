package com.super1peng.demo01;

import java.io.File;

/**
 * @Author: super1peng
 * @Date: 2019/3/3 下午2:52
 * @Version 1.0
 */
public class Demo02File {

    public static void main(String[] args) {
        show01();

        show03();

        File f = new File("C:\\Users\\itcast\\IdeaProjects\\shungyuan");
        long length = f.length();
        System.out.println(length);
    }

    /*
        File(String pathname) 通过将给定路径名字符串转换为抽象路径名来创建一个新 File 实例。
        参数:
            String pathname:字符串的路径名称
            路径可以是以文件结尾,也可以是以文件夹结尾
            路径可以是相对路径,也可以是绝对路径
            路径可以是存在,也可以是不存在
            创建File对象,只是把字符串路径封装为File对象,不考虑路径的真假情况
     */
    private static void show01(){

        File f1 = new File("/User/lxp/JavaSE_Learning/16_Java_FileAndRecursion/a.txt");
        System.out.println(f1);

        File f2 = new File("/User/lxp/JavaSE_Learning/16_Java_FileAndRecursion");
        System.out.println(f2);

        File f3 = new File("b.txt");
        System.out.println(f3);
    }

    private static void show03() {
        File parent = new File("c:\\");
        File file = new File(parent,"hello.java");
        System.out.println(file);//c:\hello.java
    }

    /*
        File(String parent, String child) 根据 parent 路径名字符串和 child 路径名字符串创建一个新 File 实例。
        参数:把路径分成了两部分
            String parent:父路径
            String child:子路径
        好处:
            父路径和子路径,可以单独书写,使用起来非常灵活;父路径和子路径都可以变化
     */
    private static void show02(String parent, String child) {
        File file = new File(parent,child);
        System.out.println(file);//c:\a.txt
    }
}
