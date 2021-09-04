package cn.shaoxiongdu.practice;

import java.util.Random;
import java.util.Scanner;

/**
 * @author: 杜少雄 https://github.com/shaoxiongdu
 * @date: 2021/08/12
 * @description: 判断折扣价格
 */
public class judgmentDiscount {

    public static void main(String[] args) {

        int tx = 245, wqx = 570, wqp = 320;

        System.out.println("请输入折扣:");
        double discount = new Scanner(System.in).nextDouble();
        System.out.println("体恤的折扣价低于100吗?" + (tx * discount < 100));
        System.out.println("网球鞋的折扣价低于100吗?" + (wqx * discount < 100));
        System.out.println("网球拍的折扣价低于100吗?" + (wqp * discount < 100));




    }

}
