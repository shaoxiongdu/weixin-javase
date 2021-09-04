package cn.shaoxiongdu.work;

import java.util.Scanner;

/**
 * @author: 杜少雄 https://github.com/shaoxiongdu
 * @date: 2021/08/12
 * @description:
 */
public class Work1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("我行我素购物管理系统 > 客户信息管理 > 添加用户信息\n");
        System.out.print("请输入会员号(4位整数):");
        int number = scanner.nextInt();
        System.out.print("请输入会员生日(月/日<两位数表示>):");
        String birthday = scanner.next();
        System.out.print("请输入会员积分:");
        String score = scanner.next();

        System.out.println("已录入的会员信息:");
        System.out.println("卡号\t\t生日\t\t积分");
        System.out.println(number + "\t" + birthday + "\t" + score);



    }

}
