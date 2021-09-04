package cn.shaoxiongdu.work;

import java.util.Scanner;

/**
 * @author: 杜少雄 https://github.com/shaoxiongdu
 * @date: 2021/08/12
 * @description:
 */
public class Work5 {

    public static void main(String[] args) {

        System.out.println("请输入是否是会员: ");

        Scanner scanner = new Scanner(System.in);

        String isVip = scanner.next();

        System.out.println("请输入购物金额 :");
        double money = scanner.nextDouble();

        if(isVip.equals("y")){
            if(money > 200){
                System.out.println("实际支付:" + money * 0.75);
            }else {
                System.out.println("实际支付:" + money * 0.8);
            }
        }else {
            if(money > 100){
                System.out.println("实际支付" + money * 0.9);
            }else {
                System.out.println("实际支付:" + money);
            }
        }

    }

}
