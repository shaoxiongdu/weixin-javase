package cn.shaoxiongdu.work;

import java.util.Scanner;

/**
 * @author: 杜少雄 https://github.com/shaoxiongdu
 * @date: 2021/08/12
 * @description:
 */
public class Work4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("小明的成绩: ");

        int score = scanner.nextInt();

        if(score == 100){
            System.out.println("买车");
        }else if(score >= 90){
            System.out.println("买MP4");
        }else if(score >= 60){
            System.out.println("买参考书");
        }else{
            System.out.println("什么也不买");
        }

    }

}
