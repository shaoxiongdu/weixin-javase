package cn.shaoxiongdu.work;

import java.util.Scanner;

/**
 * @author: 杜少雄 https://github.com/shaoxiongdu
 * @date: 2021/08/13
 * @description:
 */
public abstract class Work1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入消费金额: ");
        int consumption = scanner.nextInt();

        System.out.println("是否参加优惠换购活动: ");
        System.out.println("1: 满50元，加2元换购百事可乐1瓶");
        System.out.println("2: 满100元，加3元换购500ml可乐一瓶");
        System.out.println("3: 满100元，加10元换购5公斤面粉");
        System.out.println("4: 满200元，加10元换购1个苏泊尔炒菜锅");
        System.out.println("5: 满200元，加20元换购欧莱雅爽肤水一瓶");
        System.out.println("0: 不换购");

        System.out.print("请选择: ");

        int select = scanner.nextInt();

        switch (select) {
            case 0:
                System.out.println("本次消费总金额: " + consumption);
                System.out.println("没有选择换购!");
                break;
            case 1:
                if (consumption >= 50) {
                    System.out.println("本次消费总金额: " + (consumption + 2));
                    System.out.println("成功换购: 百事可乐1瓶");
                } else {
                    System.out.println("本次消费总金额: " + consumption);
                    System.out.println("消费金额不足，无法换购");
                }
                break;
            case 2:
                if (consumption >= 100) {
                    System.out.println("本次消费总金额: " + (consumption + 3));
                    System.out.println("成功换购: 500ml可乐一瓶");
                } else {
                    System.out.println("本次消费总金额: " + consumption);
                    System.out.println("消费金额不足，无法换购");
                }
                break;

            case 3:
                if (consumption >= 100) {
                    System.out.println("本次消费总金额: " + (consumption + 10));
                    System.out.println("成功换购: 5公斤面粉");
                } else {
                    System.out.println("本次消费总金额: " + consumption);
                    System.out.println("消费金额不足，无法换购");
                }
                break;

            case 4:
                if (consumption >= 200) {
                    System.out.println("本次消费总金额: " + (consumption + 10));
                    System.out.println("成功换购: 1个苏泊尔炒菜锅");
                } else {
                    System.out.println("本次消费总金额: " + consumption);
                    System.out.println("消费金额不足，无法换购");
                }
                break;

            case 5:
                if (consumption >= 200) {
                    System.out.println("本次消费总金额: " + (consumption + 20));
                    System.out.println("成功换购: 欧莱雅爽肤水一瓶");
                } else {
                    System.out.println("本次消费总金额: " + consumption);
                    System.out.println("消费金额不足，无法换购");
                }
                break;
        }


    }

}
