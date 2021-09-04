package practice;

import java.util.Scanner;

/**
 * @author: 杜少雄 https://github.com/shaoxiongdu
 * @date: 2021/08/16
 * @description:
 */
public class Test {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int max = scanner.nextInt();

        for (int n1=0,n2=max;n1 < max;n1++,n2--){
            System.out.println(n1 + "+" + n2 + "=" + (n1 + n2));
        }



    }


}
