package com.super1peng.demo04;

/**
 * @Author: super1peng
 * @Date: 2019/2/27 下午4:02
 * @Version 1.0
 */
public class DemoMain {

    public static void main(String[] args) {
        // 创建一个英雄角色
        Hero hero = new Hero();
        hero.setName("盖伦");
        hero.setAge(20);

        // 创建一把武器
        Weapon weapon = new Weapon("AK-47");
        // 为英雄配备武器
        hero.setWeapon(weapon);

        hero.attack();
    }
}
