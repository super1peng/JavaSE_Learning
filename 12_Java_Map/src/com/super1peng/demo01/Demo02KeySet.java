package com.super1peng.demo01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 * @Author: super1peng
 * @Date: 2019/3/1 下午2:47
 * @Version 1.0
 */
public class Demo02KeySet {

    /*
    Map集合的第一种遍历方式:通过键找值的方式
    Map集合中的方法:
         Set<K> keySet() 返回此映射中包含的键的 Set 视图。
    实现步骤:
        1.使用Map集合中的方法keySet(),把Map集合所有的key取出来,存储到一个Set集合中
        2.遍历set集合,获取Map集合中的每一个key
        3.通过Map集合中的方法get(key),通过key找到value
 */

    public static void main(String[] args) {
        // 创建Map集合对象
        HashMap<String, Integer> map = new HashMap<>();
        map.put("赵丽颖", 168);
        map.put("杨颖", 165);
        map.put("林志玲", 178);

        // 使用Map集合中的方法keySet，吧Map集合所有的key取出来，存在一个Set集合中
        Set<String> set = map.keySet();
        // 遍历集合，获取Map集合中每一个key
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()){
            String key = iterator.next();
            Integer value = map.get(key);
            System.out.println(key+"="+value);
        }

        System.out.println("===================");

        // 使用增强for遍历Set
        for(String key : set){
            //3.通过Map集合中的方法get(key),通过key找到value
            Integer value = map.get(key);
            System.out.println(key+"="+value);
        }
        System.out.println("-------------------");
        //使用增强for遍历Set集合
        for(String key : map.keySet()){
            //3.通过Map集合中的方法get(key),通过key找到value
            Integer value = map.get(key);
            System.out.println(key+"="+value);
        }
    }
}
