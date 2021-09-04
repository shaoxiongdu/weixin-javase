package cn.shaoxiongdu.work;

import java.util.Scanner;

/**
 * @author: 杜少雄 https://github.com/shaoxiongdu
 * @date: 2021/08/11
 * @description: 判断一个四位数的各位之和是否大于20
 */
public class Work3 {

    public static void main(String[] args) {

        //提示
        System.out.print("请输入4位会员卡号: ");

        //输入卡号
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        int sum = 0,temp = number;
        //判断
        while (temp != 0){
            //累加最后一位
            sum += temp % 10;
            //去掉最后一位
            temp = temp / 10;
        }

        //输出
        System.out.println("会员卡号" + number + "各位之和:" + sum);
        System.out.println("是幸运顾客吗?" + (sum > 20) );

        //防止内存泄露
        input.close();

    }

}
