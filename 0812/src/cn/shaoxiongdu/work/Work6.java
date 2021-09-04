package cn.shaoxiongdu.work;

import java.util.Scanner;

/**
 * @author: 杜少雄 https://github.com/shaoxiongdu
 * @date: 2021/08/12
 * @description:
 */
public class Work6 {

    public static void main(String[] args) {

        System.out.println("请输入积分: ");

        int x = new Scanner(System.in).nextInt();

        if(x < 2000){
            System.out.println("9折");
        }else if(x < 4000){
            System.out.println("8折");
        }else if(x < 8000){
            System.out.println("7折");
        }else{
            System.out.println("6折");
        }

    }

}
