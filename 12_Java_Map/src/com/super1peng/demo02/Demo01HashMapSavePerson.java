package com.super1peng.demo02;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Author: super1peng
 * @Date: 2019/3/1 下午3:00
 * @Version 1.0
 */
public class Demo01HashMapSavePerson {

    public static void main(String[] args) {
        show01();
    }

    private static void show01(){

        HashMap<String, Person> map = new HashMap<>();

        // 往集合中添加元素
        map.put("北京", new Person("张三",18));
        map.put("上海", new Person("李四",19));
        map.put("广州", new Person("王五",21));
        map.put("南京", new Person("赵六",18));
        map.put("深圳", new Person("田七",19));

        Set<Map.Entry<String, Person>> entrySet = map.entrySet();
        for (Map.Entry<String, Person> entry : entrySet){
            String key = entry.getKey();
            Person value = entry.getValue();
            System.out.println(key+"-->"+value);
        }
    }
}
