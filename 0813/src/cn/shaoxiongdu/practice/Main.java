package cn.shaoxiongdu.practice;

import java.util.Scanner;

/**
 * @author: 杜少雄 https://github.com/shaoxiongdu
 * @date: 2021/08/13
 * @description: switch的课堂测试
 */
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("拨号:");

        int input = scanner.nextInt();

        switch (input){

            default:
                System.out.println("123");
                break;

            case 1 :
                System.out.println("拨爸爸的号");
                break;
            case 2 :
                System.out.println("拨妈妈的号");
                break;
            case 3 :
                System.out.println("拨爷爷的号");
                break;
            case 4 :
                System.out.println("拨奶奶的号");
                break;

        }


    }

}
