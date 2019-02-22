## 类与对象

### 定义类
类定义是使用```class```关键词，名称使用```Clothes```，创建一个类的实例，使用```new```关键字。


如果想在建立对象的时候，一并进行某个初始流程，像是指定数据成员值，则可以定义构造函数。构造函数式与类名称同名的方法```(Method)```。

<img src="https://ws3.sinaimg.cn/large/006tKfTcgy1g0e2lkc3kij30n90e3q6v.jpg" width=50% />

* 构造函数

如果想在建立对象时，一并进行某个初始流程，比如指定数据成员值，则可以定义构造函数(Constructor)。构造函数是与类名称同名的方法(Method)。

```java
class Clothes{
    String color;
    char size;
    
    Clothes(String color, char size){
        this.color = color;
        this.size = size;
    }
}
```

* 



### 使用标准类
Java SE提供了标准的API，这些API就是由许多类组成的。

#### java.util.Scanner
```java
import java.util.Scanner;
// 告诉程序接下来想要偷懒
// 由于你不想输入 java.util.Scanner 所以告诉程序只要输入Scanner就可以
// 习惯上，包名称为java开头的类，表示标准API提供的类
public class Guess {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);  // 建立 Scanner实例

        int number = (int) (Math.random() * 10);
        int guess;

        do {
            System.out.println("猜数字(0-9):");
            guess = scanner.nextInt();       // 取得下一个整数
        }while (guess != number);

        System.out.println("恭喜你，猜中了！");
    }
}
```

#### java.math.BigDecimal

Java遵守IEEE 754浮点数运算规范，使用分数与指数来表示浮点数。

```java
import java.math.BigDecimal;

public class DecimalDemo2 {

    public static void main(String[] args){

        BigDecimal op1 = new BigDecimal("0.1");
        BigDecimal op2 = new BigDecimal("0.1");
        BigDecimal op3 = new BigDecimal("0.1");

        BigDecimal result = new BigDecimal("0.3");

        if(op1.add(op2).add(op3).equals(result)){
            System.out.println("等于 0.3");
        }
        else {
            System.out.println("不等于 0.3");
        }


        System.out.println( op1 == op2);
        System.out.println(op1.equals( op2 ));
        BigDecimal op4 = op1;
        System.out.println( op1 == op4);
    }

}
```
#### 对象指定与相等性

基本类型时：当使用=，是将值复制给变量，当使用==时，是比较两个变量存储的值是否相同。
 
操作对象时：=是用在指定参考名称参考某个对象，而==是用在比较两个参考名称是否参考同一个对象。

```java
BigDecimal a = new BigDecimal("0.1");
BigDecimal b = new BigDecimal("0.1");
BigDecimal c = a;
System.out.println( a == b); // false
System.out.println( a == c); // true
System.out.println( a.equals(b)); // true
```

<img src="https://ws4.sinaimg.cn/large/006tKfTcgy1g0e34lr277j30nu082764.jpg" width=40% />

### 基本类型打包器

在J2SE 5.0之后开始支持自动装箱、拆箱。类数据类型：Long、Integer、Double、Float、Boolean等。

#### 打包基本类型
Java中有两个类型系统，即基本类型与类类型，使用基本类型目的在于效率，然而更多的时候，会使用类建立实例，因为对象本身可以携带更多的信息。

```java
public class InterDemo {

    public static void main(String[] args){
        int data1 = 10;
        int data2 = 20;

        Integer wrapper1 = new Integer(data1);  // 打包基本类型
        Integer wrapper2 = new Integer(data2);
        System.out.println(data1 / 3);  // 基本类型运算
        System.out.println(wrapper1.doubleValue() / 3);  // 操作打包器方法
        System.out.println(wrapper1.compareTo(wrapper2));
        // 比较两个对象，如果打包值相同就返回0，如果下雨compareTo()传入对象打包值就返回-1，否则就是1
    }
}
```


#### 自动装箱、拆箱
```java
Integer wrapper = 10; // 自动装箱
int foo = wrapper;    // 自动拆箱
```


#### 自动装箱、拆箱的内幕

```java
Integer number = 100; 
// 展开为：
Integer localInteger = Integer.valueOf(100);
```

<img src="https://ws2.sinaimg.cn/large/006tKfTcgy1g0e3hzwwtaj30rz06amzo.jpg" width=40% />

>
<img src="https://ws3.sinaimg.cn/large/006tKfTcgy1g0e3jgtmdpj30co087wfn.jpg" width=40% />

>

<img src="https://ws4.sinaimg.cn/large/006tKfTcgy1g0e3k8f0g7j30cy084jsn.jpg" width=41% />

### 数组对象
数组在Java语言中，技术对象。

#### 数组基础
```java
int[] score = [88, 81, 74, 68, 78, 76, 77, 85, 95, 93];
// 也可以放在score之后
```
这个程序建立了一个数组，因为使用int[]声明，所以会在内存中分配长度为10的int连续空间，各个空间存储了10个数组，各个空间都给予了索引编号，索引从0开始，由于长度是10，所以最后的索引是9，如果存取超出了索引范围，就会抛出```ArrayIndexOutOfBoundsException```错误。


一位维数组使用一个索引存取数组元素，当然也可以声明二维数组，二维数组使用两个索引存取元素。
```java
public class XY {
    public static void main(String[] args){
        int[][] cords = {
                {1, 2, 3},
                {4, 5, 6}
        };

        for(int x=0; x < cords.length; x++){
            for(int y=0; y < cords[x].length; y++){
                System.out.printf("%2d", cords[x][y]);
            }
            System.out.println();
        }

        for(int[] row  : cords){
            for(int value : row){
                System.out.printf("%2d", value);
            }
            System.out.println();
        }
    }
}
```


#### 操作数组对象
如果事先不知道元素值，只知道元素个数，那可以使用new关键词指定长度来建立数组。
数据类型 | 初始值 | 数据类型 | 初始值
--- | --- | --- | ---
byte | 0 | double | 0.0D
short | 0 | char | \u000
int | 0 | boolean | false
long | 0L | 类 | null
float | 0.0F

如果默认值不符合你的需求，则可以使用java.util.Arrays的fill方法来设定新建数组的元素值。
```java
import java.util.Arrays;
public class Score2 {

    public static void main(String[] args){
        int[] scores = new int[10];

        for(int score : scores){
            System.out.printf("%2d", score);
        }
        // 输出 0 0 0 0 0 0 0 0 0 0
        System.out.println();
        Arrays.fill(scores, 60);
        for(int score : scores){
            System.out.printf("%3d", score);
        }
        // 输出：60 60 60 60 60 60 60 60 60 60
    }
}
```

如果想在new数组中一并指定初始值，可以这样撰写不必指定数组长度：
```java
int[] score = new int[] {88, 81, 74, 68, 78, 76, 77, 85, 95, 93};
```

没有人规定二维数组一定得是矩阵，所以你可以建立不规则数组。
```java
public class IrregularArray {

    public static void main(String[] args){
        int[][] arr = new int[2][];   // 声明arr参考对象会有两个索引
        arr[0] = new int[] {1, 2, 3, 4, 5};
        arr[1] = new int[] {1, 2, 3};
        for(int[] row : arr){
            for(int value : row){
                System.out.printf("%2d", value);
            }
            System.out.println();
        }
    }
}
```
以上都是基本类型建立的数组。下面是类类型建立的数组：
```java
Integer[] scores = new Integer[3];
```

上面的程序片段建立了0个Integer对象：
```java
public class IntegerArray {

    public static void main(String[] args){
        Integer[] scores = new Integer[3];
        for(Integer score : scores){
            System.out.println(score);
        }
        scores[0] = new Integer(99);
        scores[1] = new Integer(87);
        scores[2] = new Integer(66);
        // Integer[] scores = { new Integer(99), new Integer(87), new Integer(66) }
        for(Integer score : scores) {
            System.out.println(score);
        }
    }
}
```
<img src="https://ws4.sinaimg.cn/large/006tNbRwly1fwi47f73jsj30b305yab2.jpg" width=30% />

#### 数组复制
```java
int[] scores1 = {88, 81, 74};
int[] socres2 = new int[scores1.length];
for(int i=0; i<scores1.length; i++){
    scores2[i] = scores1[i];
}
// System.arraycopy()方法，使用原生方法复制每个索引元素
// System.arraycopy(score1, 0, scores2, 0, scores1.length)
```

JDK6以上，还有更加方便的方法：
```java
public class CopyArray {

    public static void main(String[] args){
        int[] scores1 = {88, 91, 74, 68};
        int[] scores2 = Arrays.copyOf(scores1, scores1.length);
        for(int score : scores2){
            System.out.printf("%3d", score);
        }
        System.out.println();
        scores2[2] = 99;
        for(int score : scores2){
            System.out.printf("%3d", score);
        }
    }
}
```

对于类类型声明的数组：
```java
class Clothes3{
    String color;
    char size;
    Clothes3(String color, char size){
        this.color = color;
        this.size = size;
    }
}

public class ShallowCopy {
    public static void main(String[] args){
        Clothes3[] c1 = { new Clothes3("red", 'L'), new Clothes3("blue", 'M') };
        Clothes3[] c2 = new Clothes3[c1.length];
        for(int i = 0; i < c1.length; i++){
            c2[i] = c1[i];
        }
        c1[0].color = "yellow";
        System.out.println(c2[0].color);
    }
}
```
<img src="https://ws3.sinaimg.cn/large/006tNbRwly1fwi63ts2g9j30au061q43.jpg" width=30% /> 


```java
class Clothes4{
    String color;
    char size;
    Clothes4(String color, char size){
        this.color = color;
        this.size = size;
    }
}

public class DeepCopy {

    public static void main(String[] args){
        Clothes4[] c1 = { new Clothes4("red", 'L'), new Clothes4("blue", 'M')};
        Clothes4[] c2 = new Clothes4[c1.length];

        for(int i = 0 ; i < c1.length; i++){
            Clothes4 c = new Clothes4(c1[i].color, c1[i].size);
            c2[i] = c;
        }
        c1[0].color = "yellow";
        System.out.println(c2[0].color);
    }
}
```

<img src="https://ws2.sinaimg.cn/large/006tNbRwly1fwi64lwks5j30b6073jsy.jpg" width=30% /> 


### 字符串对象

字符串特性：

1) 字符串常量与字符串池
```java
char[] name = {'J','u','s','t','i','n'};
String name1 = new String(name);
String name2 = new String(name);
System.out.println(name1 == name2);
```
答案是false，因为name1和name2分别参考至创建出来的String对象。

```java
String name1 = "Justin";
String name2 = "Justin";
System.out.println(name1 == name2);
```
答案是true。在java中为了效率考虑，以""包括的字符串，只要内容相同（序列、大小写相同），无论在程序代码中出现多少次，JVM都会只建立一个String实例，实例存放在字符串池中。

<img src="https://ws4.sinaimg.cn/large/006tNbRwgy1fwi7alv2cyj308n03bdg5.jpg" width=30%/>


```java
String name1 = "Justin";
String name2 = "Justin";
String name3 = new String("Justin");
String name4 = new String("Justin");
System.out.println(name1 == name2);
System.out.println(name1 == name3);
System.out.println(name3 == name4);
```
答案是true false false，第一个true上面已经讲过，而new一定是建立新对象，所以name3与name4分别参考至新建的String实例。

<img src=https://ws3.sinaimg.cn/large/006tNbRwly1fwi7nhkvsgj307w06twfa.jpg width=30% />



2) 不可变动的字符串
在Java中对象一旦建立，就无法更改对象中任何内容，对象上没有任何方法可以更改字符串内容。
```java
String name1 = "Java";
String name2 = name1 + "World!";
System.out.println(name2);
```
上面这个程序片段会显示```JavaWorld```，可以试着进行反编译来分析它。
```java
String s = "Java";
String s1 = (new StringBuilder()).append(s).append("World").toString();
Syytem.out.println(s1);
```
如果使用+连接字符串，会变成建立```java.lang.StringBuilder```对象，使用其```append()```方法来进行+左右字符串附件，最后再转换成```toString()```返回。

但是不要将```+```用在重复性的连接场合，比如循环或者递归使用的时候，```+```会导致频繁产生新的对象。

```java
public class OneTo100 {
    public static void main(String[] args){
        StringBuffer builder = new StringBuffer();
        for(int i=1; i<100 ; i++){
            builder.append(i).append('+');
        }
        System.out.println(builder.append(100).toString());
    }
}
```

#### 字符串编码
.java原始文档是什么编码：如果是Windows，建立纯文本文档重新命名为.java，使用Windows默认的纯文本编辑器，那么应该是GB 2312编码，在IDEA中建立.java原始码，默认应该是UTF-8编码，如果是在Eclipse中建立.java原始码，而Eclipse运行在简体中文Windows中，默认应该是GB 2312编码。

#### 查询Java API文件

http://www.oracle.com/technetwork/java/


### 总结
要产生对象必须先定义类，类是对象的设计图，对象是类的实例。类定义时使用的是```class```关键词，建立实例要使用```new```关键词。以类名称声明的变量，称为参考名称、参考变量或直接叫参考。

想在建立对象的时候，一并进行某个初始流程，像是指定数据成员值，则可以定义构造函数，构造函数是与类名称同名的方法。参数名称与对象数据成员同名是，可以在数据成员前时候用```this```区别。

这里```java.util.Scanner```的```nextInt()```方法会看看标准输入中，有没有下一个字符串（以空格或者换行符分隔），如果有的话尝试将之剖析成```int```类型（还有其他类型）。如果直接取得上一个字符串（以空格或换行符）分隔，则使用next()，如果想取得用户输入的整行文字，则使用```nextLine()```。

Java遵循IEE 754浮点数运算规范，使用分数与指数来表示浮点数。如果要求精确度，那就要小心使用浮点数，而且别用```==```直接比较浮点数运算结果。可以使用```java.math.BigDecimal```类得到想要的精度。

---
## 封装

### public
如果想在其他包的类程序代码中存取某包的类或对象成员，则该类或对象成员必须是公开成员。可以声明类为```public```，这表示它是个公开类，可以在其他包的类中使用。可以在构造函数上声明```public```，这表示其他包中的类可以直接调动这个构造函数。可以在方法上声明```public```，这表示其他包的方法中可以直接调用这个方法。如果愿意，也可以在对象数据成员上声明```public```。

### 传值调用

```java
class Customer{
    String name;
    Customer(String name){
        this.name = name;
    }
}

public class CallByValue {

    static void some(Customer c){
        c.name = "john";
    }

    static void other(Customer c){
        c = new Customer("Bill");
    }

    public static void main(String[] args){
        Customer c1 = new Customer("Justin");
        some(c1);
        System.out.println(c1.name);

        Customer c2 = new Customer("Justin");
        other(c2);
        System.out.println(c2.name);
    }
}

// 运行结果：
// John
// Justin
```

### 总结

构造函数实现对象初始化流程的封装。方法封装了操作对象的流程。Java中还可以使用```private```封装对象私有数据成员。封装的目的主要就是隐藏对象细节，将对象当做黑箱进行操作。

在Java命名规范中，取值方法的名称形式是固定的，也就是也```get```为开头，后面接上首字母大写的单词。

如果没有声明权限修饰的成员，只有在相同包的类程序代码中才可以直接存取，也就是“包范围权限”。如果想在其他包的类程序代码中存取某包的类或对象成员，则该类或对象成员必须是公开成员，在Java中要使用```public```加以声明。

创建对象时，数据成员就会初始化，如果没有指定初始值，则会使用默认值初始化。

如果定义类时，没有撰写任何构造函数，编译程序会自动加入一个无参数、内容为空的构造函数，称为默认构造函数。可以定义多个构造函数，只要参数类型或个数不同，这称为重载构造函数。

定义方法时也可以进行重载，可为类似功能的方法提供统一名称，但根据参数类型或个数的不同调用对应的方法。


编译程序在处理重载方法时，会依照以下的顺序来处理：  
（1）还没有装箱动作前可符合自变量个数与类型的方法。  
（2）装箱动作后可符合自变量个数与类型的方法。  
（3）尝试有不定长度自变量并可符合自变量类型的方法。  
（4）找不到合适的方法，编译错误。  

除了被声明为```static```的地方外，```this```关键字可以出现在类中的任何地方，在对象建立后为“这个对象”的参考名称。```this()```代表了调用另一个构造函数，至于调用哪个构造函数，则视调用this()时给的自变量类型与个数而定。  


如果对象数据成员被声明为```final```，但没有明确使用```=```指定值，那表示延迟对象成员值的指定，在构造函数执行流程中，一定要有对该数据成员指定值的操作，否则会编译错误。  

被声明为```static```的成员，不会让个别对象拥有，而是属于类。  

Java程序设计领域，早就有许多很好的命名习惯，没有遵守习惯并不是错误，但是会造成沟通与维护的麻烦。以类命名实例来说，首字母是大写，以```static```使用习惯来说，是通过类名称与```.```运算符来存取，就会知道它是```static```成员。  

同时，```import static```语法是为了偷懒，但别偷懒过头，要注意名称冲突的问题，有些名称冲突编译程序可通过下面顺序来解析。  

* 局部变量覆盖：选用方法中的同名变量、参数、方法名称。
* 成员覆盖：选用类中定义的同名数据成员、方法名称。
* 重载方法比较：使用```import static```的各个静态成员，若有同名冲突，尝试通过重载判断。


JDK5之后支持不定长度自变量，为编译程序蜜糖，展开后变为数组。使用不定长度自变量时，方法上声明的不定长度参数必须是参数列表的最后一个，使用两个以上不定长度自变量也是不合法的。
