package com.super1peng.reflect;

import com.super1peng.domain.Person;

import java.lang.reflect.Field;

/**
 * @Author: super1peng
 * @Date: 2019/3/5 下午3:26
 * @Version 1.0
 */
public class ReflectDemo2 {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        // 获取Person的Class对象
        Class<Person> personClass = Person.class;

        /*
            1. 获取成员变量们
                * Field[] getFields()
                * Field getField(String name)

                * Field[] getDeclaredFields()
                * Field getDeclaredField(String name)
         */

        // getFields()获取所有public修饰的成员变量
        Field[] fields = personClass.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }

        System.out.println("-----------------------");

        // Field getField(String name)
        Field a = personClass.getField("a");
        // 获取成员变量a
        System.out.println(a);
        // 得到变量a的值
        Person p = new Person();
        Object value = a.get(p);
        System.out.println(value);

        // 设置a的值
        a.set(p,"张三");
        System.out.println(p);

        System.out.println("-----------------------");

        //Field[] getDeclaredFields()：获取所有的成员变量，不考虑修饰符
        Field[] declaredFields = personClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }
        Field d = personClass.getDeclaredField("d");

        // 忽略访问权限修饰符的安全检查
        d.setAccessible(true); //
        Object value2 = d.get(p);
        System.out.println(value2);
    }
}
