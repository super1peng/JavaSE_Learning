package com.super1peng.demo02;

/**
 * @Author: super1peng
 * @Date: 2019/3/4 下午4:42
 * @Version 1.0
 */

@FunctionalInterface
public interface MessageBuilder {
    // 定义一个拼接消息的抽象方法，返回被拼接的消息
    public abstract String builderMessage();
}
