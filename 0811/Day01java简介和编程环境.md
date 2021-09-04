





# JavaSE阶段

## Day01

### Java简介和编程环境

#### 本课目标

运用java编写命令行程序

会编译、运行、调试、维护java程序

初步理解java面向对象的编程思维

能够运用java程序解决生活中的简单问题

#### 什么是程序

计算机程序或者软件程序（通常简称程序）是指一组指示计算机每一步动作的指令，通常用某种程序设计语言编写，运行于某种目标体系结构上。

（举例ppt中生活中的程序案例）

#### Java技术平台简介

Java SE：标准版    （学习）

Java EE：企业版  （ppt详细介绍）

JavaME：微型版   多用于移动端开发

#### Java的历史

#### ![image-20210506165721491](C:\Users\86183\AppData\Roaming\Typora\typora-user-images\image-20210506165721491.png)

#### Java的特点

a) 纯面向对象 类&对象  面向对象的三大特性：封装、继承、多态

b) 简单且复杂：语法简单，让程序员简单完成任务；类库丰富，应用领域广阔

c) 开放性：Java语言可以免费下载，java社区有大量源代码可供下载使用。

d) 跨平台 一次编译，到处运行。 ----->JVM

e) 健壮性：----->Java 的内存回收机制

#### Java运行机制

计算机语言：对于计算机来说，能够直接执行的指令。这种指令和系统以及硬件有关。

计算机高级语言：在遵循语法的前提下，写出一个文本文件，最后利用某种方式，把文本文件转化成机器指令执行。

有两种方把源文件转化为机器指令执行：

编译型（速度快，但不能跨平台）：源文件——编译器——可执行文件——运行可执行文件——机器指令

解释型（跨平台但效率低）：源文件——解释器——直接翻译成机器指令

 Java语言（先编译，后解释，既保证运行效率，又可以跨平台）

Java源文件——编译——class文件——在JVM中解释执行——真正的机器指令

Java运行环境（JRE）：JRE = JVM+解释器

Java开发环境（JDK）：JDK = JRE + 工具（编译器，调试器，其他工具…）+ 类库

#### 配置环境变量

JAVA_HOME：表示java的安装目录，当其他程序需要java进行支持时，会通过JAVA_HOME来寻找JAVA的安装路径。

PATH：表示命令行输入java命令时，用来指示操作系统去哪个路径下找java的相关程序。

CLASSPATH：用来指示JVM去哪个目录寻找编译过的文件。（一般配置写. 表示当前目录）

#### cmd的操作

进入硬盘 盘名:

进入文件夹 cd 文件夹名

退出文件夹返回上一级目录 cd  ..

cd\	返回根目录

#### 使用记事本开发java程序

$练习1

```java
public class HelloWorld{
	public static void main(String [] args ){
		System.out.println("Hello world!!!!!!");
	}
}
```

#### 开发步骤

![image-20210510170337958](C:\Users\86183\AppData\Roaming\Typora\typora-user-images\image-20210510170337958.png)

1. 使用记事本编辑源程序，以.java为后缀名保存
2. 使用javac命令编译.java文件，生成.class文件
3. 使用java命令.class文件，输出程序结果

#### 分析第一个程序

类：代码的容器

主方法（main方法）：程序的入口

每一个Java语句都应当以分号结尾

公开类的类名必须与java文件名相同。

一个文件可以有多个类，但只能有一个公开类。

建议一个文件写一个类，建议类名和java文件名相同。

#### 使用转义符：

$练习2 输出语句

System.out.println换行输出 	

System.out.print不换行输出

$练习3  转义符

```java
public class HelloWorld{	
	public static void main(String[ ] args){
		System.out.print("Hello  World!!!\n");
		System.out.print("Hello  World!!!\t");
	}

```

\n：将光标移动到下一行的第一格

\t ：将光标移到下一个水平制表位置

#### 注释

https://www.runoob.com/java/java-documentation.html

单行注释以 // 开始

多行注释:/* */

文档注释(生成帮助文档):/**  */ 	

整理代码快捷键：ctrl+shift+f

#### java项目组织结构

src目录：存放包和源文件

JRE系统库目录：存放程序运行必须的系统库文件

package语句必须是Java文件的第一个语句

包结构必须和硬盘的文件夹结构一致

JVM执行class文件时要带上包结构

使用javac按照包结构进行编译：javac –d 目标目录 源文件名

#### 编码规范

#####  良好的注释

#####  良好的命名：标识符

凡是自己可以起名字的地方都叫标识符。
通常有：类名、变量名、方法名、包名、接口名。。。

1.  java标识符由 26 个英文字母大小写，0-9 ，_或 $ 组成
    数字不可以开头
2.  java标识符区分大小写
3.  不可以使用关键字和保留字，但能包含关键字和保留字

##### 关键字&保留字

被 Java 语言赋予了特殊含义，用做专门用途的字符串（单词）

关键字：

abstract assert do implements private throw boolean double import protected throws break else enum instanceof public transient byte extends int return case true false interface short try catch final long static void char finally native super volatile class float new switch while continue for null synchronized default if package this

保留字：

goto/const

#####  望文生义

##### 大小写规范

包名：全小写 

类名：每个单词首字母大写 HelloWorld

变量/函数名：首单词小写，后面每个单词大写 helloWorld

常量名：全大写，单词之间下划线分隔 HELLO_WORLD 

#####  良好的缩进

对于每一个代码块，其内容都应当缩进 缩进应当统一。

Java API 文档： API:application programming interface

应用程序接口

#### 作业

1.在控制台输出自我介绍信息

2.ppt34页 控制台输出商品价目表

3.ppt35页 控制台输出购物系统登录菜单和系统主菜单

```
public class Info {
	public static void main(String[] args) {
		/*输出自我介绍信息*/
		System.out.println("你好，我是青维信学员");
		System.out.print("姓名：爱编程\n");
		System.out.print("年龄：20岁\n");
		System.out.print("爱好：写代码");
	}

}

```

```
public class GoodsList {

	public static void main(String[] args) {
		System.out.println("\t购物清单");
		System.out.print("商品名称\t");
		System.out.print("购买数量\t");
		System.out.print("商品单价\t");
		System.out.print("金额\n");
		
		System.out.print("鳄鱼夹克\t");
		System.out.print("  1\t");
		System.out.print("1900\t");
		System.out.print("1900\n");
		
		System.out.print("ipodMP4\t");
		System.out.print("  2\t");
		System.out.print("400\t");
		System.out.print("800\n");
	}
}

```

```
public class LoginMenu {
	/*
	 * 显示系统登录菜单
	 */
	public static void main(String[] args) {
		System.out.println("\n\n\t\t\t欢迎使用我行我素购物管理系统\n\n");
		System.out.println("\t\t\t\t 1. 登 录 系 统\n\n");
		System.out.println("\t\t\t\t 2. 退 出\n\n");
		System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n");
		System.out.print("请选择,输入数字:");
	}
}
```

```
public class MainMenu {
	/*
	 * 显示系统主菜单
	 */
	public static void main(String[] args) {
		System.out.println("\n\n\t\t\t\t欢迎使用我行我素购物管理系统\n");
		System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n");
		System.out.println("\t\t\t\t 1. 客 户 信 息 管 理\n");
		System.out.println("\t\t\t\t 2. 购 物 结 算\n");
		System.out.println("\t\t\t\t 3. 真 情 回 馈\n");
		System.out.println("\t\t\t\t 4. 注 销\n");
		System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n");
		System.out.print("请选择,输入数字:");
	}
}

```

![image-20210810163015357](C:\Users\86183\AppData\Roaming\Typora\typora-user-images\image-20210810163015357.png)

```
eclipse配置jdk
```

https://jingyan.baidu.com/article/d45ad148880ca769552b8009.html

```
eclipse配置Tomcat https://blog.csdn.net/qq_34231010/article/details/78926031
```

