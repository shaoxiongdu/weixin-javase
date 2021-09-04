package work;

import java.util.Scanner;

/**
 * @author: 杜少雄 https://github.com/shaoxiongdu
 * @date: 2021/08/19
 * @description:
 */
public class Work13 {

    public static void main(String[] args) {

        System.out.print("请输入直角三角形的行数: ");

        int m = new Scanner(System.in).nextInt();

        for (int i = m; i >= 0; i--) {

            for (int j = 0; j < i; j++) {

                System.out.print("*");

            }

            System.out.println();

        }


    }

}
