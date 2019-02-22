### API

API (Application Programming Interface)，应用程序编程接口


主要看类的解释和说明，学习构造方法。

#### Scanner类

可以解析基本类型和字符串的简单文本扫描器。


> 匿名对象：创建对象时，只有创建对象的语句，没有把对象地址值赋值给某个变量。

1. 创建匿名对象直接调用方法，没有变量名
2. 一旦调用两次方法，就是创建了两个对象，造成浪费。
3. 匿名对象可以作为方法的参数和返回值

* 作为参数
```java
class Test{
    public static void main(String[] args){
        
        // 普通方式
        Scanner sc = new Scanner(System.in);
        input(sc);
        // 匿名对象放肆
        input(new Scanner(System.in));
    }
    
    public static void input(Scanner sc){
        System.out.println(sc);
    }
}
```
* 作为返回值
```java
class Test2{
    public static void main(String[] args){
        Scanner sc = getScanner();
    }
    
    public static Scanner getScanner(){
        return new Scanner(System.in);
    }
    
}

```


#### Random类

用于产生伪随机数

#### ArrayList类

目前，如果想存储对象数据，选择的容器只有对象数组，但是数组的长度是固定的，无法适应数据变化的需求。为了解决这个问题，Java提供了另一个容器```java.util.ArrayList```集合类，
这可以是我们更加便捷的存储和操作对象数据。

* 查看类的说明
java.util.ArrayList<E>: 

<E>，表示一种指定的数据类型，叫做泛型。在```E```出现的地方，我么使用一种引用数据类型将其替换即可，表示我们将存储哪种引用类型的元素。

基本格式
```java
ArrayList<Sting> list = new ArrayList<String>();
// JDK7以后，右侧可以留空。
ArrayList<Sting> list = new ArrayList<>();
```

ArrayList对象不能存储基本类型，只能存储引用类型的数据。

常见的方法：
* public boolean add(E e): 将制定元素添加到此集合的尾部；
* public E remove(int index): 移除此集合中制定位置上的元素，返回被删除的元素；
* public E get(int index): 返回此集合中指定位置上的元素。返回获取的元素；
* public int size(): 返回集合中元素数；
