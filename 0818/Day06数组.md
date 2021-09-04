
# JavaSE阶段

## Day05

### 数组

#### 本课目标

掌握数组的声明和初始化

掌握数组元素访问及遍历

数组的应用（冒泡排序、选择排序、顺序查找，二分法查找）

#### 一维数组

问题：Java考试结束后，老师给张浩分配了一项任务，让他计算全班（30人）的平均分

30变量太繁琐不利于数据处理

数组是一个变量，存储相同数据类型的一组数据

![image-20210518164652021](C:\Users\86183\AppData\Roaming\Typora\typora-user-images\image-20210518164652021.png)

声明一个变量就是在内存空间划出一块合适的空间
声明一个数组就是在内存空间划出一串连续的空间

#### 数组概念

数组是保持固定数目的同一类的值的容器对象。元素可以是基本类型或引用类型、通过下标来访问元素、长度固定（length）

![image-20210525170751433](C:\Users\86183\AppData\Roaming\Typora\typora-user-images\image-20210525170751433.png)

数组中的每一项称为一个元素，每个元素都由其数字索引访问。如图，编号从0开始，例如第九个元素将在索引8处访问。

#### 数组基本要素

标识符：数组的名称，用于区分不同的数组
数组元素：向数组中存放的数据
元素下标：对数组元素进行编号，从0开始，数组中的每个元素都以通过下标来访问
元素类型：数组元素的数据类型  

![image-20210518164722153](C:\Users\86183\AppData\Roaming\Typora\typora-user-images\image-20210518164722153.png)

数组长度固定不变，避免数组越界

#### 使用数组

1、声明数组 int[ ] a;   

2、分配空间  a = new int[5];

3、赋值  a [0] = 8;  

4、处理数据 a [0] = a[0] * 10;      a[0]-80

#### 数组语法

##### 数组变量的声明及数组元素初始化

数组创建后我们需要记录这个连续空间的地址，然后才可以使用它，在java中需要通过引用型变量来存放地址，引用型变量需要声明

方式一：数据类型[] 数组名

方式二：数据类型 数组名 [] 

推荐方式一

```
public static void main(String [] args){
//基本数据类型
int age;
//声明数组变量(引用型变量)
int [] ages;
//创建数组 保存地址
ages=new int[5];
}
//数组元素初始化（第一次明确赋值）
ages[0]=1;
```

![image-20210528173931384](C:\Users\86183\AppData\Roaming\Typora\typora-user-images\image-20210528173931384.png)

1.创建一个4字节的内存空间，局部变量没有默认值，通过age来访问这个空间

2，声明一个变量，这个变量有区别于基本类型变量，这是个放地址的变量，这类型变量叫引用型变量

3.创建一个长度为5的数组；每个空间设置默认值；new操作符会返回一个地址，这个地址通过赋值运算符放入ages这个引用型变量中

基本类型变量：直接放值

引用型变量：放地址

#### 数组的其他语法

数组变量声明、数组创建整合

实际使用时可以将数组变量声明、数组创建整合为一条语句。

```
数组类型[]数组变量名=new 数组元素类型[5];
```

```
数组元素默认值：
整数型为0
浮点型为0.0
字符型为‘\u0000’不同系统的平台显示结果不同
布尔类型为false
引用类型为null
```

也可以创建数组时不指定长度，而使用元素值来取代

```
数组元素类型[] 数组名 =new 数组元素类型[]{元素0，元素1，...};
或者
数组元素类型[] 数组名 = {元素0，元素1，....};
```

有几个元素值，数组长度就是几；而且元素默认值是此处给出的值

##### 其他类型数组展示

```
byte[]ArrayOfBytes=new byte[10];
short[]ArrayOfShorts=new short[10];
long[]ArrayOfLongs=new long[10];
float[]ArrayOfFloats=new float[10];
double[]ArrayOfDoubles=new double[10];
boolean[]ArrayOfBooleans=new boolean[10];
char[]ArrayOfChars=new char[10];
String[]ArrayOfStrings=new String[10];
```

数组的使用
1.通过下标访问指定元素
 Java语言的数组索引(下标、角标)是从0开始的,数组的下标的最大长度-1
不要超出索引的范围，如果超出范围出现异常java.lang.ArrayIndexOutOfBoundsException
2.获取数组元素的个数
在Java中，所有数组都提供了一个length属性，通过这个属性可以访问到数组的长度
system.out.print1n(ages.length);
3.遍历数组
依次访i问数组中的每一个元素，获取每个下标对应的元素值

简单for循环

```
public static void main(practice.string[] args) {
int[] ages = new int[5];
//数据元素初始化
for (int i = 0; i < ages. length; i++) {
ages[i] = i;
}
//数据元素获取
for (int i = 0; i < ages. 1ength; i++){
system.out.println(ages[i]);
}
}

```

增强for循环(foreach)

for(声明语句：表达式){

//代码句子

}

- 声明语句：局部变量，改变量的类型必须和数组元素的类型匹配
- 表达式：表达式是要访问的数组名，或者是返回值为数组的方法

```
public static void main(practice.string[] args) {
int[] ages = new int[5];

//数据元素获取
for (int age: ages) {
system.out.println(age);
}
}
```

增强for循环在部分计算机语言中使用的是foreach关键字，Java不支持foreach关键字。增强for循环还可以用来遍历集合元素，后面章节学习

##### 1.声明数组  告诉计算机数据类型是什么

```
int[ ] score1;             //Java成绩
int score2[ ];             //C#成绩
String[ ] name;        //学生姓名
```

数据类型    数组名[ ] ; 

数据类型[ ]  数组名 ; 

声明数组时不规定数组长度

##### 2.分配空间  告诉计算机分配几个连续的空间

```
score = new int[30]; 
avgAge = new int[6];     
name = new String[30];
```

声明数组并分配空间

数据类型[ ]  数组名   =   new   数据类型[大小]  ;    

##### 3.赋值：向分配的格子里放数据

```
score[0] = 89;
score[1] = 79;
score[2] = 76;
……
```

##### 方法1：边声明边赋值

```
int[ ] score = {89, 79, 76};
int[ ] score = new int[ ]{89, 79, 76};
```

##### 方法2：动态地从键盘录入信息并赋值

```
Scanner input = new Scanner(System.in);
for(int i = 0; i < 30; i ++){
     score[i] = input.nextInt();
}
```



##### 4.对数据进行处理：计算5位学生的平均分

```
//方法一
int [ ] score = {60, 80, 90, 70, 85};
double avg;
avg = (score[0] + score[1] + score[2] + score[3] + score[4])/5;  
//方法二
int [ ] score = {60, 80, 90, 70, 85};
int sum = 0;
double avg;
for(int i = 0; i < score.length; i++){
     sum = sum + score[i];
}
avg = sum / score.length; 



```

```
//控制台输入成绩
public class ArrayDemo {

	/**
	 * 使用数组计算平均分
	 */
	public static void main(String[] args) {
		int[] scores = new int[5];	//成绩数组
		int sum = 0;				//成绩总和
		Scanner input = new Scanner(System.in);
		System.out.println("请输入5位学员的成绩：");
		for(int i = 0; i < scores.length; i++){
			scores[i] = input.nextInt();
			sum = sum + scores[i];	//成绩累加
		}
		//计算并输出平均分
		System.out.println("学员的平均分是：" + (double)sum/scores.length);
	}
}
```

$练习1显示商品名称  在控制台显示5件特价商品名称

创建一个长度为5的String数组，存储商品名称。

使用循环输出商品名称

![image-20210518170317978](C:\Users\86183\AppData\Roaming\Typora\typora-user-images\image-20210518170317978.png)

```
public class GoodsOutput {

	/**
	 * 输出商品名称
	 */
	public static void main(String[] args) {
		String[] goods = new String[]{"Nike背包","Adidas运动衫","李宁运动鞋","Kappa外套","361°腰包"};
		System.out.println("本次活动特价商品有：");
		for(int i = 0; i < goods.length; i++){
			System.out.println(goods[i]);
		}
	}
}
```

$练习2 购物金额结算  以表格的形式输出5笔购物金额及总金额

![image-20210518170421550](C:\Users\86183\AppData\Roaming\Typora\typora-user-images\image-20210518170421550.png)

实现：1.创建一个长度为5的
	double类型数组，
	存储购物金额。
2.循环输入五笔购物金额，
	并累加总金额。
3.利用循环输出五笔
	购物金额，最后输出总金额

```
public class ShoppingList {

	/**
	 * 购物金额结算
	 */
	public static void main(String[] args) {
		double[] cashes = new double[5];
		double sum = 0.0;	//总金额
		System.out.println("请输入会员本月的消费记录");
		Scanner input = new Scanner(System.in);
		//循环输入金额
		for(int i = 0; i < cashes.length; i++){
			System.out.print("请输入第" +(i+1)+ "笔购物金额：");
			cashes[i] = input.nextDouble();
			sum = sum + cashes[i];	//累加总金额
		}
		//循环输出每笔金额
		System.out.println("\n序号\t\t金额(元)");
		for(int i = 0; i < cashes.length; i++){
			System.out.println((i+1) + "\t\t" + cashes[i]);
		}
		System.out.println("总金额\t\t" + sum);
	}

}
```

#### 数组元素的排序

#### 冒泡排序

每次冒泡操作都会对相邻的两个元素进行比较，看是否满足大小关系要求。如果不满足就让它俩互换。一次冒泡会让至少一个元素移动到它应该在的位置，重复n次，就完成了n个数据的排序工作。
对一个有N个元素(如:5个元素)的数组进行冒泡排序的思路:
1.比较一对相邻元素(如: ages[0]、ages[1])
2.如果大小关系不符合规则(如规则: ages[0]<ages[1])，则交换数据

3.重复步骤1、2，直到数组末尾(最后比对的是ages[3]、ages[4])

4.重复步骤3，每次重复直到所有元素都以排序
1.初始数据

![image-20210529171057498](C:\Users\86183\AppData\Roaming\Typora\typora-user-images\image-20210529171057498.png)



2.第一次冒泡

![image-20210529171249682](C:\Users\86183\AppData\Roaming\Typora\typora-user-images\image-20210529171249682.png)

```
public static void main(practice.string[] args) {
int[] ages = {2,4,3,5,1};
int temp=0;
//第1次冒泡
for (int i = 0; i < ages . length-1; i++) {
if(ages[i]>ages[i+1]){
//交换位置，大的在后
temp=ages[i];
ages[i]=ages[i+1];
ages[i+1]=temp;
}
}
//第2次冒泡
for (int i = 0; i < ages . length-1-1; i++){
if(ages[i]>ages[i+1]){
//交换位置，大的在后
temp=ages[i];
ages[i]=ages[i+1];
ages[i+1]=temp;
}
}

```

3.多次冒泡

![image-20210529171548906](C:\Users\86183\AppData\Roaming\Typora\typora-user-images\image-20210529171548906.png)



```
//冒泡排序
import java.util.Scanner;
public class test3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp=0;
		int []score =new  int []{2,4,3,5,1};
		//重复多次冒泡，有几个元素就重复几次
		for(int i=0;i<score.length;i++) {
			//执行一次冒泡，将最大的元素放在对应位置上
			for( int j=0;j<score.length-1-i;j++) {
				if(score[j]>score[j+1]) {
					//交换位置，大的在后
					temp=score[j];
					score[j]=score[j+1];
					score[j+1]=temp;
					}
			}
		}
	for(int sorces:score) {
		System.out.println(sorces);
	}
		
	}
}
```

$arr=array(10,2,34,5,12,8,43);

![image-20210603175354832](C:\Users\86183\AppData\Roaming\Typora\typora-user-images\image-20210603175354832.png)

#### 插入排序（可选）

将数组中的数据分为两个区间，已排序区间和未排序区间。初始已排序区间只有一个元素，就是数组的第一个元素。插入算法的核心思想是取未排序区间中的元素，在已排序区间中找到合适的插入位置将其插入，并保证已排序区间数据一直有序。重复这个过程，直到未排序区间中元素为空，算法结束。
实现思路:
类似于打扑克时，发牌完成后整理自己手中牌的路子，假定最左侧第一个是排好序的，然后从未排序元素中取一个元素出来，按序插入到已排序的序列中。
1.初始数据
假设2是排好序的，也是已排序区间有一个元素

![](C:\Users\86183\AppData\Roaming\Typora\typora-user-images\image-20210529172424697.png)

2.第一次插入

![image-20210529172509072](C:\Users\86183\AppData\Roaming\Typora\typora-user-images\image-20210529172509072.png)

```
public static void main(practice.string[] args) {
int[] ages = {2,4,3,5,1};
//把待排序元素取出来，一来后继比对，二来空出一个位置来，便于后移
int value = ages[1];
//已排序区间的末尾下标
int j = 0;
//遍历已排序区间的元素，查找插入的位置
for (; j >= 0; --j) {
//如果当前已排序元素比要插入的元素大，则后移当前已排序元素
if (ages[j] > value) {
ages[j + 1] = ages[j];//数据移动
}else {//如果某个已排序元素比要插入的元素小，则找到了位置
break;
}
}
ages[j + 1] = value;//插入数据}
ages[j + 1] = ages[j];//数据移动
}else {//如果某个已排序元素比要插入的元素小，则找到了位置
break;
}
ages[j + 1] = value;//插入数据
}
```

3.第二次插入
从未排序区间取第一数据出来（待插入数据，如: 3)，保存到临时变量，作为本次要插入到已排序区间的数据，由后往前和已排序区间的数据比对，如果发现待插入数据比已排序区间的某个元素小，则已排序区间的那个元素后移，否则结束查找过程，当前位置的后一个即为插入位置。
本次插入的数据是3，已排序区间包执2、4}。3和4比对，发现4大，则4往后移动;3和2比对，发现3大，则结束比对，4和2中间的位置即为插入位置

![image-20210529172753774](C:\Users\86183\AppData\Roaming\Typora\typora-user-images\image-20210529172753774.png)

```
public static void main(practice.string[] args) {
int[] ages = {2,4，3,5,1};
//第一次插入
//把待排序元素取出来，一来后继比对，二来空出一个位置来，便于后移
int value = ages[1];
//已排序区间的末尾下标
int j = 0;
//遍历已排序区间的元素，查找插入的位置
for (; j >= 0; --j) {
//如果当前已排序元素比要插入的元素大，则后移当前已排序元素
if (ages[j] > value) {
ages[j + 1] = ages[j];//数据移动
}else {//如果某个已排序元素比要插入的元素小，则找到了位置
break;
}
}
ages[j + 1] = value; 
//插入数据
//第二次插入
value = ages[2];
j = 1;
for (; j >= 0; --j) {
if (ages[j] > value) {ages[j + 1] = ages[j];
}else {
break;
}
}
ages[j + 1] = value;
}

```

4.多次插入

![image-20210529173108762](C:\Users\86183\AppData\Roaming\Typora\typora-user-images\image-20210529173108762.png)



![image-20210529173211385](C:\Users\86183\AppData\Roaming\Typora\typora-user-images\image-20210529173211385.png)

```
//插入排序
public class test6 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []score= {2,4,3,5,1};
		for(int i=1;i<score.length;i++) {
			int a=score[i];//分割点 下一个要排序的对象
			int j=i-1;
			for(;j>=0;j--) {
				if(score[j]>a) {//当前比后插入大时  后移它
					score[j+1]=score[j];//移动位置
				}else {
					//找到合适的位置了
					break;
				}
			}
			score[j+1]=a;
		}
		for(int b:score) {
			System.out.print(b);
		}
	}
}

```



#### 选择排序（可选）

![image-20210529173340222](C:\Users\86183\AppData\Roaming\Typora\typora-user-images\image-20210529173340222.png)

![

](C:\Users\86183\AppData\Roaming\Typora\typora-user-images\image-20210529173400310.png)

![image-20210529173527068](C:\Users\86183\AppData\Roaming\Typora\typora-user-images\image-20210529173527068.png)

![image-20210529173548678](C:\Users\86183\AppData\Roaming\Typora\typora-user-images\image-20210529173548678.png)

![image-20210529173729075](C:\Users\86183\AppData\Roaming\Typora\typora-user-images\image-20210529173729075.png)

4，第n次选择

从未排序区间找出最小的数，然后放入到已排序区间的末尾

![image-20210529173856495](C:\Users\86183\AppData\Roaming\Typora\typora-user-images\image-20210529173856495.png)

![image-20210529173923640](C:\Users\86183\AppData\Roaming\Typora\typora-user-images\image-20210529173923640.png)

#### 数组元素的查找

#### 顺序查找

遍历整个数组，依次把每一位元素和要查找的数据进行比较示例:

```
//数组顺序查找
import java.util.Scanner;

public class test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []score= {2,4,3,5,1};
		//查找值
		int value=4;
		
		for(int i=0;i<score.length;i++) {
			if(value==score[i]) {
				System.out.println("找到了"+i);
				return;
			}
			
		}
	System.out.println("没找到");
		
	}
}
```

#### 二分法查找

二分查找(Binary Search）)算法，也叫折半查找算法。前提是数组是有序(升序或者降序)的，将待查找的元素与中间下标对应的元素比较，如果大于中间下标对应的元素，则去右半部分查找。直到找到要查找的元素，或者区间被缩小为0。

![image-20210529174242222](C:\Users\86183\AppData\Roaming\Typora\typora-user-images\image-20210529174242222.png)

```
//二分法查找
import java.util.Scanner;
public class test8 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []score= {1,2,3,4,5};
		//查找值
		int value=4;
		int  low =0;
		int  high=score.length-1;
		while(low<=high) {
			int mid =(low+high)/2;
			if(score[mid]==value) {
				System.out.println("找到了"+mid);
				return;
			}else if(score[mid]<value) {
				low=mid+1;
			}else {
				high=mid-1;
			}
		}
		System.out.println("没找到");
		
	}
}
```



#### 数组排序练习

问题：循环录入5位学员成绩，进行升序排列后输出结果

方法一：

```
//五个学生成绩升序
public class test9 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []score=new int [5];
		Scanner intput =new Scanner(System.in);
		System.out.println("请输入五位同学成绩：");
		for(int i=0;i<score.length;i++) {
			score[i]=intput.nextInt();
			}
			for(int k=0;k<score.length;k++) {

			for(int j=k+1;j<score.length;j++) {
				if(score[j]<score[k]) {
					int temp=score[k];
					score[k]=score[j];
					score[j]=temp;
					}
			}
			}
		for(int scores:score) {
			System.out.println("排序结果："+scores);
		}
	}
}
```

方法二：五个学生成绩升序

```
public class ScoreSort {
	public static void main(String[] args) {
		int[] scores = new int[5];	//成绩数组
		Scanner input = new Scanner(System.in);
		System.out.println("请输入5位学员的成绩：");
		//循环录入学员成绩
		for(int i = 0; i < scores.length; i++){
			scores[i] = input.nextInt();
		}
		Arrays.sort(scores);	//对数组进行升序排序
		System.out.print("学员成绩按升序排列：");
		//利用循环输出学员成绩
		for(int i = 0; i < scores.length; i++){
			System.out.print(scores[i] + " ");
		}
	}
}
```

#### 数组求最大值练习

$练习 从键盘输入本次Java考试五位学生的成绩，求考试成绩最高分

```
/**
	 * 求数组最大值
	 */
	public static void main(String[] args) {
		int[] scores = new int[5];
		int max = 0;	//记录最大值
		System.out.println("请输入5位学员的成绩：");
		Scanner input = new Scanner(System.in);
		for(int i = 0; i < scores.length; i++){
			scores[i] = input.nextInt();
		}
		//计算最大值
		max = scores[0];
		for(int i = 1; i < scores.length; i++){
			if(scores[i] > max){
				max = scores[i];
			}
		}
		System.out.println("考试成绩最高分为：" + max);
	}
}
```

#### 插入算法练习

有一组学员的成绩{99，85，82，63， 60}，将它们按降序排列。要增加一个学员的成绩，将它插入成绩序列，并保持降序。

将成绩序列保存在长度为6的数组中
通过比较找到插入位置
将该位置后的元素后移一个位置
将增加的学员成绩插入到该位置

![image-20210525165801589](C:\Users\86183\AppData\Roaming\Typora\typora-user-images\image-20210525165801589.png)

```
public class Insert {

	public static void main(String[] args) {
		int[] list = new int[6]; // 长度为为6的数组
			list[0] = 99;
			list[1] = 85;
			list[2] = 82;
			list[3] = 63;
			list[4] = 60;

			int index = list.length;	//保存新增成绩插入位置
			System.out.println("请输入新增成绩： ");
			Scanner input = new Scanner(System.in);
			int num = input.nextInt(); // 输入要插入的数据
			//找到新元素的插入位置
	        for(int i = 0; i < list.length; i++){
	            if(num > list[i]){
	                index = i;
	                break;
	            }
	        }			
			 //元素后移
	        for(int j = list.length-1; j > index; j--){
	            list[j] = list[j-1];	//index下标开始的元素后移一个位置
	        }
			list[index] = num;//插入数据
			System.out.println("插入成绩的下标是："+index);
			System.out.println("插入后的成绩信息是： ");
			for (int k = 0; k < list.length; k++) { // 循环输出目前数组中的数据
				System.out.print(list[k] + "\t");
			}

	}

}

```

#### 字符逆序输出练习

将 一组乱序的字符进行排序  进行升序和逆序输出  

步骤：
1.创建数组存储原字符序列。
2.利用Array类的sort( )方法对数组进行排序，并循环输出。

3. 从最后一个元素开始，将数组中的元素逆序输出。
4. ![image-20210525165814189](C:\Users\86183\AppData\Roaming\Typora\typora-user-images\image-20210525165814189.png)

```
public class CharsSort {

	/**
	 * 字符逆序输出
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] chars = new char[]{'a','c','u','b','e','p','f','z'};
//用不同数据类型尝试方法		int[] chars = new int[]{3,1,23,98,67};
//		String[] chars = new String[]{"h","r","s"};
		System.out.print("原字符序列：");
		for(int i = 0; i < chars.length; i++){
			System.out.print(chars[i] + " ");
		}
		Arrays.sort(chars);		//对数组进行升序排序
		System.out.print("\n升序排序后：");
		for(int i = 0; i < chars.length; i++){
			System.out.print(chars[i] + " ");
		}
		System.out.print("\n逆序输出为：");
		for(int i = chars.length-1; i >= 0; i--){
			System.out.print(chars[i] + " ");
		}

	}
}
```

Java的Arrays类中有一个sort()方法，该方法是Arrays类的静态方法，在需要对数组进行排序时使用

#### 向有序序列中插入字符练习

在上一个练习的基础上改进：
	向上一个练习中得到的升序字符序列中插入一个新的字符，要求插入之后字符序列仍保持有序

![image-20210525165834348](C:\Users\86183\AppData\Roaming\Typora\typora-user-images\image-20210525165834348.png)

```
public class Insert {

	public static void main(String[] args) {
		//字符排序
		char[] chars = new char[9];
		
		chars[0] = 'a';
		chars[1] = 'c';
		chars[2] = 'u';
		chars[3] = 'b';
		chars[4] = 'e';
		chars[5] = 'p';
		chars[6] = 'f';
		chars[7] = 'z';

		System.out.print("原字符序列：");
		for(int i = 0; i < chars.length; i++){
			System.out.print(chars[i] + " ");
		}
		Arrays.sort(chars);		//对数组进行升序排序
		System.out.print("\n升序排序后：");
		for(int i = 0; i < chars.length; i++){
			System.out.print(chars[i] + " ");
		}
		
		//实现插入字符
		int index = chars.length;	//保存新增成绩插入位置
		char ch='m';
		System.out.println("\n待插入的字符是： "+ch);
	
		//找到新元素的插入位置
        for(int i = 0; i < chars.length; i++){
            if(ch < chars[i]){
                index = i;
                break;
            }
        }			
		 //元素后移
        for(int j = chars.length-1; j > index; j--){
        	chars[j] = chars[j-1];	//index下标开始的元素后移一个位置
        }
        chars[index] = ch;//插入数据
		System.out.println("插入字符的下标是："+index);
		System.out.print("插入后的字符序列是： ");
		for (int k = 0; k < chars.length; k++) { // 循环输出目前数组中的数据
			System.out.print(chars[k] + " ");
		}


	}

}
```

#### 求最低价格练习

1.定义数组存储价格，并利用循环输入。
2.定义变量min保存当前的最低价。

3. 将min和数组中的其余元素依次比较。

![image-20210525165938101](C:\Users\86183\AppData\Roaming\Typora\typora-user-images\image-20210525165938101.png)

```
public class MinPrice {

	/**
	 * 输出最低价格
	 */
	public static void main(String[] args) {
		int[] prices = new int[4];
		System.out.println("请输入4家店的价格");
		Scanner input =  new Scanner(System.in);
		for(int i = 0; i < prices.length; i++){
			System.out.print("第" +(i+1)+ "店的价格：");
			prices[i] = input.nextInt();
		}
		//计算最低价
		int min = prices[0];
		for(int i = 1; i < prices.length; i++){
			if(prices[i] < min){
				min = prices[i];
			}
		}
		System.out.println("最低价格是：" + min);	
	}
}
```

中文：https://visualgo.net/zh

英文：https://visualgo.net

VisuAlgo是一个数据结构与算法动态可视化站点，可以用于各种数据结构的算法的学习

