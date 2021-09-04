package cn.shaoxiongdu.practice;

import java.util.Scanner;

/**
 * @author: 杜少雄 https://github.com/shaoxiongdu
 * @date: 2021/08/13
 * @description:
 */
public class Qualified {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = null;

        while (true){

            System.out.print("合格了吗? :");

            input = scanner.next();

            if("y".equals(input)){
                break;
            }
            System.out.println("上午...");

            System.out.println("下午...");

        }

        System.out.println("玩去吧！");

    }

}
