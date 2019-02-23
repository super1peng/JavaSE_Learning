### String类


```java.lang.String```类代表字符串。Java程序中所有的字符串文字，都可以被看做是实现此类的实例。


特点：
* 字符串不变：字符串的值在创建之后不能被更改。
* 因为String对象是不可变的，所有它们可以被共享。
* "abc"等效于```char[] data = {'a', 'b','c'}```。

查看类：
* ```java.lang.String```：此类不需要导入。

查看构造方法：
* ```public String()```：初始化新建的String对象，以使其表示空字符序列。
* ```public String(char[] value)```：通过当前参数中的字符数组来构造新的String。
* ```public String(byte[] bytes)```：通过使用平台默认字符集编码当前参数中字节数组来构造新的String。


获取功能：  
1. 字符串长度：length();
2. 将制定的字符串连接到该字符串的末尾：concat(String str);
3. 返回制定索引处的char值：charAt(int index);
4. 返回一个子字符串，从beginIndex开始截取字符串到字符串结尾：substring(int beginIndex);
5. 返回一个子字符串，含beginIndex，不含endIndex，substring(int beginIndex, int endIndex);

转换功能：
1. toCharArray()：将此字符串转换为新的字符数组；
2. getBytes()：使用平台默认字符集将该String编码转换为新的字节数组；
3. replace(CharSequence target, CharSequence replacement)：替换字符串；


分割功能：  
1. ```public String[] split(String regex)```：将此字符串按照给定的regex（规则）拆分为字符串数组。


##### 字符串的常量池
![](https://ws3.sinaimg.cn/large/006tKfTcgy1g0gf7uox48j311i0eqaav.jpg)

### static关键字
static可以用来修饰成员变量和成员方法，被修饰的成员是属于类的，而不是单单属于某个对象的。可以直接调用。


* 类变量：使用static关键字修饰的成员变量。

该类的每个对象都共享同一个类变量的值，任何对象都可以更改该类变量的值，也可以在不创建该类的对象的情况下对类变量进行操作。

* 静态方法：建议使用类名来调用，不需要创建类。

> 注意事项：1. 静态方法可以直接访问磊类变量和静态方法。2. 静态方法不能直接访问普通成员变量和成员方法，反之成员方法可以
直接访问类变量或静态方法。3. 静态方法中，不能使用this关键字。


##### 原理图解
<p align="center">
<img src="https://ws4.sinaimg.cn/large/006tKfTcgy1g0gex73ns6j314o0n8tvl.jpg" width=60% />
</p>


##### 静态代码块

* 静态代码块：定义在成员位置，使用static修饰的代码块 { } 。

* 位置：类中方法外。
* 执行：随着类的加载而执行且执行一次，优先于main方法和构造方法的执行。
* 作用：给类变量进行初始化赋值。


### 常见的类

* Arrays：```java.util.Arrays```此类包含操作数组的各种方法，排序、搜索等
* Math：```java.lang.Math```包含用于执行基本数学运算的方法，指数、对数、平方根等

