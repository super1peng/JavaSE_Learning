package com.super1peng.demo07;

/**
 * @Author: super1peng
 * @Date: 2019/3/4 下午9:38
 * @Version 1.0
 */
public class Man extends Human{

    @Override
    public void sayHello(){
        System.out.println("Hello, I'm a man");
    }

    // 定义一个方法参数传递Greetable接口
    public void method(Greetable g){
        g.greet();
    }

    public void show(){
        //调用method方法,方法的参数Greetable是一个函数式接口,所以可以传递Lambda
        method(()-> {
            Human human = new Human();
            human.sayHello();
        });

        //因为有子父类关系,所以存在的一个关键字super,代表父类,所以我们可以直接使用super调用父类的成员方法
        method(() -> {
            super.sayHello();
        });


        /*
           使用super引用类的成员方法
           super是已经存在的
           父类的成员方法sayHello也是已经存在的
           所以我们可以直接使用super引用父类的成员方法
       */
        method(super::sayHello);
    }

    public static void main(String[] args) {
        Man man = new Man();
        man.show();
    }

}
