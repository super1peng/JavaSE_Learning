package com.super1peng.Demo03;

import java.util.ArrayList;
/**
 * @Author: super1peng
 * @Date: 2019/2/22 下午9:59
 * @Version 1.0
 */
public class Demo04ArrayListEach {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("迪丽热巴");
        list.add("古力娜扎");
        list.add("玛尔扎哈");

        // 遍历集合
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
