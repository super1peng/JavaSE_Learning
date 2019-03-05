package com.super1peng.reflect;

import com.super1peng.domain.Person;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @Author: super1peng
 * @Date: 2019/3/5 下午3:38
 * @Version 1.0
 */
public class ReflectDemo4 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class<Person> personClass = Person.class;
        Method eat_method = personClass.getMethod("eat");

        Person person = new Person();

        // 执行方法
        eat_method.invoke(person);

        Method eat_method2 = personClass.getMethod("eat", String.class);
        eat_method2.invoke(person,"饭");

        System.out.println("----------------------");

        // 获取所有public修饰符的方法
        Method[] methods = personClass.getMethods();
        for (Method method : methods) {
            System.out.println(method);
            String name = method.getName();
            System.out.println(name);
        }

        // 获取类名
        String className = personClass.getName();
        System.out.println(className);

    }
}
