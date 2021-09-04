package cn.shaoxiongdu.practice;

import java.util.Scanner;

/**
 * @author: 杜少雄 https://github.com/shaoxiongdu
 * @date: 2021/08/11
 * @description:
 */
public class Work {

    public static void main(String[] args) {

        //定义Scanner输入流
        Scanner scanner = new Scanner(System.in);

        //定义变量
        int math,chinese,english;

        //读取数据
        System.out.print("请输入数学成绩: ");
        math = scanner.nextInt();
        System.out.print("请输入语文成绩: ");
        chinese = scanner.nextInt();
        System.out.print("请输入英语成绩: ");
        english = scanner.nextInt();

        //显示数据
        System.out.println("-----------------------------");
        System.out.println("数学成绩:" + math);
        System.out.println("语文成绩:" + chinese);
        System.out.println("英语成绩:" + english);
        System.out.println("-----------------------------");

        //计算数据
        System.out.println("数学和语文成绩之差为:" + (math - chinese));

        System.out.printf("三门课的平均成绩为%.2f\n",(math + chinese + english) / 3.0 );

    }

}
