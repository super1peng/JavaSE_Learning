package com.super1peng.demo03;

import java.util.ArrayList;
import java.util.Random;

/**
 * @Author: super1peng
 * @Date: 2019/2/23 下午10:07
 * @Version 1.0
 */
public class Member extends User{

    public Member(){

    }

    public Member(String name, int money) {
        super(name, money);
    }


    public void receive(ArrayList<Integer> list){

        // 从多个红包中随机抽取一个给自己
        // 随机获取一个集合中的索引编号

        int index = new Random().nextInt(list.size());
        // 根据索引，从集合当中删除，并且得到被删除的红包，给我自己
        int delta = list.remove(index);

        // 当前成员自己本来有多少钱
        int money = super.getMoney();

        // 加法，并且重新设置回去
        super.setMoney(money + delta);
    }

}
