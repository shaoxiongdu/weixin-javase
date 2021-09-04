package cn.shaoxiongdu.work;

import java.util.Scanner;

/**
 * @author: 杜少雄 https://github.com/shaoxiongdu
 * @date: 2021/08/13
 * @description:
 */
public class Work4 {

    public static void main(String[] args) {

        System.out.println("欢迎使用MyShopping管理系统!");
        System.out.println("*****************************************");
        System.out.println("1. 客户信息管理");
        System.out.println("2. 购物结算");
        System.out.println("3. 真情回馈");
        System.out.println("4. 注销");
        System.out.println("*****************************************");

        int n = -1;
        Scanner scanner = new Scanner(System.in);
        System.out.print( "请选择, 输入数字: ");
        n = scanner.nextInt();
        while (n > 4 || n < 1){
            System.out.print("输入错误，重新输入: ");
            n = scanner.nextInt();
        }

        switch (n){
            case 1 :
                System.out.println("执行客户信息管理");
                break;
            case 2 :
                System.out.println("执行购物结算");
                break;
            case 3 :
                System.out.println("执行真情回馈");
                break;
            case 4 :
                System.out.println("执行注销");
                break;
        }

        System.out.println("程序结束!");


    }

}
