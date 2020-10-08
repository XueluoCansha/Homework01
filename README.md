# Homework01
实验作业(一)

## 实验内容
### 基本要求
    1、用类描述计算机中CPU的速度和硬盘的容量，要求Java应用程序由4个类，名字分别是PC、CPU、HardDisk、和Test，其中Test是主类。
    2、其中，CPU类要求getSpeed()返回speed的值，要求setSpeed(int m)方法将参数m的值赋值给speed；HardDisk类要求getAmount()返回amount的值，要求setAmount(int m)方法将参数m的值赋值给amount；PC类要求setCPU(CPU c)将参数c的值赋值给cpu，要求setHardDisk(HardDisk h)方法将参数h的值赋值给HD，要求show()方法能显示cpu的速度和硬盘的容量。
    3、主类Test的要求：
      （1）main方法中创建一个CPU对象cpu，cpu将自己的speed设置为2200。
      （2）main方法中创建一个HardDisk对象disk，disk将自己的amount设置为200。 
      （3）main方法中创建一个PC对象pc。 
      （4）pc调用setCPU(CPU c)方法，调用时实参是cpu。 
      （5）pc调用setHardDisk(HardDisk h)方法，调用时实参是disk。 
      （6）pc调用show()方法。 
      
### 附加要求
    a）类中定义不少于两个构造方法；
    b）每个类中定义不少于2个属性，且属性的类型应该多样化；
    c）根据课堂中关于访问权限的内容，尝试定义属性的修饰符多样化，类中定义方法操作属性，避免直接通过“类对象.属性”的形式访问属性值；且定义的方法内应该有符合常理的逻辑判断；
    d）尝试把本次实验的多个类放置在不同的包中，体会修饰符private的用法。
    
## 实验设计
    代码用public class定义了四个类：PC、CPU、HardDisk、和Test，其中Test是主类。
    在CPU类和HardDisk类中，通过实验要求的get属性()和return语句返回值，set属性(int m)方法将m的值赋给属性。speed和amount都是用int定义的整形变量。
    在PC类中用set类名(类名 属性)方法定义一个CPU变量和一个HardDisk变量，并将变量的值赋给属性变量。
    定义show()输出函数，用System.out.println()函数输出：CPU的速度、CPU的利用率、硬盘的容量、硬盘的读写速度、PC的内存。其中CPU的速度和硬盘的容量是基本要求中输出的结果。
    在Test类main()方法中创建CPU对象cpu，通过“类对象.属性”的形式访问属性值，这样输出的speed值就是2200。同理，创建HardDisk对象disk，输出amount值200。
    
## 核心代码
    构造方法以CPU类为例：
    构造方法其一：
    CPU(){
    }
    构造方法其二：
    public double utility;
    CPU(double utility){
    	this.utility = utility;
    }
    其中构造方法二定义了一个CPU类的新变量utility(利用率)，因为是利用率，有小数点后面的数字，所有用double类型定义。同理，在HardDisk类中定义新变量rate(读写速率)，同样用double类型定义。同理，在PC类中用构造方法定义属性ram(内存)。
    用构造方法定义的属性utility、rate、ram，使用public权限修饰词。
    CPU cpu = new CPU(3);
    Test类main()方法中，通过给类的初始值赋值给这三个属性赋值。
    private int speed;
    int getSpeed(){
        return speed;
    }
    public void setSpeed(int m){
        this.speed = m;
    }
    通过Test类main()方法中对CPU、HardDisk、PC类的初始值设定来赋值。而通过get属性()和set属性()定义并赋值的属性用private权限修饰词，这是因为private修饰词下，只能通过get属性()方法返回值赋值。
    
## 实验结果
![result](https://github.com/sTormfroNT-TNT/Homework01/blob/main/img/01.png)
## 实验感想
    这是Java课的第一次实验，Java是我学到的第一个面对对象的语言，在这一次实验中，我基本掌握了java的编程规则、知识要点和一些小技巧，使我对构造方法、赋值方法、类的理解、权限的理解有了新的认识，特别是对面向对象的编程思想和风格有了进一步的认识和思想到。同时，因正确的编出程序而带来的成就感让我对编程更加感兴趣。对于在这些实验过程中，同学互助、查阅资料等基本的学习方式，渐渐有了自己的想法，使我更加领悟到集体和团队的力量，也树立了敢于攻坚的信心。Java和C与Python有着不小的区别，相信经过一学期的学习，培养我的代码水平和理解能力。
