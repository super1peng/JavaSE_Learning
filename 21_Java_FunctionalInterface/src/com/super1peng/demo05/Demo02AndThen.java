package com.super1peng.demo05;

import java.util.function.Consumer;

/**
 * @Author: super1peng
 * @Date: 2019/3/4 下午7:29
 * @Version 1.0
 */
public class Demo02AndThen {

    /*
   Consumer接口的默认方法andThen
   作用:需要两个Consumer接口,可以把两个Consumer接口组合到一起,在对数据进行消费

   例如:
    Consumer<String> con1
    Consumer<String> con2
    String s = "hello";
    con1.accept(s);
    con2.accept(s);
    连接两个Consumer接口  再进行消费
    con1.andThen(con2).accept(s); 谁写前边谁先消费
*/

    // 定义一个方法，方法的参数传递一个字符串和两个Consumer接口，Consumer接口的泛型使用字符串
    public static void method(String s, Consumer<String> con1, Consumer<String> con2){
        con1.andThen(con2).accept(s);
    }

    public static void main(String[] args) {
        // 调用method方法，传递一个字符串，两个Lambda表达式
        method("Hello",
                (t) -> {
                    System.out.println(t.toUpperCase());
                },
                (t) -> {
                    System.out.println(t.toLowerCase());
                });
    }
}
