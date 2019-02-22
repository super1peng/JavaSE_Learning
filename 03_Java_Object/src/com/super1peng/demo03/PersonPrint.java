package com.super1peng.demo03;

/**
 * @Author: super1peng
 * @Date: 2019/2/22 下午5:39
 * @Version 1.0
 */
public class PersonPrint {
    public static void main(String[] args) {
        Student stu = new Student();

        stu.setName("鹿晗");
        stu.setAge(20);
        stu.setMale(true);

        System.out.println("姓名：" + stu.getName());
        System.out.println("年龄：" + stu.getAge());
        System.out.println("是不是爷们儿：" + stu.isMale());

    }
}
