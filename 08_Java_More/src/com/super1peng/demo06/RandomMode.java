package com.super1peng.demo06;

import com.super1peng.red.OpenMode;

import java.util.ArrayList;
import java.util.Random;

/**
 * @Author: super1peng
 * @Date: 2019/2/27 下午4:27
 * @Version 1.0
 */
public class RandomMode implements OpenMode {
    @Override
    public ArrayList<Integer> divide(final int totalMoney, final int totalCount){
        ArrayList<Integer> list = new ArrayList<>();

        Random r = new Random();  // 首先创建一个随机数产生器
        int leftMoney = totalMoney;
        int leftCount = totalCount;

        for (int i = 0; i < totalCount - 1; i++) {
            int money = r.nextInt(leftMoney / leftCount * 2) + 1;
            list.add(money);
            leftMoney -= money;
            leftCount--;
        }

        list.add(leftMoney);
        return list;
    }

}
