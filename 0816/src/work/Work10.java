package work;

import java.util.Scanner;

/**
 * @author: 杜少雄 https://github.com/shaoxiongdu
 * @date: 2021/08/16
 * @description: 判断是否为素数
 */
public class Work10 {

    public static void main(String[] args) {

        int n = new Scanner(System.in).nextInt();

        if(n < 2) {
            System.out.println("不是素数");
            return;
        }
        if(n == 2 || n % 2 == 0){
            System.out.println("是素数");
            return;
        }

        boolean isSu = true;

        for (int i = 2; i < n; i++) {
            if(n % i == 0){
                isSu = false;
                break;
            }
        }

        if(isSu){
            System.out.println("是素数");
        }else {
            System.out.println("不是素数");
        }

    }

}
