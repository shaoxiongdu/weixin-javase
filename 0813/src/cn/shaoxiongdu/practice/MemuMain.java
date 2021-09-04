package cn.shaoxiongdu.practice;

import java.util.Scanner;

/**
 * @author: 杜少雄 https://github.com/shaoxiongdu
 * @date: 2021/08/13
 * @description:
 */
public class MemuMain {

    public static void main(String[] args) {

        System.out.println("\t登陆菜单");
        System.out.println("\t1.登陆系统");
        System.out.println("\t2.退出");

        Scanner scanner = new Scanner(System.in);

        switch (scanner.nextInt()){
            case 1  :
                System.out.println("\t主菜单");
                System.out.println("\t1.客户信息管理");
                System.out.println("\t2.购物结算");
                System.out.println("\t3.真情回馈");
                System.out.println("\t4.注销");

                switch (scanner.nextInt()){
                    case 1 :
                        System.out.println("\t1.显示所有客户信息");
                        System.out.println("\t2.添加客户信息");
                        System.out.println("\t3.修改客户信息");
                        System.out.println("\t4.查询客户信息");
                        break;

                    case 3 :
                        System.out.println("\t1.幸运大放送");
                        System.out.println("\t2.幸运抽奖");
                        System.out.println("\t3.生日问候");
                        break;
                    case 4 :
                        break;
                }
                break;
            case 2 :
                return;
        }


    }

}
