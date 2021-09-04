package cn.shaoxiongdu.practice;

import java.util.Scanner;

/**
 * @author: 杜少雄 https://github.com/shaoxiongdu
 * @date: 2021/08/12
 * @description:
 */
public class branch {

    public static void main(String[] args) {

        int a = 6;
        int b = 3;

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println(a);



    }

}
