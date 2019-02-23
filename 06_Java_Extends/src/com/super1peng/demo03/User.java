package com.super1peng.demo03;

/**
 * @Author: super1peng
 * @Date: 2019/2/23 下午10:04
 * @Version 1.0
 */
public class User {

    private String name; // 姓名
    private int money;


    public User() {
    }

    public User(String name, int money) {
        this.name = name;
        this.money = money;
    }

    // 展现一下当前用户有多少钱
    public void show(){
        System.out.println("我叫：" + name + "，我有多少钱：" + money);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
