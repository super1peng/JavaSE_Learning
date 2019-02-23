package com.super1peng.demo03;

import java.util.ArrayList;

/**
 * @Author: super1peng
 * @Date: 2019/2/23 下午10:17
 * @Version 1.0
 */
public class MainRedPacket {


    public static void main(String[] args) {


        Manager manager = new Manager("群主", 100);

        Member one = new Member("成员A",0);
        Member two = new Member("成员B",0);
        Member three = new Member("成员B",0);

        manager.show();

        one.show();
        two.show();
        three.show();
        System.out.println("=============================");

        // 驱逐总共发20元。分成三份
        ArrayList<Integer> redList = manager.send(20, 3);

        one.receive(redList);
        two.receive(redList);
        three.receive(redList);

        manager.show();

        one.show();
        two.show();
        three.show();
        System.out.println("=============================");
    }
}
