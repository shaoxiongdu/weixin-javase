package work;

import javafx.scene.transform.Scale;

import java.util.Scanner;

/**
 * @author: 杜少雄 https://github.com/shaoxiongdu
 * @date: 2021/08/19
 * @description:
 */
public class Work19 {

    public static void main(String[] args) {

        int count = 0;

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("欢迎光临第" + (i+1) + "家专卖店");

            while (true){

                System.out.print("要离开吗(y/n) ? : ");

                if(scanner.next().equals("y")){
                    System.out.println("离店结账");
                    break;
                }else {
                    System.out.println("买了一件衣服");
                    count++;
                }

            }

        }
        System.out.println("总共买了" + count + "件衣服");

    }

}
