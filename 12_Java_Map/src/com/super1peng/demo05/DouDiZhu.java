package com.super1peng.demo05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/**
 * @Author: super1peng
 * @Date: 2019/3/1 下午3:29
 * @Version 1.0
 */
public class DouDiZhu {

    /*
        斗地主综合案例:有序版本
        1.准备牌
        2.洗牌
        3.发牌
        4.排序
        5.看牌
     */

    public static void main(String[] args) {
        // 准备牌
        // 创建一个Map集合，存储牌的索引和组装好的牌
        HashMap<Integer, String> poker = new HashMap<>();
        // 创建一个List集合，存储牌的索引
        ArrayList<Integer> pokerIndex = new ArrayList<>();
        // 定义两个集合，存储花色和牌的序号
        List<String> colors = List.of("♠", "♥", "♣", "♦");
        List<String> numbers = List.of("2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3");

        int index = 0;
        poker.put(index, "大王");
        pokerIndex.add(index);
        poker.put(index++, "小王");
        pokerIndex.add(index);

        index++;
        //循环嵌套遍历两个集合,组装52张牌,存储到集合中
        for (String number : numbers) {
            for (String color : colors) {
                poker.put(index,color+number);
                pokerIndex.add(index);
                index++;
            }
        }

        // 洗牌操作
        Collections.shuffle(pokerIndex);
        // 发牌操作
        ArrayList<Integer> player01 = new ArrayList<>();
        ArrayList<Integer> player02 = new ArrayList<>();
        ArrayList<Integer> player03 = new ArrayList<>();
        ArrayList<Integer> diPai = new ArrayList<>();

        //遍历存储牌索引的List集合,获取每一个牌的索引
        for (int i = 0; i <pokerIndex.size() ; i++) {
            Integer in = pokerIndex.get(i);
            //先判断底牌
            if(i>=51){
                //给底牌发牌
                diPai.add(in);
            }else if(i%3==0){
                //给玩家1发牌
                player01.add(in);
            }else if(i%3==1){
                //给玩家2发牌
                player02.add(in);
            }else if(i%3==2){
                //给玩家3发牌
                player03.add(in);
            }
        }
        /*
            4.排序
            使用Collections中的方法sort(List)
            默认是升序排序
         */
        Collections.sort(player01);
        Collections.sort(player02);
        Collections.sort(player03);
        Collections.sort(diPai);

        /*
            5.看牌
            调用看牌的方法
         */
        lookPoker("刘德华",poker,player01);
        lookPoker("周润发",poker,player02);
        lookPoker("周星驰",poker,player03);
        lookPoker("底牌",poker,diPai);
    }

    private static void lookPoker(String name, HashMap<Integer, String> poker, ArrayList<Integer> list) {
        // 输出玩家姓名，不换行
        System.out.print(name + ":");
        for (Integer key : list){
            String s = poker.get(key);
            System.out.print(s + " ");
        }
        System.out.println();
    }
}
