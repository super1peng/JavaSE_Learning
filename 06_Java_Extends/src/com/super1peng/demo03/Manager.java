package com.super1peng.demo03;

import java.util.ArrayList;

/**
 * @Author: super1peng
 * @Date: 2019/2/23 下午10:11
 * @Version 1.0
 */


// 群主类 负责发红包
public class Manager extends User{

    public Manager() {
    }

    public Manager(String name, int money) {
        super(name, money);
    }

    public ArrayList<Integer> send(int totalMoney, int count){
        /*

         */

        // 首先需要一个集合，用来存储若干个红包的金额
        ArrayList<Integer> redList = new ArrayList<>();

        // 群主首先看一下自己有多少钱
        int leftMoney = super.getMoney();
        if (totalMoney > leftMoney) {
            System.out.println("余额不足");
            return redList; // 返回空集合
        }

        // 扣钱，其实就是重新设置余额
        super.setMoney(leftMoney - totalMoney);

        // 发哄好需要平均拆分成count份
        int avg = totalMoney / count;
        int mod = totalMoney % count;// 零头,包在最后一个红包中
        for (int i = 0; i < count -1 ; i++) {
            redList.add(avg);
        }

        int last = avg + mod;
        redList.add(last);

        return redList;

    }
}
