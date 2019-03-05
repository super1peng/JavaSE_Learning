package com.super1peng.reflect;

import com.super1peng.domain.Person;
import com.super1peng.domain.Student;

/**
 * @Author: super1peng
 * @Date: 2019/3/5 下午1:53
 * @Version 1.0
 */
public class ReflectDemo1 {


    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> cls1 = Class.forName("com.super1peng.domain.Person");

        System.out.println(cls1);

        // 2. 类名.class
        Class<Person> cls2 = Person.class;
        System.out.println(cls2);

        // 3. 对象.getClass()
        Person p = new Person();
        Class cls3 = p.getClass();
        System.out.println(cls3);

        //== 比较三个对象
        System.out.println(cls1 == cls2);//true
        System.out.println(cls1 == cls3);//true


        Class c = Student.class;
        System.out.println(c == cls1);
    }
}
