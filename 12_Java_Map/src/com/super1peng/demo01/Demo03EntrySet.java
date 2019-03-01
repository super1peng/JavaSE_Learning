package com.super1peng.demo01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @Author: super1peng
 * @Date: 2019/3/1 下午2:52
 * @Version 1.0
 */
public class Demo03EntrySet {

    /*
    Map集合遍历的第二种方式:使用Entry对象遍历

    Map集合中的方法:
        Set<Map.Entry<K,V>> entrySet() 返回此映射中包含的映射关系的 Set 视图。

    实现步骤:
        1.使用Map集合中的方法entrySet(),把Map集合中多个Entry对象取出来,存储到一个Set集合中
        2.遍历Set集合,获取每一个Entry对象
        3.使用Entry对象中的方法getKey()和getValue()获取键与值
 */


    public static void main(String[] args) {
        // 创建集合对象
        Map<String,Integer> map = new HashMap<>();
        map.put("赵丽颖",168);
        map.put("杨颖",165);
        map.put("林志玲",178);

        // 使用Map集合中的方法entrySet()，把Map集合中多个Entry对象取出来，存储到一个Set集合中
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();

        // 2. 遍历Set集合，获取每一个Entry对象
        // 使用迭代器遍历Set集合
        Iterator<Map.Entry<String, Integer>> iterator = entrySet.iterator();
        while (iterator.hasNext()){
            Map.Entry<String, Integer> entry = iterator.next();
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key+"="+value);
        }

        System.out.println("==============================");
        // 增强for
        for (Map.Entry<String, Integer> entry : entrySet){
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key+"="+value);
        }
    }
}
