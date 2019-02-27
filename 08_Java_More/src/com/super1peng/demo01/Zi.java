package com.super1peng.demo01;

/**
 * @Author: super1peng
 * @Date: 2019/2/27 下午3:44
 * @Version 1.0
 */
public class Zi extends Fu{

    @Override
    public void methodAbs(){

    }

    // 错误写法！不能覆盖重写父类当中final的方法
//    @Override
//    public void method() {
//        System.out.println("子类覆盖重写父类的方法！");
//    }
}
