package cn.shaoxiongdu.practice;

import java.util.Scanner;

/**
 * @author: 杜少雄 https://github.com/shaoxiongdu
 * @date: 2021/08/12
 * @description:
 */
public class Pay {

    public static void main(String[] args) {

        //土豆
        double potato = 2.0;

        //西红柿
        double tomato = 3.0;

        //黄金
        double gold = 345.8;

        //笔记本
        double computer = 3999.99;

        //桌子
        double table = 50.34;

        //总价
        double total = potato + table + gold + computer + table;

        System.out.print("折扣:");

        //折扣
        double discount = new Scanner(System.in).nextDouble();

        //优惠价
        double preferential = discount * total;

        System.out.printf("原价:%f，优惠:%f",total,discount,preferential);

    }

}
