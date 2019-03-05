package com.super1peng.reflect;

import com.super1peng.domain.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @Author: super1peng
 * @Date: 2019/3/5 下午3:35
 * @Version 1.0
 */
public class ReflectDemo3 {

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<Person> personClass = Person.class;

        Constructor<Person> constructor = personClass.getConstructor(String.class, int.class);
        System.out.println(constructor);

        // 创建对象
        Object person = constructor.newInstance("张三", 23);
        System.out.println(person);

        System.out.println("---------------------------");

        Constructor<Person> constructor1 = personClass.getConstructor();
        System.out.println(constructor1);
        // 创建对象
        Object person1 = constructor1.newInstance();
        System.out.println(person1);

        Object o = personClass.newInstance();
        System.out.println(o);
    }
}
