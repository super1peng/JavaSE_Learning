package com.super1peng.demo06;

import com.super1peng.red.OpenMode;

import java.util.ArrayList;

/**
 * @Author: super1peng
 * @Date: 2019/2/27 下午4:33
 * @Version 1.0
 */
public class NormalMode implements OpenMode {

    @Override
    public ArrayList<Integer> divide(final int totalMoney, final int totalCount){
        ArrayList<Integer> list = new ArrayList<>();

        int avg = totalMoney / totalCount;
        int mod = totalMoney % totalCount;

        for (int i = 0; i < totalCount; i++) {
            list.add(avg);
        }
        list.add(mod);
        return list;
    }
}
