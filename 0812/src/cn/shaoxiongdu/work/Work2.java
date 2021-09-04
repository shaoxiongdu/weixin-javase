package cn.shaoxiongdu.work;

import java.util.Scanner;

/**
 * @author: 杜少雄 https://github.com/shaoxiongdu
 * @date: 2021/08/12
 * @description:
 */
public class Work2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入余额: ");

        long balance = scanner.nextLong();

        if(balance > 5000000){
            System.out.println("买凯迪拉克");
        }else if(balance > 1000000){
            System.out.println("买帕萨特");
        }else if(balance > 500000){
            System.out.println("买伊兰特");
        }else if(balance > 100000){
            System.out.println("买奥托");
        }else {
            System.out.println("买捷安特");
        }

    }

}
