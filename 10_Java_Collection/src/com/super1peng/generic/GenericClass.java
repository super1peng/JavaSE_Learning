package com.super1peng.generic;

/**
 * @Author: super1peng
 * @Date: 2019/3/1 上午11:01
 * @Version 1.0
 */
public class GenericClass<E> {

    private E name;

    public E getName() {
        return name;
    }

    public void setName(E name) {
        this.name = name;
    }
}
