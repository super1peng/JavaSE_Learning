package com.super1peng.reflect;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @Author: super1peng
 * @Date: 2019/3/5 下午3:43
 * @Version 1.0
 */
public class ReflectTest {

    /**
     * 框架类
     */

    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        // 可以创建任意类型的对象，可以执行任意的方法


        // 1. 加载配置文件
        // 1.1 创建Properties对象
        Properties pro = new Properties();
        // 1.2 加载配置文件，转换为一个集合
        // 1.2.1 获取class目录下的配置文件
        ClassLoader classLoader = ReflectTest.class.getClassLoader();
        InputStream is = classLoader.getResourceAsStream("pro.properties");
        pro.load(is);

        // 2. 获取配置文件中定义的数据
        String className = pro.getProperty("className");
        String methodName = pro.getProperty("methodName");

        // 加载该类进内存
        Class<?> cls = Class.forName(className);
        // 创建对象
        Object obj = cls.newInstance();
        // 获取方法对象
        Method method = cls.getMethod(methodName);
        // 执行方法
        method.invoke(obj);

    }
}
