package com.super1peng.demo06;

import javax.imageio.IIOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author: super1peng
 * @Date: 2019/3/3 下午5:18
 * @Version 1.0
 */
public class Demo03JDK9 {

    /*
        JDK9新特性
        try的前边可以定义流对象
        在try后边的()中可以直接引入流对象的名称(变量名)
        在try代码执行完毕之后,流对象也可以释放掉,不用写finally
        格式:
            A a = new A();
            B b = new B();
            try(a,b){
                可能会产出异常的代码
            }catch(异常类变量 变量名){
                异常的处理逻辑
            }
     */

    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("17_Java_IOStream/1.jpg");
        FileOutputStream fos = new FileOutputStream("17_Java_IOStream/3.jpg");

        try (fis; fos){
            int len = 0;
            while ((len = fis.read()) != -1){
                fos.write(len);
            }
        }catch (IIOException e){
            System.out.println(e);
        }
    }
}
