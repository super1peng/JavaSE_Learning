package com.super1peng.demo08;

/**
 * @Author: super1peng
 * @Date: 2019/3/4 下午9:43
 * @Version 1.0
 */
public class Husband {
    /*
    使用this引用本类的成员方法
 */

    public void buyHouse(){
        System.out.println("买了一套房子");
    }
    public void marry(Richable r){
        r.buy();
    }

    public void happy(){

        /*
            使用方法引用优化Lambda表达式
            this是已经存在的
            本类的成员方法buyHouse也是已经存在的
            所以我们可以直接使用this引用本类的成员方法buyHouse
         */
        marry(this::buyHouse);
    }

    public static void main(String[] args) {
        new Husband().happy();
    }
}
